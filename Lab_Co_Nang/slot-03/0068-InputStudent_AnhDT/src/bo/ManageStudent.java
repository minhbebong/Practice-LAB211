/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import entity.Student;
import util.Utility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageStudent {

    private List<Student> listStudent = new ArrayList<>();

    //mn mong muon import tat cac thu vien, hay cai gi can toi
    // ctrl + shift + i
    public List<Student> getListStudent() {
        return listStudent;
    }
    // / + shift 88 + enter
    
    /**
     * This function use to input Student
     */
    public void inputStudent() {
        System.out.println("====== Collection Sort Program ======");
        while (true) {
            //create instance
            Student student = new Student();
            student.inputInformation();
            //add to list

            listStudent.add(student);

            //continue ? 
            //if checkYesNo = false => user don't want continue => break
            if (!checkYesNo()) {
                break;
            }
        }
    }
    
    /**
     * ....
     * @return 
     */
    private boolean checkYesNo() {
        String result = Utility.getString("Do you want to enter more student information?(Y/N):",
                 "Must be Y or N", Utility.REGEX_YN);

        return result.equalsIgnoreCase("y");

    }

    public void sortStudent() {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    public void displayStudent() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("-------------Student" + (i + 1) + "-------------");
            System.out.println(listStudent.get(i));
        }
    }

}
