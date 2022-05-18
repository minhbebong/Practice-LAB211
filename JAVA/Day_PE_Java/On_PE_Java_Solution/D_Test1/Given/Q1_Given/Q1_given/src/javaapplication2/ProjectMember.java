/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author ThinkPro
 */
public class ProjectMember {
    int projectid;
    String employee;
    boolean isFullTime;
    int hours;

    public int getProjectid() {
        return projectid;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public String getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return projectid +" "+ employee +" "+ isFullTime + " " + hours;
    }

    
    
    
}
