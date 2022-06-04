/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manage;
import java.util.ArrayList;
import java.util.List;
import model.Fruit;
import model.Order;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Fruit {

    Manage manage = new Manage();

    void createFruit() {

        while (true) {
            //enter attribute
            String id = getIDInput();
            String name = getNameInput();
            double price = getPriceInput();
            int quantity = getQuantityInput();
            String origin = getOriginInput();

            if (manage.checkDuplicate(id)) {
                System.out.println("ID existed");
            } else {

                //check exist
                Fruit fruit = new Fruit(id, name, price, quantity, origin);
                manage.addFruit(fruit);
                System.out.println("Add successfull !!");
            }

            if (checkYesNo("continue") == false) {
                break;
            }
        }

    }

    void viewOrder() {
        for (Order order : manage.getListOrder()) {
            System.out.println("Customer: " + order.getNameCustomer());
            order.displayListFruit();
            System.out.printf("Total: %s$\n", order.getTotal());
        }
    }

    void shopping() {

        List<Fruit> listInvoice = new ArrayList<>();
//check list fruit is empty ???
        if (manage.getListFruit().size() == 0) {
            System.out.println("LIST FRUIT IS EMPTY");
            return;
        }
        while (true) {

            displayListFruit();
            //input item and display name of item
            String item = getIDInput();

            Fruit fruit = manage.getFruitByID(item);
            if (fruit == null) {
                System.out.println("NOT FOUND ");
                return;
            }

            System.out.println("You selected: " + fruit.getName());

            //input quantity
            int quantityOrder;
            while (true) {
                quantityOrder = getQuantityInput();
                if (quantityOrder <= fruit.getQuantity()) {
                    break;
                } else {
                    System.out.println("You only can buy from [0-" + fruit.getQuantity() + "]");
                }
            }

            //fruitOrder
            Fruit fruitOrder = new Fruit();
            fruitOrder.setId(item);
            fruitOrder.setName(fruit.getName());
            fruitOrder.setOrigin(fruit.getOrigin());
            fruitOrder.setPrice(fruit.getPrice());
            fruitOrder.setQuantity(quantityOrder);

            //set quantity remaining
            fruit.setQuantity(fruit.getQuantity() - quantityOrder);
            if (fruit.getQuantity() == 0) {
                manage.removeFruit(fruit);
            }
            
            //check fruit exist in list invoice
            Fruit fruitInList = manage.getFruitInList(fruitOrder, listInvoice);
            if (fruitInList != null) {
                fruitInList.setQuantity(fruitInList.getQuantity() + quantityOrder);
            }else {
                listInvoice.add(fruitOrder);
            }
            
            
            

            //check want to order now
            //if yes => display list invoice .... 
            if (checkYesNo("order now")) {
                break;
            }
            
            //check list fruit is empty ???
            if (manage.getListFruit().size() == 0) {
                System.out.println("LIST FRUIT IS EMPTY");
                break;
            }
        }

        displayListInvoice(listInvoice);
        String name = Ultility.getString("Input your name: ", "Wrong", Ultility.REGEX_STRING);

        //add order into listOrder
        manage.addOrder(name, listInvoice);

    }

    void displayListFruit() {
        System.out.println("\n\nList of Fruit:");
        System.out.printf("%-15s|%-15s|%-15s|%-15s\n", "Item", "Fruit name", "Origin", ""
                + "Price");
        for (Fruit fruit : manage.getListFruit()) {
            System.out.println(fruit);
        }

        System.out.println("\n");
    }

    /**
     * use to get ID from user
     *
     * @return id
     */
    private String getIDInput() {
        String id = Ultility.getString("Enter item: ", "It must letter or digit", Ultility.REGEX_STRING);
        return id;
    }

    /**
     * use to get name from user
     *
     * @return name
     */
    private String getNameInput() {
        String name = Ultility.getString("Enter name: ", "It must letter or digit", Ultility.REGEX_NAME);
        return name;
    }

    /**
     * use to get price from user
     *
     * @return price
     */
    private double getPriceInput() {
        double price = Ultility.getDouble("Enter price: ", "It must be real number", 0, Double.MAX_VALUE);
        return price;
    }

    /**
     * use to get quantity from user
     *
     * @return quantity
     */
    private int getQuantityInput() {
        int quantity = Ultility.getInt("Enter quantity: ", "It must be digit", 0, Integer.MAX_VALUE);
        return quantity;
    }

    /**
     * use to get origin from user
     *
     * @return origin
     */
    private String getOriginInput() {
        String origin = Ultility.getString("Enter origin: ", "It must letter or digit", Ultility.REGEX_STRING);
        return origin;
    }

    private boolean checkYesNo(String message) {

        String choice = Ultility.getString("Do you want to " + message + " (y/n)?: ", "You must enter Y/y or N/n!", Ultility.REGEX_YES_NO);
        if (choice.equalsIgnoreCase("y")) {
            return true;
        }
        return false;

    }

    private void displayListInvoice(List<Fruit> listInvoice) {
        int total = 0;
        for (Fruit fruit : listInvoice) {

            System.out.printf("%-15s|%-15s|%-15s|%-15s\n", "Product", "Quantity", "Price", "Amount");
            total += fruit.getAmount();
            System.out.printf("%-15s|%-15s|%-15s$|%-15s\n", fruit.getName(),
                    fruit.getQuantity(), fruit.getPrice(), fruit.getAmount());

        }
        System.out.println("Total: " + total + "$");
    }

    /**
     * display all fruit in list
     *
     * @param listFruit
     */
}
