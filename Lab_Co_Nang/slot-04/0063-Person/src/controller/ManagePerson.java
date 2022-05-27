/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManagePerson {
    private List<Person> listPerson = new ArrayList<>();

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void addPerson(Person person) {
        listPerson.add(person);
    }

    
    
}
