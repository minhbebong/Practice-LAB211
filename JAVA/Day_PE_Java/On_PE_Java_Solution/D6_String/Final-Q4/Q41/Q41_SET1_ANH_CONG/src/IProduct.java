import java.util.ArrayList;
/*
 * DO NOT EDIT THIS FILE
 */
public interface IProduct { 
    /*
     * calculate and return last category id of 
     * product that have highest average price in it
     */
    public String f1(ArrayList<Product> a);        
   
    /*
     * calculate and return the number of products in the list a that have 
     * price greater than or equals to 20
     */
    public int f2(ArrayList<Product> a);
}