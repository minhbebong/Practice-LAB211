/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bo.ManageStudent;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {
    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        
        //input student information
        manage.inputStudent();
        
        //sort student by name
        manage.sortStudent();
        
        //display
        manage.displayStudent();
        
    }
    
}
