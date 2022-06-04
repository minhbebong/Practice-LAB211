/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Employee;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {

        View_Employee view = new View_Employee();
        while (true) {
            displayMenu();
            int option = Ultility.getInt("OPTION: ", "Wrong", 1, 7);
            switch (option) {
                case 1:
                    //1.Input employee 
                    view.inputEmployee();
                    break;
                case 2:
                    //2.Update employees
                    view.update();
                    break;

                case 3:
                    //3.Remove employees
                    view.remove();
                    break;

                case 4:
                    //4.Search employees
                    view.search();
                    break;

                case 5:
                    //5.Sort employees by salary
                    view.sort();
                    break;

                case 6:
                    //6.Exit
                    System.exit(0);
                    
                case 7: 
                    view.displayEmployee();
                    break;
            }

        }

    }

    private static void displayMenu() {
        System.out.println("============================ MENU ============================");
        System.out.println("1.	Add employees \n"
                + "2.	Update employees\n"
                + "3.	Remove employees\n"
                + "4.	Search employees\n"
                + "5.	Sort employees by salary\n"
                + "6.	Exit\n"
                + "");
    }

}
