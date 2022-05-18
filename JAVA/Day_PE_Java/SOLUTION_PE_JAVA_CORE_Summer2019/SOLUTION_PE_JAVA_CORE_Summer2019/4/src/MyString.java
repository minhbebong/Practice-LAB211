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
    public int sum(String string) {
        int total = 0;
        char[] s = string.toCharArray();
        for (char o : s){
            if (o == '2'){
                total += 2;
            }if (o == '4'){
                total += 4;
            }if (o == '6'){
                total += 6;
            }if (o == '8'){
                total += 8;
            }
            
        }
        return total;
    }

    @Override
    public String getCode(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++){
            if (Character.isUpperCase(string.charAt(i)) == false || Character.isDigit(string.charAt(i)) == false){
                sb.deleteCharAt(i);
                i--;
            } 
        }
        return sb.toString();
    }


    
}
