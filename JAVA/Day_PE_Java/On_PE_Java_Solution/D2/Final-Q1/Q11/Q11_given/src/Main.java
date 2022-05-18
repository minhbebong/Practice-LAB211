
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
        System.out.print("Enter Book code: ");
        String code = in.readLine();
        System.out.print("Enter Book title: ");
        String title = in.readLine();
        System.out.print("Enter Book price: ");
        double price = Double.parseDouble(in.readLine());
        System.out.print("Enter Book quantity: ");
        int quantity = Integer.parseInt(in.readLine());

        Book B = new Book(code, title, price, quantity);
        System.out.println("1. TC = 1 - test getTiltle()");
        System.out.println("2. TC = 2 - test setPrice()");
        System.out.println("3. TC = 3 - test setQuantity()");
        System.out.println("4. TC = 4 - test toString()");
        System.out.print("Enter TC: ");
        int TC = Integer.parseInt(in.readLine());
        switch (TC) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(B.getTitle());
                break;
            case 2:
                System.out.print("Enter new price: ");
                double newPrice = Double.parseDouble(in.readLine());
                B.setPrice(newPrice);
                System.out.println("OUTPUT:");
                System.out.println(B.getPrice());
                break;
            case 3:
                System.out.print("Enter new quantity: ");
                int newQuantity = Integer.parseInt(in.readLine());
                B.setQuantity(newQuantity);
                System.out.println("OUTPUT:");
                System.out.println(B.getQuantity());
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(B.toString());
                break;
        }

    }
}
