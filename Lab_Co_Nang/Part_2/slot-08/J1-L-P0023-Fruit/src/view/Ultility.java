/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Ultility {
    static Scanner scanner = new Scanner(System.in);

    //global
    public static final String REGEX_STRING = "[a-zA-Z0-9 ]+";
    public static final String REGEX_NAME = "[a-zA-Z ]+";
    public static final String REGEX_SEMESTER = "[0-9]";
    public static final String REGEX_COURSE_NAME = "[a-zA-Z.+/ ]+";
    public static String REGEX_YES_NO = "[yYnN]";
    public static final String REGEX_UPDATE_DELETE = "[uUdD]";

    static final String DATE_FORMAT = "dd-MM-yyyy";

    public static int getInt(String message, String error, int min, int max) {
        String REGEX_NUMBER = "[0-9]+";
        while (true) {
            System.out.print(message);
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
                    if (number >= min && number <= max) {
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
            System.out.print(message);
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
            System.out.print(message);
            String result = scanner.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input cannot be empty");
                //neu result khop voi cai regex => cho qua
                //neu khong khop (false )
            } else if (result.matches(REGEX_NUMBER) == false) {
                System.out.println(error);

            } else {

                try {
                    double number = Double.parseDouble(result);
                    if (number >= min && number < max) {
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

    public static String getString(String message, String error, String regex) {
        while (true) {
            System.out.print(message);
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
            System.out.print(message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty");
            } else {
                if (!input.matches(regex)) {
                    System.out.println(error);
                } else if (isValidDate(input) == false) {
                    System.out.println("Date does not exist ");
                } else {
                    DateFormat dateformat = new SimpleDateFormat(DATE_FORMAT);
                    Date currentDate = new Date();
                    //format 2 cai date theo  format dd/MM/yyyy
                    String currentDateString = dateformat.format(currentDate);
                    boolean checkDateLessThanCurrentDate = checkDate1_Less_Than_Date2(currentDateString, input);
                    //if variable above == true => return gia tri do
                    //else sout loi 
                    if (checkDateLessThanCurrentDate == false) {
                        System.out.println("Date must be greater than " + currentDateString);
                    } else {
                        return input;
                    }
                }
            }
        }
    }

    public static boolean isValidDate(String date) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        Date dateTest = null;
        dateFormat.setLenient(false);

        try {
            dateTest = dateFormat.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    private static boolean checkDate1_Less_Than_Date2(String input, String currentDateString) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        try {
            Date firstDate = dateFormat.parse(input);
            Date secondDate = dateFormat.parse(currentDateString);
            
            if (firstDate.before(secondDate)) {
                return true;
            }else if(firstDate.after(secondDate)) {
                return false;
            }else {
                return true;
            }

        } catch (ParseException ex) {
            System.out.println("PARSE KO THANH CONG");
        }
        return false;

    }

}
