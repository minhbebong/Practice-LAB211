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
public class Task {

    private static int auto_Increment = 1;
    private int id;
    private int taskType;
    private String name;
    private String date;
    private double from, to;
    private String assignee, reviewer;

    public Task(int taskType, String name, String date, double from, double to, String assignee, String reviewer) {
        this.id = auto_Increment++;
        this.taskType = taskType;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskType() {
        String taskTypeResult = null;
        switch (taskType) {
            case 1:
                taskTypeResult = "Code";
                break;
            case 2:
                taskTypeResult = "Test";
                break;
            case 3:
                taskTypeResult = "Design";
                break;
            case 4:
                taskTypeResult = "Review ";
                break;
        }
        return taskTypeResult;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {

        return to;
    }

    public void setTo(double to) {
        if (to >= 0) {
            this.to = to;
        }
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        if (assignee != null) {
            this.assignee = assignee;

        }
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", taskType=" + getTaskType() + ", name=" + name + ", date=" + date + ", from=" + from + ", to=" + to + ", assignee=" + assignee + ", reviewer=" + reviewer + '}';
    }

    
    
    

}
