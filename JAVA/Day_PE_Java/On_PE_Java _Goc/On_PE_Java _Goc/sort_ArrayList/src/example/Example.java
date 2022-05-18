/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hoan toan hanh phuc
 */
public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        SoftByAge s = new SoftByAge();
        
        ArrayList<Person> listPerson = new ArrayList();
        listPerson.add(new Person("Babe", 3, 2000));
        listPerson.add(new Person("An", 9, 2000));
        listPerson.add(new Person("Daddy", 6, 2000));
        listPerson.add(new Person("Canxi", 5, 2000));
        
        System.out.print("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            p.InputInfor();
            listPerson.add(p);
        }
        
       // s.sortByAge(listPerson);
        s.sortByName(listPerson);
        
        for (Person p1 : listPerson) {
            System.out.println(p1);
        }
    }

}
