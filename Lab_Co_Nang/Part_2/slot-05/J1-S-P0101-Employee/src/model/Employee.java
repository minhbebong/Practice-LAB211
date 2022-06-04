/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Employee {

    private static int auto_Increment = 1;
    private int id;
    private String firstName, lastName, phone, email, address, DOB, agency;
    private double salary;
    private int sex;

    public Employee(String firstName, String lastName, String phone, String email, String address, String DOB, String agency, double salary, int sex) {
        this.id = auto_Increment++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.DOB = DOB;
        this.agency = agency;
        this.salary = salary;
        this.sex = sex;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if (phone.matches("[0][0-9]{9,10}")) {
            this.phone = phone;
        }else {
            throw new Exception("It must be phone have 10 or 11 number !!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
       if (email.matches("[\\w][@]([\\w]+[.]){1,2}[\\w]+")) {
            this.email = email;
        }else{
           throw new Exception("It must be email !!"); 
       }
                
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
       if (address != null) {
            this.address = address;
        }
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
       if (DOB != null) {
            this.DOB = DOB;
        }
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
       if (agency != null) {
            this.agency = agency;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getSex() {
        String sexRESULT = null;
        switch (sex) {
            case 1:
                sexRESULT = "male";
                break;
            case 0:
                sexRESULT = "female";
                break;
        }
        return sexRESULT;
    }

    public void setSex(int sex) {
        if (sex >= 0) {
            this.sex = sex;
        }
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s"
                + "%-10s %-10s ", id, firstName, lastName, phone, email, address, DOB, getSex(), salary, agency);
    }

}
