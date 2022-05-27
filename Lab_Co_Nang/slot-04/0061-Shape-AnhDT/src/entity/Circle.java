/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import util.Utility;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * 2;

    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.printf("Radius: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n", radius, getArea(), getPerimeter());
    }
    
    public void input() {
         radius = Utility.getNumberDouble("Radius: ", "Wrong",0, Double.MAX_VALUE);
    }

}
