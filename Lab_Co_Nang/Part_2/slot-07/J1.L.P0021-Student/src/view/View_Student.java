/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageStudent;
import java.util.List;
import model.Report;
import model.Student;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Student {

    ManageStudent manage = new ManageStudent();

    void input() {
        if (manage.getSize() >= 1) {
            //if true == yes
            //false == no
            if (checkYesNo() == false) {
                return;
            }
        }

        //b1: input properties
        String id = getID();
        String name;
        while (true) {
            name = getName();
            //check name valid
            if (manage.checkNameValid(id, name) == false) {
                System.out.println("Name is wrong ");
            } else {
                break;
            }
        }
        int age = getAge();
        int semester = getSemester();
        int course = getCourse();

        if (manage.checkDuplicate(id, name, age, semester, course)) {
            System.out.println("Student existed");
        } else {
            Student student = new Student(id, name, age, semester, course);
            manage.addStudent(student);
            System.out.println("Add successfully !!");
        }

    }

    void findAndSort() {
        String name = getName();

        List<Student> listSearch = manage.getListStudentByName(name);
        if (listSearch.size() == 0) {
            System.out.println("NOT FOUND");
        } else {
            manage.sort(listSearch);
            displayListStudent(listSearch);
        }
    }

    void updateOrDelete() {
        String id = getID();

        List<Student> listFoundByID = manage.getStudentByID(id);
        if (listFoundByID.size() == 0) {
            System.out.println("NOT found");
        } else {
            //true = update
            //false = delete
            if (checkUpdateOrDelete()) {
                updateStudent(listFoundByID);
            } else {
                deleteStudent(listFoundByID);
            }
        }

    }

    void report() {
        for (Student firstStudent : manage.getListStudent()) {
            int total = 0;
            for (Student secondStudent : manage.getListStudent()) {
                if (firstStudent.getId().equalsIgnoreCase(secondStudent.getId())
                        && firstStudent.getCourse() == (secondStudent.getCourse())) {
                    total++;
                }

            }
            if (manage.checkExistReport(firstStudent, manage.getListReport()) == false) {
                manage.addReport(new Report(firstStudent.getId(), firstStudent.getName(), 
                        firstStudent.getCourse(), total));
            }
        }
        for (Report report : manage.getListReport()) {
            System.out.println(report);
        }
    }

    private String getID() {
        String id = Ultility.getString("Enter id: ", "Wrong", Ultility.REGEX_STRING);
        return id;
    }

    private String getName() {
        String name = Ultility.getString("Enter name: ", "Wrong", Ultility.REGEX_STRING);
        return name;
    }

    private int getAge() {
        int age = Ultility.getInt("Enter age: ", "Wrong", 0, 30);
        return age;
    }

    private int getSemester() {
        int semester = Ultility.getInt("Enter semester: ", "Wrong", 0, 15);
        return semester;
    }

    private int getCourse() {
        int course = Ultility.getInt("Enter course\n (1:Java\n 2:.NET \n 3: C/C++): ", "Wrong", 1, 3);
        return course;
    }

    private boolean checkYesNo() {
        String result = Ultility.getString("Do you want to continue (Y/N)?: ", "Must be y or n", Ultility.REGEX_Y_N);
        if (result.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    private void displayListStudent(List<Student> listSearch) {
        for (Student student : listSearch) {
            System.out.println(student);
        }
    }

    private boolean checkUpdateOrDelete() {
        String result = Ultility.getString("Do you want to update (U) or delete (D) ?: ", "Must be u or d", Ultility.REGEX_UD);
        if (result.equalsIgnoreCase("u")) {
            return true;
        }
        return false;
    }

    private void updateStudent(List<Student> listFoundByID) {
        System.out.printf("%-10s %-10s %-20s %-10s %-10s %-10s\n", "Ordinal", "ID", "Name", "Age", "Semester", "Course");
        for (int i = 0; i < listFoundByID.size(); i++) {
            System.out.printf("%-10s %s\n", i, listFoundByID.get(i));
        }

        int choice = Ultility.getInt("Enter record you want to update: ", "Wrong", 0, listFoundByID.size() - 1);
        Student student = listFoundByID.get(choice);
        
        //b2: nhap thuoc tinh
        String id = getID();
        String name = getName();
        int age = getAge();
        int semester = getSemester();
        int course = getCourse();
        
        //b3: chekc not update
        if (manage.checkNotUpdate(student,id,name, age, semester, course)) {
            System.out.println("YOU NOT UPDATE !!");
        }else{
            if (manage.checkDuplicate(id, name, age, semester, course)) {
                System.out.println("DUPLICATE RECORD");
            }else {
                student.setId(id);
                manage.updateAllName(name, id);
                student.setAge(age);
                student.setSemester(semester);
                student.setCourseName(course);
            }
        }
        
    }

    private void deleteStudent(List<Student> listFoundByID) {
        System.out.printf("%-10s %-10s %-20s %-10s %-10s %-10s\n", "Ordinal", "ID", "Name", "Age", "Semester", "Course");
        for (int i = 0; i < listFoundByID.size(); i++) {
            System.out.printf("%-10s %s\n", i, listFoundByID.get(i));
        }

        int choice = Ultility.getInt("Enter record you want to delete: ", "Wrong", 0, listFoundByID.size() - 1);
        Student student = listFoundByID.get(choice);

        manage.removeStudent(student);
        System.out.println("REMOVE SUCCESSFULL");
    }

}
