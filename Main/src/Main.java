
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

    public static void main(String[] args) {
        //so luong
        int quantity = getInt("Enter the quantity: ", "Quantity must be digit", 1, Integer.MAX_VALUE);
        System.out.println(quantity);

        int age = getInt("Enter the age: ", "Age must be digit", 0, 20);
        System.out.println("tong cua 2 so la: " + (quantity + age));

    }

    //ten cua ham se dat theo output
    //check : mang theo y nghia la dung' hoac sai
    //validate   => AnhDT thaoi mai
    public static int getInt(String message, String error, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        //Exception : dai dien cho moi loai loi ... 
        //tioen doan duoc cai loi la se xay ra loi nao
        while (true) {
            try {
                System.out.print(message);
                int number1 = scanner.nextInt();
                if (number1 >= min && number1 <= max) {
                    return number1;
                } else {
                    System.out.println("Input must in range from [" + min + "-" + max + "]");
                }
                return number1;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }
}
