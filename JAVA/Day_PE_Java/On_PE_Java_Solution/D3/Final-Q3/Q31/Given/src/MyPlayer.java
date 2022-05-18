
import java.io.BufferedReader;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyPlayer implements IPlayer{

    @Override
    public double f1(List<Player> list, boolean joined) {
        double sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).joined==joined){
                sum+=list.get(i).income;
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Player> list, int y) {
        double maxIncome=0;
           for(int i=0;i<list.size();i++){
               int year = Integer.parseInt(list.get(i).dob.substring(list.get(i).dob.lastIndexOf("/")+1));
               if(year==y){
                   maxIncome=list.get(i).income;
                   break;
               }
           }
           for(int i=0;i<list.size();i++){
               int year = Integer.parseInt(list.get(i).dob.substring(list.get(i).dob.lastIndexOf("/")+1));
               if(year==y&&maxIncome<list.get(i).income){
                   maxIncome=list.get(i).income;
               }
           }
           for(int i=0;i<list.size();i++){
               if(list.get(i).income==maxIncome){
                   System.out.println(list.get(i).toString());
               }
           }
           
    }

    @Override
    public void f3(List<Player> list, Player p, int pos) {
        list.set(pos, p);    
    }
    
}
