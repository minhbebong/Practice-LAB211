/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Hoan toan hanh phuc
 */
public class SoftByAge {

    Person p = new Person();

    public void sortByAge(ArrayList<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person t, Person t1) {
                return t.getAge() - t1.getAge();
            }
        });
    }
    
    public void sortByName(ArrayList<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person t, Person t1) {
                return t.getName().compareTo(t1.getName());
            }
        });
    }
}
