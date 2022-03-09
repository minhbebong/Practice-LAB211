
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
public class Validate {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String Mess) {
        int a = 0;
        while (true) {
            try {
                System.out.println(Mess);
                a = Integer.parseInt(sc.nextLine());
                if (a > 0) {
                    break;
                } else {
                    System.out.println("Postive number !");
                }
            } catch (Exception e) {
                System.out.println("Invalid!!!!");
            }

        }
        return a;
    }
}
