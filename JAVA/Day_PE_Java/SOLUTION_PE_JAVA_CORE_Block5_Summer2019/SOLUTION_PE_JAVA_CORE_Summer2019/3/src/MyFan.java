
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> a, String code) {
        for(int i=0;i<a.size();i++){
            if(a.get(i).code.indexOf(code)==0){
                a.remove(i);
                i--;
            }
        }
    }

    @Override
    public int f2(List<Fan> a, double price) {
        int count=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).price<=price){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Fan> a, double price) {
        ArrayList<Fan> list = new ArrayList();
        for(int i=0;i<a.size();i++){
            if(a.get(i).price>=price){
                list.add(a.get(i));
                a.remove(i);
                i--;
            }
        }
        for(int i=0;i<a.size();i++){
            list.add(a.get(i));
        }
        while(a.size()!=0){
            a.remove(0);
        }
        for(int i=0;i<list.size();i++){
            a.add(list.get(i));
        }
    }
    
}
