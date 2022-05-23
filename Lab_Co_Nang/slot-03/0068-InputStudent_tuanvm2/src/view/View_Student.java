/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Student;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Student {


    /**
     * This function use to input Student information
     */
    void inputStudent(List<Student> listStudent) {
        System.out.println("====== Collection Sort Program ======");
        while (true) {
            System.out.println("Please input student information ");
            //input information
            String name = Utility.getString("Name: ", "Name must be letter", Utility.REGEX_NAME);
            String classes = Utility.getString("Classes: ", "Classes must be letter or digit",
                    Utility.REGEX_CLASSES);
            float mark = Utility.getFloat("Mark: ", "Mark must be real number", 0, Float.MAX_VALUE);

            //create instance
            Student student = new Student(name, mark, classes);

            //add to list
           listStudent.add(student);

            //continue ? 
            //if checkYesNo = false => user don't want continue => break
            if (!checkYesNo()) {
                break;
            }
        }

    }

    void sortStudent(List<Student> listStudent) {

        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

    }

    void displayStudent(List<Student> listStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("-------------Student" + (i + 1) + "-------------");
            System.out.println(listStudent.get(i));
        }
    }

    private boolean checkYesNo() {
        String result = Utility.getString("Do you want to enter more student information?(Y/N):",
                 "Must be Y or N", Utility.REGEX_YN);

        //if result = "y" ( case sensitive ) => return true;
        //else return false;
//        if (result.equalsIgnoreCase("y")) {
//            return true;
//        }else {
//            return false;
//        }
        return result.equalsIgnoreCase("y");

    }

}
