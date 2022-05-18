/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Hoan toan hanh phuc
 */
public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        SoftByAge s = new SoftByAge();
        
        ArrayList<Person> listPerson = new ArrayList();
        listPerson.add(new Person("Babe", 3, 2000));
        listPerson.add(new Person("An", 9, 2000));
        listPerson.add(new Person("Daddy", 6, 2000));
        listPerson.add(new Person("Canxi", 5, 2000));
        
        System.out.print("Enter n: ");
        int n = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            p.InputInfor();
            listPerson.add(p);
        }
        
        for(int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).name+"\t"+listPerson.get(i).getAge()+"\t"+listPerson.get(i).salary);
        }
        
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                if(o1.age>o2.age){
//                    return 1;
//                }else if(o1.age==o2.age){
//                    return 0;
//                }else{
//                    return -1;
//                }
                return o1.age-o2.age;
            }
        });
        
        System.out.println("list after sorted by age:");
        for(int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).name+"\t"+listPerson.get(i).getAge()+"\t"+listPerson.get(i).salary);
        }
        
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                if(o1.name.compareToIgnoreCase(o2.name)>0){
//                    return 1;
//                }else if(o1.name.compareToIgnoreCase(o2.name)==0){
//                    return 0;
//                }else{
//                    return -1;
//                }
                return o1.name.compareToIgnoreCase(o2.name);
                
            }
        });
        System.out.println("list after sorted by name:");
        for(int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).name+"\t"+listPerson.get(i).getAge()+"\t"+listPerson.get(i).salary);
        }
        
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.salary > o2.salary) {
                    return 1;
                } else if (o1.salary < o2.salary) {
                    return -1;
                } else {
                    return 0;
                }
                
            }
        });
        System.out.println("list after sorted by salary:");
        for(int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).name+"\t"+listPerson.get(i).getAge()+"\t"+listPerson.get(i).salary);
        }
       // s.sortByAge(listPerson);
//        s.sortByName(listPerson);
        
//        for (Person p1 : listPerson) {
//            System.out.println(p1);
//        }
    }

}
