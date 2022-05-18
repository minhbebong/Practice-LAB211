/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoan toan hanh phuc
 */
public class Person {
    String name;
    int age;
    double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void InputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Salary: ");
        salary = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public String toString() {
        return "Name: "+name +" Age: "+age +" salary: "+salary;
    }
    
}
