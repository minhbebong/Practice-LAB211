/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Fruit;
import model.Order;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Manage {
    List<Fruit> listFruits = new ArrayList<>();
    
    List<Order> listOrder = new ArrayList<Order>();
    
    
    public List<Fruit> getListFruit() {
        return listFruits;
    }
    
    public List<Order> getListOrder() {
        return listOrder;
    }

    public boolean checkDuplicate(String id) {
        for (Fruit fruit : listFruits) {
            if (fruit.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void addFruit(Fruit fruit) {
        listFruits.add(fruit);
    }

    public Fruit getFruitByID(String item) {
        for (Fruit fruit : listFruits) {
            if (fruit.getId().equalsIgnoreCase(item)) {
                return fruit;
            }
        }
        return null;
    }

    public void removeFruit(Fruit fruit) {
        listFruits.remove(fruit);
    }

    public void addOrder(String name, List<Fruit> listInvoice) {
        listOrder.add(new Order(name, listInvoice));
    }

    public Fruit getFruitInList(Fruit fruitOrder, List<Fruit> listInvoice) {
        for (Fruit fruit : listInvoice) {
            if (fruit.getId().equalsIgnoreCase(fruitOrder.getId())) {
                return fruit;
            }
        }
        return null;
    }
    
}
