/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageEastAsiaCountries;
import java.util.ArrayList;
import java.util.List;
import model.EastAsiaCountry;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {
        ManageEastAsiaCountries manage = new ManageEastAsiaCountries();
        View_Country view = new View_Country();
        
        
        while (true) {
            displayMenu();
            int option = Ultility.getInt("Option: ", "It must be decimal number", 1, 5);
            switch (option) {
                case 1:
                    //1.Input the information of 11 countries in East Asia
                    view.inputCountry();
                    break;

                case 2:
                    //2. Display the information of country you've just input
                    view.displayCountryJustInput();
                    break;

                case 3:
                    //3. Search the information of country by user-entered name
                    view.searchCountry();
                    break;

                case 4:
                    //4. Display the information of countries sorted name in ascending order  
                    view.sortAndDisplay();
                    break;

                case 5:
                    //5. Exit 
                    System.exit(0);
                    break;

            }

        }

    }

    private static void displayMenu() {
        System.out.println("                               MENU\n"
                + "==========================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "==========================================================================");
    }

}
