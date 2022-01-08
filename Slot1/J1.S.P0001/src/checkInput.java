
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class checkInput {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static int getInt(String Mess, String err, int min, int max){
        while (true) {            
            try {
                System.out.println(Mess);
                int num;
                num = Integer.parseInt(in.readLine());
                if (min <= max && num <= max) {
                    return num;
                }else{
                    System.out.println("Number inrange[" + min + "-" + max + "]");
                }
            } catch (Exception e) {
                System.out.println("You must enter a number in correct format !");
            }
        }
    }
}
