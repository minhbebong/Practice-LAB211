
import java.util.Random;

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
    
    static void bubbleSort1(int[] array) {
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
    
    static void bubbleSort2(int[] array) {
        int size = array.length;
        int j = 0;
        boolean swapped = true;
        while(swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < size-j; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    
    static void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i != size-1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
        System.out.println("]");   
    }
    
    public static void main(String[] args) {
        Validation check = new Validation();
        int size = check.inputInt("Enter number of array: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        System.out.print("Unsorted array: ");
        display(arr);
        bubbleSort1(arr);
        System.out.print("Sorted array: ");
        display(arr);
    }
}
