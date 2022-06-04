/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Ultility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {
        //1.	User enter the first date with[dd / mm / yyyy] format 
        String firstDate = Ultility.getDate("Please enter the first date: ", "Date must be"
                + " in format (dd/MM/yyyy)", Ultility.REGEX_DATE);
        //2.	User enter the second date with[dd / mm / yyyy] format 
        String secondDate = Ultility.getDate("Please enter the second date: ", "Date must be"
                + " in format (dd/MM/yyyy)", Ultility.REGEX_DATE);
        //3.	Compare and display
        compareDate(firstDate, secondDate);

    }

    private static void compareDate(String firstDate, String secondDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            //b1: convert from String type to Date type
            Date first = dateFormat.parse(firstDate);
            Date second = dateFormat.parse(secondDate);

            //b2: compare two date
            if (first.before(second)) {
                System.out.println("Date1 is before Date2");
            } else if (first.after(second)) {
                System.out.println("Date1 is after Date2");

            }else {
                System.out.println("Date1 is equal Date2");
            }

        } catch (ParseException ex) {
            System.out.println("Date must be in format dd/MM/yyyy");
        }

    }

}
