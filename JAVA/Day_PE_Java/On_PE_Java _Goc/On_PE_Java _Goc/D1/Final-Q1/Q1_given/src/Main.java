
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
        System.out.print("Enter date of a Bill: ");
        String date = in.readLine();
        System.out.print("Enter name of a Bill: ");
        String name = in.readLine();
        System.out.print("Enter total money: ");
        double totalMoney = Double.parseDouble(in.readLine());
        System.out.print("Enter bill has been paid (true or fasle): ");
        boolean paid = Boolean.parseBoolean(in.readLine());
        Bill B = new Bill(date, name, paid, totalMoney);
        System.out.println("1. TC = 1 - Test getName()");
        System.out.println("2. TC = 2 - Test setDate()");
        System.out.println("3. TC = 3 - Test setTotalmoney()");
        System.out.println("4. TC = 4 - Test toString()");

        System.out.print("Enter TC: ");
        int TC = Integer.parseInt(in.readLine());

        switch (TC) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(B.getName());
                break;
            case 2:
                System.out.print("Enter new date: ");
                String newDate = in.readLine();
                B.setDate(newDate);
                System.out.println("OUTPUT:");
                System.out.println(B.getDate());
                break;
            case 3:
                System.out.print("Enter new Total money: ");
                double newTotalMoney = Double.parseDouble(in.readLine());
                B.setTotalmoney(newTotalMoney);
                System.out.println("OUTPUT:");
                System.out.println(B.getTotalmoney());
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(B.toString());
                break;
        }

    }

}
