
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

    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static int inputNumber(String Mess) {
        int number;
        do {
            try {
                System.out.print(Mess);
                number = Integer.parseInt(bf.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a number!");
            }

        } while (true);
        return number;
    }

}
