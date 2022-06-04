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
public class Report {

    String id;
    private String name;
    private int course;
    private int totalCourse;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Report(String id, String name, int course, int totalCourse) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.totalCourse = totalCourse;
    }

    public String getName() {
        return name;
    }
    
    public String getCourseName() {
        String result = null;
        switch (course) {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-10s | %-10s", name, getCourseName(), totalCourse);
    }
}
