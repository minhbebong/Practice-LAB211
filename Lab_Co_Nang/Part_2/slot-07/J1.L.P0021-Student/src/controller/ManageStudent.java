/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Report;
import model.Student;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageStudent {

    List<Student> listStudent = new ArrayList<Student>();
    List<Report> listReport = new ArrayList<>();

    public List<Student> getListStudent() {
        return listStudent;
    }

    public int getSize() {
        return listStudent.size();
    }

    public boolean checkNameValid(String id, String name) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id) && !student.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;

    }

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public boolean checkDuplicate(String id, String name, int age, int semester, int course) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)
                    && student.getName().equalsIgnoreCase(name)
                    && student.getAge() == (age)
                    && student.getSemester() == (semester)
                    && student.getCourse() == (course)) {
                return true;
            }
        }
        return false;
    }

    public List<Student> getListStudentByName(String name) {
        List<Student> listSearch = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getName().toUpperCase().contains(name.toUpperCase())) {
                listSearch.add(student);
            }
        }
        return listSearch;
    }

    public void sort(List<Student> listSearch) {
        /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < listSearch.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < listSearch.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (listSearch.get(j).getAge() > listSearch.get(j + 1).getAge()) {
                    Collections.swap(listSearch, j, j + 1);
                }
            }
        }
    }

    public List<Student> getStudentByID(String id) {
        List<Student> listSearch = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)) {
                listSearch.add(student);
            }
        }
        return listSearch;
    }

    public void removeStudent(Student student) {
        listStudent.remove(student);
    }

    public boolean checkNotUpdate(Student student, String id, String name, int age, int semester, int course) {
        if (student.getId().equalsIgnoreCase(id)
                && student.getName().equalsIgnoreCase(name)
                && student.getSemester() == (semester)
                && student.getCourse() == (course)
                && student.getAge() == (age)) {
            return true;
        }
        return false;

    }

    public void updateAllName(String name, String id) {
        for (Student student : listStudent) {
            if (student.getId().equalsIgnoreCase(id)) {
                student.setName(name);
            }
        }
    }

    public List<Report> getListReport() {
        return listReport;
    }

    public boolean checkExistReport(Student firstStudent, List<Report> listReport) {
        for (Report report : listReport) {
            if (report.getId().equalsIgnoreCase(firstStudent.getId())
                    && report.getCourse() == (firstStudent.getCourse())) {
                return true;
            }
        }
        return false;
    }

    public void addReport(Report report) {
        listReport.add(report);
    }

}
