/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class VNCar extends Car{
    private int series;
    
    public VNCar(){
        
    }
    public VNCar(String name, double price, int series){
        super(name,price);
        this.series = series;
    }
    
    public double getSalePrice(){
        double price1;
        if (series < 300){
            price1 = 1.1*super.getPrice();
        }else price1 = super.getPrice();
        return price1;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    
    
    @Override
    public String toString(){
        return super.getName() + "\t" + super.getPrice() + "\t" + series;
    }
}
