/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.EastAsiaCountry;

/**
 *
 * @author PHAM KHAC VINH
 */
public class ManageEastAsiaCountries {
    
    List<EastAsiaCountry> listCountry = new ArrayList<>();
    
    public EastAsiaCountry getCountryByCode(String code) {
        //su dung vong lap de tim kiem. neu nhu co quoc gia nao co code trung voi code paramter => return that country
        //con ko het vong lap ma ko tra ve dc quoc gia nao thi se tra ve null
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            if (eastAsiaCountry.getCode().equalsIgnoreCase(code)) {
                return eastAsiaCountry;
            }
        }
        
        return null;

    }
    
    public List<EastAsiaCountry> getListCountry() {
        return listCountry;
    }

    public void addCountry(EastAsiaCountry country ) {
        listCountry.add(country);
    }

    public List<EastAsiaCountry> getListCountryByName(String name ) {
        List<EastAsiaCountry> listFound = new ArrayList<>();
        //loop from first to last elements. If country has name contain name paramter => add into listFound
        for (EastAsiaCountry eastAsiaCountry : listCountry) {
            if (eastAsiaCountry.getName().toUpperCase().contains(name.toUpperCase())) {
                listFound.add(eastAsiaCountry);
            }
        }
        return listFound;
    }
    
    public List<EastAsiaCountry> sortCountry() {
         /*Loop from the first to last person , 
        after each loop, one person is sorted*/
        for (int i = 0; i < listCountry.size(); i++) {
            //Loop from first to last person through unsorted person
            for (int j = 0; j < listCountry.size() - 1 - i; j++) {
                //swap two person if not in ascending order
                if (listCountry.get(j).getName().equals(listCountry.get(j + 1).getName()) == false) {
                    Collections.swap(listCountry, j, j + 1);
                }
            }
        }
        return listCountry;
    }
    
    
}
