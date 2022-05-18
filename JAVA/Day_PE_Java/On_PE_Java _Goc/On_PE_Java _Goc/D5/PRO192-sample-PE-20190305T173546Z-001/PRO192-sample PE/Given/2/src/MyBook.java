
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
public class MyBook implements IBook{

    @Override
    public String f1(ArrayList<Book> a) {
        return a.get(0).getName();
    }

    @Override
    public int f2(ArrayList<Book> a, int price) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).price >= price) {
                count++;
            }
        }
        return count;
                
    }
    
}
