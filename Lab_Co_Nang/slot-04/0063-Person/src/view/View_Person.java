/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ManagePerson;
import java.util.Collections;
import java.util.List;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Person {

    ManagePerson manage = new ManagePerson();

    void inputData() {
        //loop until size of list is 3
        while (manage.getListPerson().size() < 3) {
            //input person data
            String name = Utility.getString("Name: ", "Wrong", Utility.REGEX_NAME);
            String address = Utility.getString("Address: ", "Wrong", Utility.REGEX_ADDRESS);
            double salary = Utility.getDouble("Salary: ", "Wrong", 0, Double.MAX_VALUE);

            //create instance
            Person person = new Person(name, address, salary);
            manage.addPerson(person);
        }

    }

    void sortPerson() {
        List<Person> listPerson = manage.getListPerson();
         /*Loop use to accessed from the first to last element of array, 
        after each loop, one element is sorted*/
        for (int i = 0; i < listPerson.size(); i++) {
            /*Loop use to accessed first unsorted element to the element 
            stand before the last sorted element*/
            for (int j = 0; j < listPerson.size() - i -1; j++) {
                //compare each pair adjacent elements
                if (listPerson.get(j).getSalary() > listPerson.get(j+1).getSalary()) {
                    Collections.swap(listPerson, j, j+1);
                }
            }
        }
        
        for (Person person : listPerson) {
            System.out.println(person);
        }
        
    }

}
