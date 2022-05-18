
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyProduct implements IProduct{

    @Override
    public String f1(ArrayList<Product> a) {
        double highestprice = 0;
        double avgPrice = 0;
        String categoryOfhighestPrice = "";
        for (int i = 0; i < a.size() - 1; i++) {
            int sum = a.get(i).price;
            int quantity = 1;
            for (int j = i + 1; j < a.size(); j++) {

                if (a.get(i).catID.equals(a.get(j).catID)) {
                    sum = sum + a.get(j).price;
                    quantity++;
                }

            }
            avgPrice = (double) sum / quantity;
            if (avgPrice > highestprice) {
                highestprice = avgPrice;
                categoryOfhighestPrice = a.get(i).catID;
            }
        }
        return categoryOfhighestPrice;
    }

    @Override
    public int f2(ArrayList<Product> a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
