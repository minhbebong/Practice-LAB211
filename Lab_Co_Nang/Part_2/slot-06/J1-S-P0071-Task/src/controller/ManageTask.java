/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Task;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageTask {

    List<Task> listTask = new ArrayList<>();

    public void addTask(Task task) {
        listTask.add(task);
    }

    public List<Task> getListTask() {
        return listTask;
    }

    public boolean checkOverlap(double planFrom, double planTo, String date, String assignee) {
        //task in list: 1
        //parameter: 2
        for (Task task : listTask) {
            if (task.getDate().equals(date) && task.getAssignee().equalsIgnoreCase(assignee)) {
                if (planTo <= task.getFrom() || planFrom >= task.getTo()) {
                    if (task.equals(listTask.get(listTask.size() - 1))) {
                        return false;
                    }
                }
//                if (planFrom >= task.getTo()) {
//                    return true;
//                }
            } else {
                if (task.equals(listTask.get(listTask.size() - 1))) {
                    return false;
                }
            }
        }

        return true;
    }

    public Task getTaskByID(int id) {
        for (Task task : listTask) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void removeTask(Task task) {
        listTask.remove(task);
    }

}
