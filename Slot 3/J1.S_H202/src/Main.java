
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

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printReverse();// hello there! -> !ereht olleh
    }

    private static void printReverse() {
        //Nhap String
        String str = "";
        while (true) {
            System.out.println("Enter String : ");
            str = sc.nextLine();
            if (!str.trim().equals("")) {
                break;
            }
        }
        //reverse
        String rv = reverse(str);
        //in ra
        System.out.println(rv);
    }

    private static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}
