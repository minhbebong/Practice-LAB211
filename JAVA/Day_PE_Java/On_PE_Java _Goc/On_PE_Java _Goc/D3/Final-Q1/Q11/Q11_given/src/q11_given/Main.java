package q11_given;

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
        System.out.print("Enter Player code:");
        String code = in.readLine();
        System.out.print("Enter Player name:");
        String name = in.readLine();
        System.out.print("Enter Player date of birth: ");
        String dob = in.readLine();
        System.out.print("Enter Player income:");
        double income =Double.parseDouble(in.readLine());
        System.out.print("Enter Player bonus:");
        double bonus =Double.parseDouble(in.readLine());
        
        Player P = new Player(code, name, dob, income, bonus);
        System.out.println("1. TC = 1 - test getDob()");
        System.out.println("2. TC = 2 - test setIncome()");
        System.out.println("3. TC = 3 - test setBonus()");
        System.out.println("4. TC = 4 - test toString()");
        
        System.out.print("Enter TC:");
        int TC= Integer.parseInt(in.readLine());
        switch(TC){
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(P.getDob());
                break;
            case 2:
                System.out.print("Enter new income:");
                P.setIncome(Double.parseDouble(in.readLine()));
                System.out.println("OUTPUT:");
                System.out.println(P.getIncome());
                break;
            case 3:
                System.out.print("Enter new bonus:");
                P.setBonus(Double.parseDouble(in.readLine()));
                System.out.println("OUTPUT:");
                System.out.println(P.getBonus());
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(P.toString());
                break;
        }
    }
    
}
