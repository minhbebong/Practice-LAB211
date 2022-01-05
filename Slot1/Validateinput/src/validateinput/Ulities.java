/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validateinput;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author Lenovo
 */
public class Ulities {

    Scanner sc = new Scanner(System.in);

    String checkString(String Mess, String Regex) {
        String Ret = "";
        do {
            System.out.println("\n" + Mess);
            Ret = sc.nextLine();
            if (Ret.matches(Regex)) {
                break;
            }
            System.out.println("Invalid input , plz try again");
        } while (true);
        return Ret;
    }

    String checkDate(String Mess, String format) {
        String Ret = "";
        SimpleDateFormat SDF = new SimpleDateFormat(format);
        SDF.setLenient(false);
        do {
            System.out.println("\n" + Mess);
            Ret = sc.nextLine();
            try {
                SDF.parse(Ret);
                break;
            } catch (Exception e) {
                System.out.println("Invalid date input!");
            }
        } while (true);
        return Ret;
    }

    int checkInt(String Mess, int MIN, int MAX) {
        int Ret = 0;
        do {
            System.out.println(Mess);
            try {
                Ret = Integer.parseInt(sc.nextLine());
                if (Ret >= MIN && Ret <= MAX) {
                    break;
                }
                System.out.println("Out of range!");
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        } while (true);
        return Ret;
    }
}
