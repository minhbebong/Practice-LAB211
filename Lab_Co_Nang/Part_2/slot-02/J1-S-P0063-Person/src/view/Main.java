/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {
        ViewPerson view = new ViewPerson();
        //  input information
        view.inputPerson();

        //	Sort person list by salary ascending 
        view.sortPersonBySalary();

        //	Show 3 person information 
        view.displayPerson();

    }
}
