/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageTask;
import java.util.List;
import model.Task;
import model.Ultility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Task {

    ManageTask manageTask = new ManageTask();

    void inputTask() {
        //initalize 
        int taskType;
        String requirementName, date, assignee, reviewer;
        double planFrom, planTo;

        //user input information task
        requirementName = getRequirementName();
        taskType = getTaskType();
        date = getDate();
        planFrom = getPlanFrom();
        planTo = getPlanTo(planFrom);
        assignee = getAssignee();
        reviewer = getReviewer();

        if (manageTask.getListTask().size() == 0) {
            Task task = new Task(taskType, requirementName, date, planFrom, planTo, assignee, reviewer);

            manageTask.addTask(task);
        } else if (manageTask.checkOverlap(planFrom, planTo, date, assignee)) {
            System.out.printf("This task in date ( %s )"
                    + "from time ( %s to %s )"
                    + " overlaps other task of assignee %s",
                    date, planFrom, planTo,
                    assignee);
            System.out.println("\nCan't add this task !!!!");
        } else {
            Task task = new Task(taskType, requirementName, date, planFrom, planTo, assignee, reviewer);
            manageTask.addTask(task);
            System.out.println("Add successfull !!");

        }

    }

    /**
     * this function use to input requirement name
     *
     * @return requirementName
     */
    public static String getRequirementName() {
        String requirementName = model.Ultility.getString("Requirement Name: ",
                "Name must be a string ", Ultility.REGEX_NAME);
        return requirementName;
    }

    /**
     * this function use to input taskType
     *
     * @return taskType
     */
    private static int getTaskType() {
        int taskType = Ultility.getInt("Task Type: ",
                "Task Type must be decimal integer ", 1, 4);
        return taskType;
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
        String assignee = Ultility.getString("Assignee: ",
                "Assignee must be a string ", "^[a-z A-Z]+$");
        return assignee;
    }

    /**
     * this function use to input reviewer
     *
     * @return reviewer
     */
    private static String getReviewer() {
        String reviewer = Ultility.getString("Reviewer: ",
                "Reviewer must be a string ", "^[a-z A-Z]+$");
        return reviewer;
    }

    void deleteTask() {
        //b1: nhap vao ID de mang di xoa 
        int id = getID();

        //b2: lay ve task dua tren ID nhap vao
        Task task = manageTask.getTaskByID(id);
        //if task == null => not found
        //else : delete task
        if (task == null) {
            System.out.println("NOT FOUND TASK");
        } else {
            manageTask.deleteTask(id);

        }
    }

    /**
     * this function use to input id
     *
     * @return id
     */
    private static int getID() {
        int id = Ultility.getInt("Enter id: ", "ID must be digit", 0, Integer.MAX_VALUE);
        return id;
    }

    void displayTask() {
        //sort list and assign to listTask
        List<Task> listTask = manageTask.sortList();
        System.out.println("-----------------------"
                + "--------------------------------------- "
                + "Task -------------------------------------------"
                + "--------------------");
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");

        for (Task task : listTask) {
            System.out.println(task);
        }
        System.out.println("\n\n");
    }

}
