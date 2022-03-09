
import java.util.Scanner;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine().trim();
        printReverse(a);
        
    }
    public static void printReverse(String a){
        if (a.isEmpty()) {
            return;
        }else{
            String result ="";
            char[]b = a.toCharArray();
            for (int i = b.length - 1 ; i >= 0; i--) {
                result = result + b[i];
            }
            System.out.println(result);
        }
    }
    
}
