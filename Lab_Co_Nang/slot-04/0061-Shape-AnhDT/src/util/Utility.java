package util;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_DATE = "\\d{1,2}[/]\\d{1,2}[/]\\d{4}";
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    

    public static int getNumberInteger(String message, String error, int min, int max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    int number = Integer.parseInt(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Input must be from [" + min + " - " + max + "]");
                    }

                } catch (Exception e) {
                    System.out.println(error);
                }
            }

        }
    }
    
    public static float getNumberFloat(String message, String error, float min, float max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    float number = Float.parseFloat(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Input must be from [" + min + " - " + max + "]");
                    }

                } catch (Exception e) {
                    System.out.println(error);
                }
            }

        }
    }
    
    public static double getNumberDouble(String message, String error, double min, double max) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    double number = Double.parseDouble(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                        System.out.println("Input must be from [" + min + " - " + max + "]");
                    }

                } catch (Exception e) {
                    System.out.println(error);
                }
            }

        }
    }
    
    public static String getString(String message, String error, String REGEX) {
        while (true) {            
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error empty");
            }else if (input.matches(REGEX)) {
                return input;
            }else {
                System.out.println(error);
            }
        }
    }
    
    
    public static String getDate(String message) {
        while (true) {
            DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else if (input.matches(REGEX_DATE) == false) {
                System.out.println("Input must in format dd/MM/yyyy");
            } else if (checkDateExist(input, dateFormat)) {
                return input;
            }
        }
    }

    private static boolean checkDateExist(String input, DateFormat dateFormat) {
        dateFormat.setLenient(false);
        try {
            Date inputDate = dateFormat.parse(input);
            return true; // ngay thang co ton tai
        } catch (ParseException ex) {
            System.out.println("Ngay thang ko ton tai");
            return false; //ngay thang ko ton tai
        }

    }

}
