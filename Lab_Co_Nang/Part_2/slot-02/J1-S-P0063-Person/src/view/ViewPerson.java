/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManagePerson;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ViewPerson {

    ManagePerson manage = new ManagePerson();

    void inputPerson() {
        while (manage.getListStudent().size() < 3) {
            System.out.println("=====Management Person programer=====\n"
                    + "Input Information of Person");
            System.out.println(".......");

            String name = getName();
            String address = getAddress();
            double salary = getSalary();

            Person person = new Person(name, address, salary);
            manage.addPerson(person);
        }

    }

    void sortPersonBySalary() {
        if (manage.getListStudent().size() == 0) {
            System.out.println("NOT ENOUGH PERSON");
            return;
        }

        manage.sortBySalary();

    }

    void displayPerson() {
        if (manage.getListStudent().size() == 0) {
            System.out.println("NOT ENOUGH PERSON");
            return;
        }
        for (Person person : manage.getListStudent()) {
            System.out.println(person);
        }
    }

    private String getName() {
        String name = Ultility.getString("Enter name: ", "....", Ultility.REGEX_STRING);
        return name;
    }

    private String getAddress() {
        String name = Ultility.getString("Enter address: ", "....", Ultility.REGEX_STRING);
        return name;
    }

    private double getSalary() {
        double salary = Ultility.getDouble("Enter salary: ", "....", 0, Double.MAX_VALUE);
        return salary;
    }

}
