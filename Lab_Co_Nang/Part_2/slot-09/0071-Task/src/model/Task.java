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
	private static int autoIncrement = 1;
    private int id;
    private int taskTypeId;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String assign;
    private String reviewer;

    public Task(int taskTypeId, String requirementName, String date, 
            double planFrom, double planTo, String assign,
            String reviewer) {
        super();
        this.id = autoIncrement++;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assign = assign;
        this.reviewer = reviewer;
    }

    public Task() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        if (taskTypeId <=4 && taskTypeId >= 1) {
            this.taskTypeId = taskTypeId;
        }
    }

    public String getTaskTypeName() {
        String taskName = null;
        switch (taskTypeId) {
            case 1:
                taskName = "Code";
                break;
            case 2:
                taskName = "Test";
                break;
            case 3:
                taskName = "Design";
                break;
            case 4:
                taskName = "Review";
                break;
        }
        return taskName;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        if (requirementName != null) {
            this.requirementName = requirementName;
            
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", id, requirementName, getTaskTypeName(),
                date, planTo - planFrom, assign, reviewer);
    }

}
