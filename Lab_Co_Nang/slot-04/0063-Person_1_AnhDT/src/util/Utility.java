package util;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PHAM KHAC VINH
 */
public class Utility {

    public static final String REGEX_STRING = "[a-zA-Z0-9 ]+";
   
    
    //  / + shift 88 + enter
    
    
    /**
     * this function use to get a number's double
     * @param message
     * @param error
     * @param min
     * @param max
     * @return a number or exception
     */
    public static double getNumberDouble(String message, String error, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print(message);
            String input = scanner.nextLine().trim();
            double number = 0;
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    number = Double.parseDouble(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                        throw new ArithmeticException("Salary is greater than zero");
                    }

                } catch (NumberFormatException e) {
                    throw new NumberFormatException("You must input digit.");
                }

            }
        }
    }
    
    /**
     * this function use to get a string 
     * @param message
     * @param error
     * @param REGEX
     * @return string input 
     */
    public static String getString(String message, String error, String REGEX) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error empty");
            } else if (input.matches(REGEX)) {
                return input;
            } else {
                System.out.println(error);
            }
        }
    }

}
