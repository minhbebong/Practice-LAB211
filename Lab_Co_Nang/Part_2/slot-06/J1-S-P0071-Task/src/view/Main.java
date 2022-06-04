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
        View_Task view = new View_Task();
        while (true) {
            displayMenu();
            int option = Ultility.getInt("Enter option: ", "Wrong", 1, 4);
            switch (option) {
                case 1:
                    //1. input task
                    view.inputTask();
                    break;
                case 2:
                    //2. delete task
                    view.deleteTask();
                    break;
                case 3:
                    //3. show task
                    view.showTask();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }

    private static void displayMenu() {
        System.out.println("========= Task program =========\n"
                + "1.	Add Task\n"
                + "2.	Delete task\n"
                + "3.	Display Task\n"
                + "4.	exit");
    }

}
