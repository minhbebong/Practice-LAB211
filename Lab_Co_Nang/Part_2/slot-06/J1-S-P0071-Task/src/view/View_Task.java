/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageTask;
import model.Task;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Task {

    ManageTask manage = new ManageTask();

    void inputTask() {
        //initalize 
        int taskType;
        String name, date, assignee, reviewer;
        double planFrom, planTo;

        //user input information task
        name = getRequirementName();
        taskType = getTaskType();
        date = getDate();
        planFrom = getPlanFrom();
        planTo = getPlanTo(planFrom);
        assignee = getAssignee();
        reviewer = getReviewer();

         Task task = new Task(taskType, name, date, planFrom, planTo, assignee, reviewer);
        if (manage.getListTask().size() == 0) {
            manage.addTask(task);
        }
        else if (manage.checkOverlap(planFrom, planTo, date, assignee)) {
            System.out.println("This task overlaps ");
        } else {
            manage.addTask(task);

        }

    }

    void showTask() {
        for (Task task : manage.getListTask()) {
            System.out.println(task);
        }
    }

    void deleteTask() {
        int id = getId();
        
        Task task = manage.getTaskByID(id);
        
        if (task == null) {
            System.out.println("NOT FOUND");
        }else {
            manage.removeTask(task);
        }
        
        
        
    }

    /**
     * this function use to input requirement name
     *
     * @return requirementName
     */
    private static String getRequirementName() {
//        String requirementName = Ultility.getString("Requirement Name: ",
//                "Name must be a string ", Ultility.REGEX_STRING);
        return "1";
    }

    /**
     * this function use to input taskType
     *
     * @return taskType
     */
    private static int getTaskType() {
//        int taskType = Ultility.getInt("Task Type: ",
//                "Task Type must be decimal integer ", 1, 4);
        return 1;
    }

    /**
     * this function use to input date
     *
     * @return date
     */
    private static String getDate() {
        String date = Ultility.getDate("Date: ", "Format must be"
                + " dd-MM-yyyy", "\\d{1,2}[-]\\d{1,2}[-]\\d{4}");
        return date;
    }

    /**
     * this function use to input planFrom
     *
     * @return planFrom
     */
    private static double getPlanFrom() {
        double planFrom = Ultility.getDouble("From: ", "From[8.0"
                + " - 17]", 8.0, 17);
        return planFrom;
    }

    /**
     * this function use to input planTo
     *
     * @return planTo
     */
    private static double getPlanTo(double planFrom) {
        double planTo = Ultility.getDouble("To: ", "To[" + (planFrom + 0.5)
                + " - 17.5]", (planFrom + 0.5), 17.5);
        return planTo;
    }

    /**
     * this function use to input assignee
     *
     * @return assignee
     */
    private static String getAssignee() {
//        String assignee = Ultility.getString("Assignee: ",
//                "Assignee must be a string ", "^[a-z A-Z]+$");
        return "a";
    }

    /**
     * this function use to input reviewer
     *
     * @return reviewer
     */
    private static String getReviewer() {
//        String reviewer = Ultility.getString("Reviewer: ",
//                "Reviewer must be a string ", "^[a-z A-Z]+$");
        return "a";
    }

    private int getId() {
        int id = Ultility.getInt("Enter id: ", "Wrong", 0, Integer.MAX_VALUE);
        return id;
    }

}
