/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Employee;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageEmployee {

    List<Employee> listEmployees = new ArrayList<>();

    public List<Employee> getListEmployee() {
        return listEmployees;
    }

    public void addEmployee(Employee employee) {
        listEmployees.add(employee);
    }

    public Employee getEmployeeByID(int id) {
        for (Employee employee : listEmployees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public boolean checkDuplicate(int IDUpdate) {
        for (Employee employee : listEmployees) {
            if (employee.getId() == IDUpdate) {
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(Employee employee) {
        listEmployees.remove(employee);
    }

    public List<Employee> getEmployeeByName(String name) {
        List<Employee> listSearch = new ArrayList<>();
        for (Employee employee : listEmployees) {
            if (employee.getFirstName().toUpperCase().contains(name.toUpperCase())
                    || employee.getLastName().toUpperCase().contains(name.toUpperCase())) {
                listSearch.add(employee);
            }
        }
        return listSearch;
    }

    public List<Employee> sortEmployee() {
        List<Employee> listSort = new ArrayList<>();
        listSort.addAll(listEmployees);
        /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < listSort.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < listSort.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (listSort.get(j).getSalary() > listSort.get(j + 1).getSalary()) {
                    Collections.swap(listSort, j, j + 1);
                }
            }
        }
        return listSort;
    }

}
