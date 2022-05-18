/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice5;

import java.util.Scanner;

/**
 *
 * @author alias
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input age: ");
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.print("input name: ");
        String name = sc.nextLine();
        
        System.out.print("input mark: ");
        double mark = Double.parseDouble(sc.nextLine());
        
        
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("mark: " + mark);

    }
}
