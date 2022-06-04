/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author leeph
 */
public class Utitlity {
    
    static Scanner scanner = new Scanner(System.in);
    static final String DATE_FORMAT = "dd/MM/yyyy";
    static final String REGEX_DATE = "\\d{1,2}[/]\\d{1,2}[/]\\d{1,4}";
    
    /**
     * Return a date that matches format
     * @param message
     * @param error
     * @param regex
     * @return  output
     */
    public static String getDate(String message, String error, String regex){
        /*
        Loop while output is match with format
        */
        while (true) {            
            System.out.print(message);
            String input = scanner.nextLine();
            /*
            Check if input is empty
            */
            if (input.isEmpty()) {
                System.out.println("Input can't be empty");
            }else{
                /*
                Check if input is not match format
                */
                if (!input.matches(regex)) {
                    System.out.println(error);
                }else{
                    return input;
                }
            }
        }
    }
    
    public static boolean isValidDate(String inputDate) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(inputDate);
            return true;
        } catch (ParseException ex) {
            return false;
        }
        
    }
    
    
    
}
