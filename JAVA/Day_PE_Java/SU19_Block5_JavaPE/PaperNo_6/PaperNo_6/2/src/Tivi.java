/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Tivi {
    double price;
    String type;

    public Tivi() {
    }

    public Tivi(String type,double price) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type+" "+price;
    }
    
}
