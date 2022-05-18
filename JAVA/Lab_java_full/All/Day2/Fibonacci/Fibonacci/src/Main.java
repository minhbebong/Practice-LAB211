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
    
    static int fibonacci(int i) {
        if (i < 2) return i;
        return fibonacci(i-1) + fibonacci(i-2);
    }
    
    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci:");
        for (int i = 0; i < 45; i++) {
            if (i != 44) System.out.print(fibonacci(i) + ", ");
            else System.out.println(fibonacci(i));
        }
    }
}
