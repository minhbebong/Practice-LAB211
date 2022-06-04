/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageEastAsiaCountries;
import java.util.List;
import model.EastAsiaCountry;

/**
 *
 * @author PHAM KHAC VINH
 */
public class View_Country {
    ManageEastAsiaCountries manage = new ManageEastAsiaCountries();

    void displayCountryJustInput() {
        if (manage.getListCountry().size() == 0) {
            System.out.println("NO COUNTRY IN LIST");
            return;
        }else {
             System.out.format("%-10s %-15s %-15s %-15s\n", "ID", "Name", "AREA", "Terrarin");
             manage.getListCountry().get(manage.getListCountry().size()-1).display();
        }

    }

    void searchCountry() {
        //b1: cho nguoi dung nhap ten quoc gia
        String name = getName();
        
        //b2: neu ma ko tim thay thi hien thi ra loi, nguoc lai thi hien thi ra tat ca quoc gia tim thay
        List<EastAsiaCountry> listFound = manage.getListCountryByName(name);
        
        //neu listFound co size == 0 <=> ko co quoc gia tim thay
        if (listFound.size() == 0) {
            System.out.println("NOT FOUND COUNTRY");
        }else {
            //nguoc lai thi se hien thi ra 
            displayListCountry(listFound);
        }
        
    }

    void sortAndDisplay() {
        if (manage.getListCountry().size() == 0) {
            System.out.println("NO COUNTRY IN LIST");
            return;
        }
        
        //b1: sort
        manage.sortCountry();
        
        //b2: hien thi danh sach sau khi sort
        displayListCountry(manage.getListCountry());
        
    }

    void inputCountry() {
        String code = getCode();
        String name = getName();
        double area = getArea();
        String terrarin = getTerrarin();
        
        //check duplicate Code
        //if has a country's code in list => tell eror
        if(manage.getCountryByCode(code) != null) {
            System.out.println("DUPLICATE CODE !!");
            return;
        } else {
            EastAsiaCountry country = new EastAsiaCountry(terrarin, code, name, area);
            manage.addCountry(country);
            System.out.format("%-10s %-15s %-15s %-15s\n", "ID", "Name", "AREA", "Terrarin");
            country.display();
        }

    }
    
    
    

    private String getCode() {
         String code = Ultility.getString("Enter code: ", "ERROR", Ultility.REGEX_STRING);
         return code;
    }

    private String getName() {
        String name = Ultility.getString("Enter name: ", "ERROR", Ultility.REGEX_STRING);
         return name;
    }

    private double getArea() {
        double area = Ultility.getDouble("Enter area: ", "ERROR",1 , Double.MAX_VALUE);
        return area;

    }

    private String getTerrarin() {
        String terrarin = Ultility.getString("Enter terrarin: ", "ERROR", Ultility.REGEX_STRING);
         return terrarin;
    }

    private void displayListCountry(List<EastAsiaCountry> listFound) {
        System.out.format("%-10s %-15s %-15s %-15s\n", "ID", "Name", "AREA", "Terrarin");
        for (EastAsiaCountry eastAsiaCountry : listFound) {
            eastAsiaCountry.display();
        }
    }
    
}
