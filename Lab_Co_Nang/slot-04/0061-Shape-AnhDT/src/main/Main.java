/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bo.ManageShape;
import entity.Circle;
import entity.Rectangle;
import entity.Triangle;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) {
        ManageShape manage = new ManageShape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        //input information
        manage.input(circle, triangle, rectangle);

        //display result
        manage.displayResult(circle, triangle, rectangle);
    }
}
