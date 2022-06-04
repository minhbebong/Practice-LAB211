/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Student {

    private String id, name;
    private int age, semester, courseName;

    public Student(String id, String name, int age, int semester, int courseName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    
    public int getCourse() {
        return courseName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        String result = null;
        switch (courseName) {
            case 1:
                result = "Java";
                break;
            case 2:
                result = ".Net";
                break;
            case 3:
                result = "C/C++";
                break;

        }

        return result;
    }

    public void setCourseName(int courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10s %-10s %-10s", id, name, age, semester, getCourseName());
    }
    
    

}
