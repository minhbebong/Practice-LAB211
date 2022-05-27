/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MangePerson;
import java.util.List;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Person {

    MangePerson manage = new MangePerson();

    void inputPerson(List<Person> listPerson) {
        System.out.println("=====Management Person programer=====");

        //loop until list size is 3
        while (listPerson.size() < 3) {
            System.out.println("Input Information of Person");
            //b1: nhap thuoc tinh
            String name = getName();
            String address = getAddress();
            double salary = getSalary();

            //b2: tao doi tuong
            Person person = new Person(name, address, salary);

            //b2: them vao ben trong danh sach
            manage.addPerson(person, listPerson);
        }

    }

    void sortBySalary(List<Person> listPerson) {
        System.out.println();
        manage.sortPerson(listPerson);
        //loop to display person
        for (Person person : listPerson) {
            System.out.println("Information of Person you have entered:");
            System.out.println(person);
            System.out.println();
        }
    }

    private String getName() {
        String name = Ultility.getString("Enter name: ", Ultility.REGEX_STRING, "Name must be a string");
        return name;
    }

    private String getAddress() {
        String address = Ultility.getString("Enter address: ", Ultility.REGEX_STRING, "Name must be a string");
        return address;
    }

    private double getSalary() {
        double salary = Ultility.getDouble("Enter salary: ", 0, Double.MAX_VALUE, "Wrong");
        return salary;
    }

}
