/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        Validation val = new Validation();
        while (true) {
            String first = (val.getDate("Please enter the first date : "));
            String second = (val.getDate("Please enter the second date : "));
            System.err.println(val.comparaDate(first,second));
        }
    }
}
