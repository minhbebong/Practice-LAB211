/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bo.ManagePerson;

/**
 *
 * @author PHAM KHAC VINH
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ManagePerson manage = new ManagePerson();

        //input person information
        manage.addPerson();

        //sort list person ascending
        manage.sortPerson();
    }

}
