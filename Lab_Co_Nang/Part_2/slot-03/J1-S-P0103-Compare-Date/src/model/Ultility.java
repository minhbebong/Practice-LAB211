package model;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ultility {

	  /**
     * User enter the option
     *
     * @param
     * @return option
     */
 
    public static final String REGEX_DATE = "\\d{1,2}[/]\\d{1,2}[/]\\d{1,4}";
    
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(String msgString, String errorString,
            int min, int max) {
        Scanner scanner = new Scanner(System.in);

        // ask user until true input
        while (true) {
            System.out.print(msgString);
            try {
                String input = scanner.nextLine().trim();
                //if input is empty or have only space => tell user
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty!!!");
                } else {
                    int number = Integer.parseInt(input);
                    // check the range of input
                    if (min <= number && number <= max) {
                        return number;
                    } else {
                        System.out.println("Invalid. The input must be "
                                + "in range " + min + " to " + max);
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println(errorString);
            }
        }

    }

    /**
     * Get a String input
     *
     * @param msgString : display message
     * @param error : display error
     * @param regexString : match the string true
     * @return string
     */
    public static String getString(String msgString, String error, String regexString) {
        
        // ask user until true input
        while (true) {
            System.out.print(msgString);
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Input can't be empty!!!");
            } // Check the value of user enter is match with the regex?
            // if true then return the string  
              else if (string.matches(regexString)) {
                
                return string;
            } else {
                System.out.println(error);
            }
        }

    }

    /**
     * Get a float number
     *
     * @param msgString : display message
     * @param error : display error
     * @return an float number
     */
    public static double getDouble(String msgString, String error, double d, double f) {

        // ask user until true input
        while (true) {
            System.out.print(msgString);
            try {
                String input = scanner.nextLine().trim();
                //if input is empty or have only space => tell user
                if (input.isEmpty()) {
                    System.out.println("Input can't be empty!!!");
                } else {
                    double floatInput = Double.parseDouble(input);
                    //if floatInput not divide to 0.5 then tell user
                    if (floatInput % 0.5 != 0) {
						System.out.println( "It must be divide to 0.5");
					}
                    // check the range of input
                    else if (d <= floatInput && floatInput <= f) {
                        return floatInput;
                    } else {
                        System.out.println("Invalid. The input must be in range "
                                + d + " to " + f);
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
     public static String getDate(String msg, String error, String regex) {
        Scanner scanner = new Scanner(System.in);
        Date dateTime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(dateTime);
        String date;
        while (true) {
            System.out.print(msg);
            date = scanner.nextLine().trim();

            //boolean dateLessThanCurrentDate = checkDate_1_Less_Than_Date2(date, currentDate);
            //dateLessThanCurrentDate return true => date input < date current 
            //else date input > date current

            if (date.isEmpty()) {
                System.out.println("Input can't be empty");
            } else if (!date.matches(regex)) {
                System.out.println(error);
            } else if (isValidDate(date) == false) {
                System.out.println("The date does not exist !!!");
            } //else if (dateLessThanCurrentDate == false) {
                //System.out.println("Date must be less than " + currentDate);
             else {
                return date;
            }

        }

    }

    public static boolean isValidDate(String date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateTest = null;
        dateFormat.setLenient(false);

        try {
            dateTest = dateFormat.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

//    private static boolean checkDate_1_Less_Than_Date2(String dateInput, String currentDate) {
//        DateFormat dateFormat = new SimpleDateFormat(FORMAT_DOB);
//        Date firstDate;
//        Date secondDate;
//
//        try {
//            firstDate = dateFormat.parse(dateInput);
//            secondDate = dateFormat.parse(currentDate);
//
//            //if first date before second date => return true
//            //if first date after second date => return false
//            //if first date equal second date = > return false
//            if (firstDate.before(secondDate)) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } catch (ParseException ex) {
//            return false;
//        }
//    }
//    
//    public static boolean checkWantToUpdate(String message) {
//        String test = getString("Do you want to update " + message +" ?: ", "It must be Y or N", REGEX_YN);
//        if (test.equalsIgnoreCase("y")) {
//            return true;
//        }
//        return false;
//    }

}