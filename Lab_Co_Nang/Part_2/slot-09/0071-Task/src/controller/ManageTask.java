/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Task;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageTask {

    List<Task> listTask = new ArrayList<>();

    public List<Task> getListTask() {
        return listTask;
    }

    public boolean checkOverlap(double planFrom, double planTo, String date, String assignee) {
        //loop to access all elements in list
        for (Task task : listTask) {
            //if date and assignee of task equal to parameter then compare to plan To
            if (task.getDate().compareTo(date) == 0 && task.getAssign().compareTo(assignee) == 0) {

                /*NOTE
            	 * from2 : parameter (user add on method "add task")
            	 * from1 : planFrom of task already in list 
            	 * to2   : parameter ( user add on method "add task")
            	 * to1   : planTo of task already in list
            	 * */
                //if from2 < from1, to2<= to1 or to2>to1 but to2 always higher than from 1
                if (planFrom < task.getPlanFrom() && planTo > task.getPlanFrom()) {
                    if (planTo <= task.getPlanTo() || planTo > task.getPlanTo()) {
                        return true;
                    }
                }
                //if from2 = from1 and to2 > from1 => return true
                if (planFrom == task.getPlanFrom() && planTo > task.getPlanFrom()) {
                    return true;
                }
                // if from2 > from1 and to2 >= to1  and from2 < to1=> return true
                if (planFrom > task.getPlanFrom() && planTo >= task.getPlanTo()
                        && planFrom < task.getPlanTo()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addTask(Task task) {
        listTask.add(task);
    }

    /**
     * get a task by ID
     *
     * @param id
     * @return task or null
     */
    public Task getTaskByID(int id) {
        for (Task task : listTask) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    /**
     * delete a task by ID
     *
     * @param id
     */
    public void deleteTask(int id) {

        listTask.remove(getTaskByID(id));

    }

    public List<Task> sortList() {
        Collections.sort(listTask, new Comparator<Task>() {

            @Override
            public int compare(Task o1, Task o2) {

                return o1.getId() - o2.getId();
            }
        });

        return listTask;
    }

}
