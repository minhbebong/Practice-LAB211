/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class MangePerson {

    public void addPerson(Person person, List<Person> listPerson) {
        listPerson.add(person);
    }

    public void sortPerson(List<Person> listPerson) {
        /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < listPerson.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < listPerson.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (listPerson.get(j).getSalary() > listPerson.get(j + 1).getSalary()) {
                    Collections.swap(listPerson, j, j + 1);
                }
            }
        }
    }
}
