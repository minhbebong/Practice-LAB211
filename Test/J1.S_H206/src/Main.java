/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {

    private static void printSquare(int min, int max) {
//        if (min < 0 || max < 0) {
//            min = Validate.getInt("Enter min: ");
//            max = Validate.getInt("Enter max: ");
//        }
        int minAfter = min;
        for (int i = 0; i <= max - minAfter; i++) {
            for (int j = min; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = minAfter; k < min; k++) {
                System.out.print(k);
            }
            System.out.println();
            min = min + 1;
        }
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        do {
            min = Validate.getInt("Enter Min = ");
            max = Validate.getInt("Enter Max = ");
            if (min > max) {
                System.out.println("Min < Max");
            }
        } while (min > max);
        printSquare(min, max);
        //printSquare(1, 5);
    }
}
