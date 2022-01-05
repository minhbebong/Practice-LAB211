/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validateinput;

/**
 *
 * @author Lenovo
 */
public class Validateinput {

    public static void main(String[] args) {
        Ulities u = new Ulities();
        String Name = u.checkString("Enter your name: ", "(\\w+\\s{0,1})+");
        String Addr = u.checkString("Enter your address: ", "(\\w+\\s{0,1})*");
        String Phone = u.checkString("Enter your phone number: ", "(\\+\\d{1,2}\\s?)?(\\d){9,11}");
        String Email = u.checkString("Enter your email: ", "[a-zA-Z]\\w+@\\w+(\\.\\w+){1,3}");
        String Date = u.checkDate("Enter date: ", "dd/MM/yyyy"); //dạng số
        //String Date = u.checkDate("Enter date: ", "dd/MMM/yyyy"); //dạng chữ
        int MenuChoice = u.checkInt("Enter your choice: ", 1, 5);
        int integer = u.checkInt("Enter any integer number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int IntPositive = u.checkInt("Enter positive integer number", 0, Integer.MAX_VALUE);
        int IntNegative = u.checkInt("Enter negative integer number", Integer.MIN_VALUE, 0);

        System.out.println("\nYou've just inputed:\n");
        System.out.println("Name: " + Name);
        System.out.println("Phone: " + Phone);
        System.out.println("Address: " + Addr);
        System.out.println("Email: " + Email);
        System.out.println("Date: " + Date);

    }
}
