package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Ultility {

    public static final Scanner scanner = new Scanner(System.in);
    //a-z: matches a characters in the range between a  and z
    //A-Z: matches a characters in the range between A and Z
    //0-9: matches a characters in the range between 0 and 9 
    //+  : matches the previous token between one and unlimited times
    
    public static final String REGEX_STRING = "[a-zA-Z0-9 ]+";

    public static int getInt(String message, int min, int max) {

        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    int number = Integer.parseInt(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("must in range " + min + " <= number <= " + max);
                    }
                }
            } catch (NumberFormatException exception) {
                System.out.println("Input must be a integer number");
            }

        }

    }

    public static double getDouble(String message, double min, double max, String error) {

        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    double number = Double.parseDouble(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                       System.out.println("Salary is greater than zero");
                    }
                }
            } catch (NumberFormatException exception) {
                System.out.println(error);
            }

        }

    }
    
    public static float getFloat(String message, float min, float max, String error) {

        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty !!");
                } else {
                    float number = Float.parseFloat(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                       System.out.println("must in range " + min + " <= number <= " + max);
                    }
                }
            } catch (NumberFormatException exception) {
                System.out.println(error);
            }

        }

    }

//    public static double getDouble() {
//    }
//    public static String getString() {
//
//        
//    }
    public static String getString(String message, String regex, String error) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else {
                //if input matches regex => return input
                // else print error
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println(error);
                }
            }
        }

    }
}
