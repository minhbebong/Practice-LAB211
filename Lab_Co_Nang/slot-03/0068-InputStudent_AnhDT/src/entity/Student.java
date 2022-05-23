/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import util.Utility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Student {

    private String name;
    private float mark;
    private String classes;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n"
                + "Classes: %s\n"
                + "Mark: %s", name, classes, mark);
    }

    public void inputInformation() {
        System.out.println("Please input student information ");
        //input information
        name = Utility.getString("Name: ", "Name must be letter", Utility.REGEX_NAME);
        classes = Utility.getString("Classes: ", "Classes must be letter or digit",
                Utility.REGEX_CLASSES);
        mark = Utility.getFloat("Mark: ", "Mark must be real number", 0, Float.MAX_VALUE);
    }

}
