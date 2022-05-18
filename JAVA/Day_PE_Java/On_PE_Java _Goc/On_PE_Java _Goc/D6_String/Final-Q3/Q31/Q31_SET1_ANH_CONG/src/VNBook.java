/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class VNBook extends Book{
    String code;

    public VNBook() {
    }

    public VNBook(String code) {
        this.code = code;
    }

    public VNBook(String name, int price,String code) {
        super(name, price);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        double saleprice = price;
        if(code.charAt(0)!='D'|| code.charAt(0)!='d'){
            saleprice = price + 0.1*price;
        }
        saleprice=(double)Math.round(saleprice*100)/100;
        return super.toString() + "\t" + saleprice;
    }
    
    
    
}
