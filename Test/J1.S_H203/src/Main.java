/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void printReverse(String str) {
        if (str.isEmpty()) {
            str = Validate.getString("Enter your string: ");
        }
        String[] txt = str.split(" ");
        String x = "";
        
        for (int i = txt.length - 1; i >= 0; i--) {
            x += txt[i];
            x += " ";
        }
        String result = x.substring(0, 1).toUpperCase() + x.substring(1);
        System.out.println(result.trim());
    }
    
    public static void main(String[] args) {
        //printReverse("hello there");
        printReverse("");
    }
}
