/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Vali {

    //dem xem co bao nhieu sach co ma chua ca so va chu
    public int f1(List<Book> a) {
        return 0;

    }

    //input index you want to change code
    //input code: MLN1051309hn
    //output code: MLN216309hn
    public String f2(List<Book> a, int index) {

        return "";
    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code: MLN216309hn
    public void f3(List<Book> a) {

    }

    //input index you want to change code
    //input code: MLN1051309hn
    //output code:mln1051309HN
    public String f4(List<Book> a, int index) {
        String name = a.get(index).getCode();
        String txt = "";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                txt = txt + Character.toLowerCase(name.charAt(i));
            } else if (Character.isLowerCase(name.charAt(i))) {
                txt = txt + Character.toUpperCase(name.charAt(i));
            } else {
                txt = txt + name.charAt(i);
            }
        }
        return txt;
    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code:mln1051309HN
    public void f5(List<Book> a) {

    }

    //input index you want to change code
    //input code: abc105hA1309ab
    //output code:bcd105hA1309bc
    public String f6(List<Book> a, int index) {
        String name = a.get(index).getCode();
        String txt = "";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLowerCase(name.charAt(i))) {
                int c = (int) name.charAt(i) + 1;
                txt = txt + (char) c;
            } else {
                txt = txt + name.charAt(i);
            }
        }
        return txt;
    }

    //sort assending by price, if price equal then assending by name
    //output code:bcd105hA1309bc
    public void f7(List<Book> a) {

    }

    //return list book co brand la "truyen tranh"
    public List<Book> f8(List<Book> a) {
        return null;
    }

    //sap xep list tang dan bat dau tu index nhap vao
    public void f9(List<Book> a, int index) {

    }

    //sap xep nhung book co brand la "truyen dai" tang dan theo gia
    public void f10(List<Book> a) {
        List<Book> list = new ArrayList<>();
        for (Book o : a) {
            if (o.getType().endsWith("truyen dai")) {
                list.add(o);
            }
        }
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
//        Collections.sort(a, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                if (o1.getPrice() > o2.getPrice()) {
//                    return 1;
//                } else if (o1.getPrice() < o2.getPrice()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getType().equals("truyen dai")) {
                a.set(i, list.get(count));
                count++;
            }
        }

    }

}
