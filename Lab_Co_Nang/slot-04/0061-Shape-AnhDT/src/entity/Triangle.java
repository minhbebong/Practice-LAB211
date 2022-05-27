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
public class Triangle extends Shape {
    private double sideA,sideB, sideC;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    
    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p-sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.printf("Side A: %s\n"
                + "Side B: %s\n"
                + "Side C: %s\n"
                + "Area: %s\n"
                + "Perimeter: %s\n",sideA,sideB, sideC, getArea(), getPerimeter());
    }
    
    public void input() {
        while (true) {
             sideA = Utility.getNumberDouble("sideA: ", "Wrong", 0, Double.MAX_VALUE);
             sideB = Utility.getNumberDouble("sideB: ", "Wrong", 0, Double.MAX_VALUE);
             sideC = Utility.getNumberDouble("sideC: ", "Wrong", 0, Double.MAX_VALUE);
            if (sideA + sideB > sideC && sideA + sideC > sideB && sideB +sideC > sideA) {
                break;
            }else {
                System.out.println("It not be triangle");
            }
        }
    }
}
