/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {
    public static void main(String[] args) {
        View_Student view = new View_Student();
        List<Student> listStudent = new ArrayList<>();
        
        //input student information
        view.inputStudent(listStudent);
        
        //sort student by name
        view.sortStudent(listStudent);
        
        //display
        view.displayStudent(listStudent);
        
    }
    
}
