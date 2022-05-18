/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ColorTivi extends Tivi{
    int serie;

    public ColorTivi() {
    }

    public ColorTivi(String type,int serie,  double price) {
        super(type, price);
        this.serie = serie;
    }

    public double getPrice() {
        if(serie>3000){
            price=price-price*0.1;
        }
        return price;
    }

    @Override
    public String toString() {
        return type+" "+serie+" "+price;
    }
    
    
    
    
    
}
