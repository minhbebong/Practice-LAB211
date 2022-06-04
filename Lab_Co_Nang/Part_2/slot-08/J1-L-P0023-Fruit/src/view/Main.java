
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manage;
import java.util.ArrayList;
import java.util.List;
import model.Fruit;

/**
 *
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        View_Fruit view = new View_Fruit();
        //data gia
        
        //data gia
        while (true) {
            displayMenu();
            int option = Ultility.getInt("Enter option: ", "It must be digit", 1, 5);
            switch (option) {
                case 1:
                    //create fruit 
                    view.createFruit();
                    break;
                case 2:
                    //view order
                    view.viewOrder();
                    break;
                case 3:
                    //shopping 
                    view.shopping();
                    break;
                case 4:
                    //exit
                    System.exit(0);
                    break;
                case 5:
                    view.displayListFruit();
            }
        }
    }

    private static void displayMenu() {
        System.out.println("FRUIT SHOP SYSTEM\n"
                + "1.	Create Fruit\n"
                + "2.	View orders\n"
                + "3.	Shopping (for buyer)\n"
                + "4.	Exit");
    }

}