/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Book {
    String code;
    String title;
    double price;
    int quantity;

    public Book() {
    }

    public Book(String code, String title, double price, int quantity) {
        this.code = code;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getCode() + "  " + title + " " + price + " " + quantity +"\t"+(quantity*price);
    }
    
    
    
}
