/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class MyString implements IString{

    @Override
    public int sum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int c= Integer.parseInt(s.charAt(i)+"");
                if(c%2==0){
                    sum+=c;
                }
            }
        }
        return sum;
    }

    @Override
    public String getCode(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))||(s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                s1+=s.charAt(i);
            }
        }
        return s1;
    }
    
}
