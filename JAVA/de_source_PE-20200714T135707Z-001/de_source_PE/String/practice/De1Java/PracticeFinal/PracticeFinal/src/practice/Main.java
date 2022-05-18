/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import book.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Vali v = new Vali();
        Book b0 = new Book("nguoi lai do song da", "truyen dai", "abc105hA1309ab", 26);
        Book b1 = new Book("lao hac", "truyen dai", "abH105hA1309az", 25);
        Book b2 = new Book("hat gao lang ta", "truyen dai", "MLN131", 19);
        Book b3 = new Book("conan", "truyen tranh", "abcMLN131", 19);
        Book b4 = new Book("than dong dat viet", "truyen dai", "efdacMLN131", 30);
        Book b5 = new Book("doraemon", "truyen tranh", "mklacMLN131", 25);
        Book b6 = new Book("songoku", "truyen tranh", "hfdacMLN", 29);
        Book b7 = new Book("chiec la cuoi cung", "truyen dai", "uklacMLN131", 29);
        Book b8 = new Book("nguyen ngoc ngan", "truyen dai", "123123123", 16);
        Book b9 = new Book("chung ta chi la ban", "truyen dai", "bcaMLN131", 17);
        List<Book> list = new ArrayList<>();
        list.add(b0);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        int choice = 0;
        System.out.print("input choice: ");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        int index = 0;
        String txt = "";
        switch(choice){
            case 1:
                int number = v.f1(list);
                System.out.println(number);
                break;
            case 2:
                System.out.print("input index: ");
                index = Integer.parseInt(sc.nextLine());
                txt = v.f2(list,index);
                System.out.println(txt);
                break;
            case 3:
                v.f3(list);
                for (Book book : list) {
                    System.out.println(book);
                }
                break;
            case 4:
                System.out.print("input index: ");
                index = Integer.parseInt(sc.nextLine());
                txt = v.f4(list,index);
                System.out.println(txt);
                break;
            case 5:
                v.f5(list);
                for (Book book : list) {
                    System.out.println(book);
                }
                break;
            case 6:
                System.out.print("input index: ");
                index = Integer.parseInt(sc.nextLine());
                txt = v.f6(list,index);
                System.out.println(txt);
                break;
            case 7:
                v.f7(list);
                for (Book book : list) {
                    System.out.println(book);
                }
                break;
            case 8:
                List<Book> listB = v.f8(list);
                for (Book book : listB) {
                    System.out.println(book);
                }
                break;
            case 9:
                System.out.print("input index: ");
                index = Integer.parseInt(sc.nextLine());
                v.f9(list,index);
                for (Book book : list) {
                    System.out.println(book);
                }
                break;
            case 10:
                v.f10(list);
                for (Book book : list) {
                    System.out.println(book);
                }
                break;
        }
    }
}
