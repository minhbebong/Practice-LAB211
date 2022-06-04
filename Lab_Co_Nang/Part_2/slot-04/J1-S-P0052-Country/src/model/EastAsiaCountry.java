/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PHAM KHAC VINH
 */
public class EastAsiaCountry extends Country{
    protected String terrarin;

    public EastAsiaCountry() {
    }

    public EastAsiaCountry(String terrarin, String code, String name, double area) {
        super(code, name, area);
        this.terrarin = terrarin;
    }

    public String getTerrarin() {
        return terrarin;
    }

    public void setTerrarin(String terrarin) {
        this.terrarin = terrarin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
    public void display() {
        System.out.format("%-10s %-15s %-15s %-15s\n", code, name, area, terrarin);
    }
    
    
    
    
}
