
import java.util.Arrays;
import java.util.Random;

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

    public static void main(String[] args) {
        //Input a postive decimal integer
        int n = checkInput.getInt("Enter number of array: ", "number of array is a positive integer", 1, Integer.MAX_VALUE);
        int[] a = new int[n];
        // Random array 
        randomArray(a);
        //Display before array
        display(a);
        //Implement bubble Sort
        bubbleSort(a);
        //Display after again
        display(a);
    }

    //random các phần tử mảng với giá trị trong khoảng
    private static void randomArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(a.length);
        }
    }

    private static void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    // private static int[] createSampleArray() {
    // int temp[] = new int[]{5, 1, 18, -5, 16};
    // return temp;
    // }
    
    private static void bubbleSort(int[] a) {
        int n = a.length;
        // traverse elements from the beginning to the end of array
        for (int i = 0; i < n - 1; i++) {
            // traverse from the beginning of array to last unsorted element
            for (int j = 0; j < n - 1 - i; j++) {
                // check if current number is greater than the next
                // if yes then swap its position
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
