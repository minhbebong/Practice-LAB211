/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import util.Utility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Person {

    private String name; //Vinh,, Hung
    private String address;// Ha Noi, Thai Nguyen
    private double salary; //2000$, 3000$

    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    /**
     * this function use to display a person
     * @param person 
     */
    public void displayPersonInfo(Person person) {
        System.out.printf("Name: %s\n"
                + "Address: %s\n"
                + "Salary: %s\n", name, address, salary);
    }
    
    /**
     * this function use to input person information
     */
    public void inputPersonInfo() {
        System.out.println("Input Information of Person");
        //input data 
         name = Utility.getString("Please input name:", "Name must be String",
                Utility.REGEX_STRING);
        address = Utility.getString("Please input address:", "Address must be String",
                Utility.REGEX_STRING);
        
        while (true) {
            try {
                salary = Utility.getNumberDouble("Please input salary:", "You must input digit.",
                        0, Double.MAX_VALUE);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        

    }

}
