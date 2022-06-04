package view;

import model.Ultility;

public class Main {
    public static void main(String[] args) {
        View_Task viewTask = new View_Task();
        while (true) {      
            displayMenu();
            int option = Ultility.getInt("Option: ", "It must digit", 1, 4);
            switch (option) {
                case 1:
                    // input task
                    viewTask.inputTask();
                    break;
                case 2:
                    // delete 1 task
                    viewTask.deleteTask();
                    break;
                case 3:
                    // display task
                    viewTask.displayTask();
                    break;
                case 4:
                    // Exit
                    System.exit(0);
                    break;

            }
        }
    }
    
    private static void displayMenu() {
        System.out.println("========= Task program =========");
        System.out.println("1.	Add Task\r\n"
                + "2.	Delete task\r\n"
                + "3.	Display Task\r\n"
                + "4.	Exit\r\n"
                + "");
    }
}