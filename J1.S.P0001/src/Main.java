
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
        //Nhap size
        int n = Validation.getInt("Enter number of array", "Number of array is "
                + "positive integer .Please enter again!", 1, Integer.MAX_VALUE);
        
        int a[] = new int[n];
        //RanDom array
        randomArray(a);
        //display
        display(a);
        // sort
        sort(a);
        //display
        display(a);
    }

    private static void randomArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            int d = rand.nextBoolean() ? 1 : -1;
            a[i]= d * rand.nextInt(a.length);
        }
    }

    private static void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        int n  = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
