
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
public class MyService implements IService{

    @Override
    public double f1(List<Service> list, double d) {
        double sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).rate>=d){
                sum+=list.get(i).rate;
            }
        }
        return sum;
    }

    @Override
    public int f2(List<Service> list, String string) {
        int count=0;
       for(int i=0;i<list.size();i++){
           if(list.get(i).country.equalsIgnoreCase(string)){
               count++;
           }
       }
       return count;
    }

    @Override
    public void f3(List<Service> list, String string) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).country.toLowerCase().contains(string.toLowerCase())){
                System.out.println(list.get(i).toString());
            }
        }
    }
    
}
