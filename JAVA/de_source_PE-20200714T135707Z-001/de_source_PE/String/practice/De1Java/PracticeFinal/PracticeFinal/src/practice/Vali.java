/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import book.*;
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

    //dem xem co bao nhieu sach co code chua ca so va chu
    public int f1(List<Book> a) {
        int count = 0;
        for (Book o : a) {
            boolean check1 = false;
            boolean check2 = false;
            String code = o.getCode();//abH105hA1309ab
            for (int i = 0; i < code.length(); i++) {
                if (Character.isDigit(code.charAt(i))) {
                    check1 = true;
                }
                if (Character.isLetter(code.charAt(i))) {
                    check2 = true;
                }
            }
            if (check1 == true && check2 == true) {
                count++;
            }
        }
        return count;

    }

    //input index you want to change code
    //input code: MLN1051309hn
    //output code:MLN2162419hn
    public String f2(List<Book> a, int index) {
        String result = "";
        String code = a.get(index).getCode();
        for (int i = 0; i < code.length(); i++) {
            //48 - 56
            //'0' -> 48
            //'1' -> 49
            if (code.charAt(i) >= '0' && code.charAt(i) <= '8') {
//                int number = Integer.parseInt(code.charAt(i)+"")+1;
//                result = result + number;//ab + 3 = ab3
                char c = (char) ((int) code.charAt(i) + 1);
                result = result + c;
            } else {
                //abH105hA1309ab
                result = result + code.charAt(i);
            }
        }
        return result;
    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code:MLN2162419hn
    public void f3(List<Book> a) {
        for (Book o : a) {
            String result = "";
            String code = o.getCode();
            for (int i = 0; i < code.length(); i++) {
                if (code.charAt(i) >= '0' && code.charAt(i) <= '8') {
                    result = result + (char) ((int) code.charAt(i) + 1);
                } else {
                    result = result + code.charAt(i);
                }
            }
            o.setCode(result);
        }
    }

    //input index you want to change code
    //input code: MLN1051309hn  /code
    //output code:mln1051309HN  /result
    public String f4(List<Book> a, int index) {
        String result = "";
        String code = a.get(index).getCode();
        for (int i = 0; i < code.length(); i++) {
            if (Character.isUpperCase(code.charAt(i))) {
                result = result + Character.toLowerCase(code.charAt(i));
            } else if (Character.isLowerCase(code.charAt(i))) {
                result = result + Character.toUpperCase(code.charAt(i));
            } else {
                result = result + code.charAt(i);
            }
        }
        return result;
    }

    //change all code of all book
    //input code: MLN1051309hn
    //output code:mln1051309HN
    public void f5(List<Book> a) {
        for (Book o : a) {
            String result = "";
            String code = o.getCode();
            for (int i = 0; i < code.length(); i++) {
                if (Character.isUpperCase(code.charAt(i))) {
                    result = result + Character.toLowerCase(code.charAt(i));
                } else if (Character.isLowerCase(code.charAt(i))) {
                    result = result + Character.toUpperCase(code.charAt(i));
                } else {
                    result = result + code.charAt(i);
                }
            }
            o.setCode(result);
        }

    }

    //input index you want to change code
    //input code: abc105hA1309ab
    //output code:bcd105iA1309bc
    public String f6(List<Book> a, int index) {
        String result = "";
        String code = a.get(index).getCode();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) >= 'a' && code.charAt(i) < 'z') {
                char c = (char) ((int) code.charAt(i) + 1);
                result = result + c;
            } else if (code.charAt(i) == 'z') {
                result = result + 'a';
            } else {
                result = result + code.charAt(i);
            }
        }
        return result;

    }

    //sort assending by price, if price equal then assending by name
    //output code:bcd105hA1309bc
    public void f7(List<Book> a) {
        Collections.sort(a, new Comparator<Book>() {
            @Override
            public int compare(practice.Book o1, practice.Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
            }
        });
    }

    //return list book co type la "truyen tranh"
    public List<Book> f8(List<Book> a) {
        List<Book> listB = new ArrayList<>();
        for (Book o : a) {
            if (o.getType().equalsIgnoreCase("truyen tranh")) {
                listB.add(o);
            }
        }
        return listB;
    }

    //sap xep list tang dan theo price bat dau tu index nhap vao
    public void f9(List<Book> a, int index) {
        //tao ra list tu vi tri index - toi
        List<Book> listS = new ArrayList<>();
        for (int i = index; i < a.size(); i++) {
            listS.add(a.get(i));
            a.remove(i);
            i--;
        }
        Collections.sort(listS, new Comparator<Book>() {
            @Override
            public int compare(practice.Book o1, practice.Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Book o : listS) {
            a.add(o);
        }

    }

    //sap xep nhung book co brand la "truyen dai" tang dan theo price
    public void f10(List<Book> a) {
        List<Book> listD = new ArrayList<>();
        for (Book o : a) {
            if (o.getType().equals("truyen dai")) {
                listD.add(o);
            }
        }
        Collections.sort(listD, new Comparator<Book>() {
            @Override
            public int compare(practice.Book o1, practice.Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getType().equals("truyen dai")) {
                a.set(i, listD.get(count));//thay doi i bang phan tu gi
                count++;
            }
        }
    }

}

//         nguyen ngoc ngan          truyen dai           123123123           16.000000
//        chung ta chi la ban          truyen dai           bcaMLN131           17.000000
//        hat gao lang ta          truyen dai              MLN131           19.000000
//        Book b3 = new Book("conan", "truyen tranh", "abcMLN131", 19);
//         lao hac          truyen dai      abH105hA1309az           25.000000
//        Book b5 = new Book("doraemon", "truyen tranh", "mklacMLN131", 25);
//        Book b6 = new Book("songoku", "truyen tranh", "hfdacMLN", 29);
//        nguoi lai do song da          truyen dai      abc105hA1309ab           26.000000
//        Book b8 = new Book("nguyen ngoc ngan", "truyen dai", "123123123", 16);
//        Book b9 = new Book("chung ta chi la ban", "truyen dai", "bcaMLN131", 17);


//    nguyen ngoc ngan          truyen dai           123123123           16.000000
// chung ta chi la ban          truyen dai           bcaMLN131           17.000000
//     hat gao lang ta          truyen dai              MLN131           19.000000
//             lao hac          truyen dai      abH105hA1309az           25.000000
//nguoi lai do song da          truyen dai      abc105hA1309ab           26.000000
//  chiec la cuoi cung          truyen dai         uklacMLN131           29.000000
//  than dong dat viet          truyen dai         efdacMLN131           30.000000
