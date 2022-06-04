/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateFormat;

import com.sun.corba.se.impl.util.Utility;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author leeph
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            //1.User enter date with[dd / mm / yyyy] format 
            String inputDate = Utitlity.getDate("Enter date with format: ", ""
                    + "date must be in format....", Utitlity.REGEX_DATE);
            //2.Check user input date exits
            if (Utitlity.isValidDate(inputDate) == false) {
                System.out.println("Date does not exist !!!");
            }else {
                //3.Determine day of week with input date 
                determineDayOfWeek(inputDate);
                break;
            }
        }

    }

    private static void determineDayOfWeek(String inputDate) {
        DateFormat dateFormat = new SimpleDateFormat("EEEEE");
        
        
        
    }
}
