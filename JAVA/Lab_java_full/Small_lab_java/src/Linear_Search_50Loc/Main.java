package Linear_Search_50Loc;


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

    public void linearSearch(int[] array, int value) {
        boolean check = false;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                check = true;
                System.out.println("Found " + value + " at index: " + i);
                break;
            }
        }
        if (check == false) {
            System.out.println("Value doesn't exist");

        }

    }

    public void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[size - 1]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        Validation check = new Validation();
        Main m = new Main();
        int size = check.inputInt("Enter number of array: ");
        int[] arr = new int[size]; //mang
        //begin of random number of list
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(size);
        }
        //end of random number of list
        m.display(arr);
        int value = check.inputInt("Enter search value: ");
        System.out.print("The array: ");
        m.linearSearch(arr, value);
    }
}
