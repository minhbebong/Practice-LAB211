/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageEmployee;
import java.util.List;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Employee {

    ManageEmployee manage = new ManageEmployee();

    void inputEmployee() {
        //private String firstName, lastName, phone, email,address,DOB,agency;
        String firstName = getFirstName();
        String lastName = getLastName();
        String phone = getPhone();
        String email = getEmail();
        String address = getAddress();
        String DOB = getDOB();
        int sex = getSex();
        double salary = getSalary();
        String agency = getAgency();

        //b2: tao doi tuong
        Employee employee = new Employee(firstName, lastName, phone, email, address, DOB, agency, salary, sex);
        manage.addEmployee(employee);
        System.out.println(employee);

    }

    void update() throws Exception {
        int id = getID();

        Employee employee = manage.getEmployeeByID(id);
        if (employee == null) {
            System.out.println("NOT FOUND EMPLOYEE");
            return;
        }

        if (checkWantToUpdate("id")) {
            while (true) {
                int IDUpdate = getID();
                if (manage.checkDuplicate(IDUpdate)) {
                    System.out.println("ID was existed !!");
                } else {
                    employee.setId(IDUpdate);
                    break;
                }
            }

        }

        if (checkWantToUpdate("first name")) {
            String firstName = getFirstName();
            employee.setFirstName(firstName);
        }

        if (checkWantToUpdate("last name")) {
            String lastName = getLastName();

            employee.setLastName(lastName);
        }
        if (checkWantToUpdate("phone")) {
            String phone = getPhone();

            employee.setPhone(phone);
        }
        if (checkWantToUpdate("email")) {
            String email = getEmail();

            employee.setEmail(email);
        }
        if (checkWantToUpdate("address")) {
            String address = getAddress();

            employee.setAddress(address);
        }
        if (checkWantToUpdate("DOB")) {
            String DOB = getDOB();

            employee.setDOB(DOB);
        }
        if (checkWantToUpdate("sex")) {
            int sex = getSex();

            employee.setSex(sex);
        }
        if (checkWantToUpdate("salary")) {
            double salary = getSalary();

            employee.setSalary(salary);
        }
        if (checkWantToUpdate("agency")) {
            String agency = getAgency();

            employee.setAgency(agency);
        }

    }

    void remove() {
        int id = getID();
        Employee employee = manage.getEmployeeByID(id);

        if (employee == null) {
            System.out.println("NOT FOUND EMPLOYEE");
        } else {
            manage.removeEmployee(employee);
        }

    }

    void search() {
        String name = getName();

        List<Employee> listSearch = manage.getEmployeeByName(name);

        if (listSearch.size() == 0) {
            System.out.println("NOT FOUND");
        } else {
            displayListEmployee(listSearch);
        }
    }

    void sort() {
        List<Employee> listSort = manage.sortEmployee();
        if (listSort.size() == 0) {
            System.out.println("LIST IS EMPTY");
        } else {

            displayListEmployee(listSort);
        }
    }

    private String getFirstName() {
        String firstName = Ultility.getString("first name: ", "Error", Ultility.REGEX_STRING);
        return firstName;
    }

    private String getLastName() {
        String lastName = Ultility.getString("lastName: ", "Error", Ultility.REGEX_STRING);
        return lastName;
    }

    private String getPhone() {
        String phone = Ultility.getString("phone: ", "Error", Ultility.REGEX_PHONE);
        return phone;
    }

    private String getEmail() {
        String email = Ultility.getString("email: ", "Error", Ultility.REGEX_EMAIL);
        return email;
    }

    private String getAddress() {
        String address = Ultility.getString("address: ", "Error", Ultility.REGEX_STRING);
        return address;
    }

    private String getDOB() {
        String DOB = Ultility.getDate("DOB: ", "Error", Ultility.REGEX_DATE);
        return DOB;
    }

    private String getAgency() {
        String agency = Ultility.getString("agency: ", "Error", Ultility.REGEX_STRING);
        return agency;
    }

    private int getSex() {
        int sex = Ultility.getInt("Enter SEX (1: male, 0: female)", "Error", 0, 1);
        return sex;
    }

    private double getSalary() {
        double salary = Ultility.getDouble("ENTER SALARY: ", "Wrong", 0, Double.MAX_VALUE);
        return salary;
    }

    private int getID() {
        int id = Ultility.getInt("Enter id: ", "Error", 0, Integer.MAX_VALUE);
        return id;
    }

    private boolean checkWantToUpdate(String string) {
        String answer = Ultility.getString("Do you want to update " + string + " ? (y/n)", "It must be y or n ", Ultility.REGEX_Y_N);
        if (answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    void displayEmployee() {
        for (Employee employee : manage.getListEmployee()) {
            System.out.println(employee);
        }
    }

    private String getName() {
        String name = Ultility.getString("Enter name: ", "fsdfsdfds", Ultility.REGEX_STRING);
        return name;
    }

    private void displayListEmployee(List<Employee> listSearch) {
        for (Employee employee : listSearch) {
            System.out.println(employee);
        }
    }

}
