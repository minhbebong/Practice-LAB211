/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Ultility {

    //global
    static Scanner scanner = new Scanner(System.in);
    static final String REGEX_STRING = "[a-zA-Z0-9 ]+";

    public static int getInt(String message, String error, int min, int max) {
        String REGEX_NUMBER = "[0-9]+";
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input cannot be empty");
                //neu result khop voi cai regex => cho qua
                //neu khong khop (false )
            } else if (result.matches(REGEX_NUMBER) == false) {
                System.out.println(error);

            } else {

                try {
                    int number = Integer.parseInt(result);
                    if (number > min && number < max) {
                        return number;

                    } else {
                        System.out.println("number must in range from " + min + " to " + max);
                    }

                } catch (NumberFormatException e) {
                    System.out.println(error);

                }
            }
        }
    }

    public static float getFloat(String message, String error, float min, float max) {
        String REGEX_NUMBER = "[0-9.]+";
        while (true) {
            System.out.println(message);
            String result = scanner.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input cannot be empty");
                //neu result khop voi cai regex => cho qua
                //neu khong khop (false )
            } else if (result.matches(REGEX_NUMBER) == false) {
                System.out.println(error);
            } else {

                try {
                    float number = Float.parseFloat(result);
                    if (number > 1 && number < 100) {
                        return number;

                    } else {
                        System.out.println("number must in range from " + min + " to " + max);

                    }

                } catch (NumberFormatException e) {
                    System.out.println(error);

                }
            }
        }
    }

    public static double getDouble(String message, String error, double min, double max) {
        String REGEX_NUMBER = "[0-9.]+";
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            //b1: check is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else {
                try {
                    double number = Double.parseDouble(input);
                    //b2: check range
                    if (number < min) {
                        System.out.println("Salary is greater than zero");
                    } //b3: check regex ???
                    else if (!input.matches(REGEX_NUMBER)) {
                        System.out.println(error);
                    }else {
                        return number;
                    }
                    //tuong trung cho viec parse loi 
                } catch (NumberFormatException e) {
                    System.out.println(error);
                }

            }
        }
    }

    public static String getString(String message, String error, String regex) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty !!!");
            } else {
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println(error);
                }
            }
        }
    }

}
