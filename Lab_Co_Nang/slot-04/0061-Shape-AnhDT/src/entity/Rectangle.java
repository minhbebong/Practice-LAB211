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
public class Rectangle extends Shape {

    private double width, length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    double getArea() {
        return (width * length);
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.printf("Width: %s\n"
                + "Length: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n", width, length, getArea(), getPerimeter());
    }

    public void input() {
        while (true) {
             width = Utility.getNumberDouble("width: ", "Wrong", 0, Double.MAX_VALUE);
             length = Utility.getNumberDouble("length: ", "Wrong", 0, Double.MAX_VALUE);
            if (width > length) {
                System.out.println("Width cannot greater than length");
            }else {
                break;
            }
        }

    }

}
