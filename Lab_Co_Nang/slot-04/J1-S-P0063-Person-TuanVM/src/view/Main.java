/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {
    public static void main(String[] args) {
        View_Person view = new View_Person();
        //b1: tao ra 1 cai danh sach va lam viec voi person ben trong danh sach do
        List<Person> listPerson = new ArrayList<Person>();
        
        //1. input person information
        view.inputPerson(listPerson);
        
        //2. sort person by salary
        view.sortBySalary(listPerson);
    }
    
}
