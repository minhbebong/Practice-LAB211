
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
    
    static int linearSearch(int[] array, int value) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
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
        int value = check.inputInt("Enter search value: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("The array: ");
        display(arr);
        int index = linearSearch(arr, value);
        if (index == -1)
            System.out.println("Value doesn't exist");
        else System.out.println("Found " + value + " at index: " + index);
    }
}
