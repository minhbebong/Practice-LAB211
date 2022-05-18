/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ThinkPro
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ProjectMember P = new ProjectMember();
        System.out.print("Enter Project ID: ");
        P.projectid = Integer.parseInt(in.readLine());
        System.out.print("Enter Employee : ");
        P.employee = in.readLine();
        System.out.print("Enter IsfullTime (true or false): ");
        P.isFullTime = Boolean.parseBoolean(in.readLine());
        System.out.print("Enter Hours : ");
        P.hours = Integer.parseInt(in.readLine());
        System.out.println("1. TC = 1 - test getProjectid()");
        System.out.println("2. TC = 2 - test setHours()");
        System.out.println("3. TC = 3 - test setFullTime()");
        System.out.println("4. TC = 4 - test getEmployee()");
        System.out.print("5. TC = 5 - test toString()Enter\nTC:");

        int TC = Integer.parseInt(in.readLine());

        switch (TC) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(P.getProjectid());
                break;
            case 2:
                System.out.println("Enter new Hours: ");
                P.setHours(Integer.parseInt(in.readLine()));
                System.out.println("OUTPUT:");
                System.out.println(P.hours);
                break;
            case 3:
                System.out.println("Enter new isFullTime: ");
                P.setIsFullTime(Boolean.parseBoolean(in.readLine()));
                System.out.println("OUTPUT:");
                System.out.println(P.isFullTime);
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(P.getEmployee());
                break;
            case 5:
                System.out.println("OUTPUT:");
                System.out.println(P.toString());
                break;
        }
    }

}
