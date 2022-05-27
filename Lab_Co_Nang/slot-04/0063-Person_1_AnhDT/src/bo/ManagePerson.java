/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import entity.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManagePerson {

    private List<Person> listPerson = new ArrayList<>();
    /**
     * this function use to add a person
     */
    public void addPerson() {
        System.out.println("=====Management Person programer=====");
        //nhap thong tin cua person cho toi khi nao danh sach du 3 thi thoi
        while (listPerson.size() < 3) {
            Person person = new Person();
            person.inputPersonInfo();
            listPerson.add(person);
        }
    }
    
    /**
     * @return listPerson
     */
    public List<Person> getListPerson() {
        return listPerson;
    }
    
    /**
     * this function use to sort person and display
     */
    public void sortPerson() {
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
        System.out.println("");
        for (Person person : listPerson) {
            System.out.println("Information of Person you have entered:");
            person.displayPersonInfo(person);
        }
    }

}
