
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter code of a driver: ");
        int code =Integer.parseInt(in.readLine());
        System.out.print("Enter name of a driver: ");
        String name =in.readLine();
        System.out.print("Enter year of a driver: ");
        int year =Integer.parseInt(in.readLine());
        System.out.print("Enter certificateDate of a driver: ");
        int certificateDate =Integer.parseInt(in.readLine());
        
        Driver D = new Driver(code, name, year);
        TaxiDriver TXD = new TaxiDriver(code, name, year, certificateDate);
        System.out.println("1. TC = 1 - test toString funtion");
        System.out.println("2. TC = 2 - test toString funtion");
        System.out.println("3. TC = 3 - test toString funtion");
        
        System.out.print("Enter TC:");
        int TC= Integer.parseInt(in.readLine());
        switch(TC){
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(D.toString());
                System.out.println(TXD.toString());
                break;
            case 2:
                System.out.println("OUTPUT:");
                System.out.println(TXD.getSeniority());
                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(TXD.getName());
                break;
        }
        
    }
}
