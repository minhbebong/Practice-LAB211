/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Circle;
import entity.Rectangle;
import entity.Triangle;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageShape {

    public void displayResult() {

    }

    public void input(Circle circle, Triangle triangle, Rectangle rectangle) {
        circle.input();
        triangle.input();
        rectangle.input();
    }

    public void displayResult(Circle circle, Triangle triangle, Rectangle rectangle) {
        circle.printResult();
        triangle.printResult();
        rectangle.printResult();
    }

}
