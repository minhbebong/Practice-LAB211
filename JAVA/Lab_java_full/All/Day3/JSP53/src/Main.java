
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    
    static Validation check = new Validation();
    
    static void menu() {
        System.out.println("1. Input element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
    }
    
    static int[] inputArray() {
        System.out.println("Input Length of array");
        int size = check.inputInt("Enter number: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = check.inputInt("Enter number " + (i+1) + ": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        return arr;
    }
    
    static void bubbleSortAscending(int[] array) {
        if (array == null) {
            return;
        }
        int size = array.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    static void bubbleSortDescending(int[] array) {
        if (array == null) {
            return;
        }
        int size = array.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    static void display(int[] array, int option) {
        if (array == null) {
            System.out.println("Empty array");
            return;
        }
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (i != size-1) {
                System.out.print("[" + array[i] + "]");
                if (option == 2) System.out.print("->");
                else System.out.print("<-");
            }
            else System.out.print("[" + array[i] + "]");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = null;
        while(true) {
            menu();
            int option = check.inputInt("Please choose an option: ", 1, 4);
            switch(option) {
                case 1:
                    arr = inputArray();
                    break;
                case 2:
                    bubbleSortAscending(arr);
                    display(arr, option);
                    break;
                case 3:
                    bubbleSortDescending(arr);
                    display(arr, option);
                    break;
                case 4:
                    return;
            }
        }
    }
}
