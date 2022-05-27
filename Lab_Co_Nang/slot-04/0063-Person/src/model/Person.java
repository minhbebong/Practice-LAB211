/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Person {

    private String name, address;
    private double salary;

    /**
     * create a person with parameter
     *
     * @param name
     * @param address
     * @param salary
     */
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
    
    @Override
    public String toString() {
        return String.format("Information of Person you have entered:\n"
                + "Name: %s\n"
                + "Address: %s\n"
                + "Salary: %s\n", name, address, salary);
    }
    
}
