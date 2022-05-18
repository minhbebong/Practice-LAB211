/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Food extends Product{
    String date;
    int expireDate;

    public Food() {
    }

    public Food(String code, String name, double price, int quantity,String date, int expireDate) {
        super(code, name, price, quantity);
        this.date = date;
        this.expireDate = expireDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(int expireDate) {
        this.expireDate = expireDate;
    }

    public double getPrice() {
         if(getQuantity()<=4){
             return price;
         }else{
            return price-price*0.1; 
         }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+date + "\t" + expireDate;
    }
    
    
    
    
    
}
