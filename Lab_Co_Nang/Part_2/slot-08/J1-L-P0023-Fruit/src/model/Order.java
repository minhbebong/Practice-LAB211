/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Order {
     private String nameCustomer;
    private List<Fruit> listFruit;

    public Order(String nameCustomer, List<Fruit> listFruit) {
        this.nameCustomer = nameCustomer;
        this.listFruit = listFruit;
    }

    
    
    public String getNameCustomer() {
        return nameCustomer;
    }
    
    
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
    
    public List<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }
    
     
    public void addFruitToOrder(Fruit orderFruit) {
        listFruit.add(orderFruit);
    }
    
    public void displayListFruit() {
        System.out.printf("%-15s|%-15s|%-15s|%-15s\n", "Product", "Quantity", "Price", "Amount");
            for (int i = 1; i <= listFruit.size(); i++) {
                System.out.printf(i + ".%-15s|%-15s|%-15s|%-15s\n", listFruit.get(i - 1).getName(),
                        listFruit.get(i - 1).getQuantity(),
                        listFruit.get(i - 1).getPrice(),
                        listFruit.get(i - 1).getAmount());
            }
    }
    
    public double getTotal() { // total bill
        double total = 0;
        double temp;
        for (int i = 0; i < listFruit.size(); i++) {
            temp = listFruit.get(i).getPrice() * listFruit.get(i).getQuantity();
            total += temp;
        }
        return total;
    }
}
