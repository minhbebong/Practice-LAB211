/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Ultility {

    //global
    static Scanner scanner = new Scanner(System.in);
    static final String DATE_FORMAT = "dd/MM/yyyy";

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
        String REGEX_NUMBER = "[0-9]+([.][0-9]){0,}";
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

                double number = Double.parseDouble(result);
                if (number >= min && number <= max) {
                    return number;

                } else {
                    System.out.println("number must in range from " + min + " to " + max);

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

    public static String getDate(String message, String error, String regex) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else {
                if (!input.matches(regex)) {
                    System.out.println(error);
                } else {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                    dateFormat.setLenient(false);
                    try {
                        Date date = new Date();
                        date = dateFormat.parse(input);
                        String output = dateFormat.format(date);
                        return output;

                    } catch (Exception e) {
                        System.out.println(error);
                    }
                }
            }
        }
    }

}
