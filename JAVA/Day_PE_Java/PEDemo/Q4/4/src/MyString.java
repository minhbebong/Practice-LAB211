/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{
    public static boolean getNum(String string) {
    try {
        Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        return false;
        }
    }

    @Override
    public int f1(String string) {
        int sum = 0;
        String [] str = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if (getNum(str[i]) == true) {
                sum += Integer.parseInt(str[i]);
            }           
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        String temp = "";
        String [] str = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if (getNum(str[i]) == true) {
                if (Integer.parseInt(str[i]) < 9) {
                    str[i] = String.valueOf(Integer.parseInt(str[i]) + 1);
                }
            }
            temp = temp + str[i];
        }
        return temp;
    }
}
