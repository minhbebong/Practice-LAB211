package Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    //sap xep list tang dan theo Ten (khong phai ho ten)
    public void f1(List<Teacher> list) {
        
    }

    //tu vi tri co index = given index, sap xep list tang dan theo "salaryPerday"
    public void f2(List<Teacher> list, int index) {
        
    }

    //Xoa nhung teacher co tong luong cao nhat
    public void f3(List<Teacher> list) {
       
        
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        Teacher t0 = new Teacher(20, 75, "hoang van an", 50);
        Teacher t1 = new Teacher(10, 150, "le van long", 50);
        Teacher t2 = new Teacher(20, 45, "nguyen van binh", 50);
        Teacher t3 = new Teacher(25, 5, "trinh van leng", 50);
        Teacher t4 = new Teacher(5, 300, "ban van hao", 50);
        Teacher t5 = new Teacher(23, 10, "am van dung", 50);
        Teacher t6 = new Teacher(22, 65, "trinh van sam", 50);
        List<Teacher> listT = new ArrayList<>();
        listT.add(t0);
        listT.add(t1);
        listT.add(t2);
        listT.add(t3);
        listT.add(t4);
        listT.add(t5);
        listT.add(t6);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("input choice: ");
        choice = Integer.parseInt(sc.nextLine());
        int index = 0;
        switch (choice) {
            case 1:
                m.f1(listT);
                System.out.println("Name\t\tAge\tWorkday\tSalaryPerday");
                for (Teacher o : listT) {
                    System.out.println(o);
                }
                break;
            case 2:
                System.out.print("input index: ");
                index = Integer.parseInt(sc.nextLine());
                m.f2(listT, index);
                System.out.println("Name\t\tAge\tWorkday\tSalaryPerday");
                for (Teacher o : listT) {
                    System.out.println(o);
                }
                break;
            case 3:
                m.f3(listT);
                System.out.println("Name\t\tAge\tWorkday\tSalaryPerday");
                for (Teacher o : listT) {
                    System.out.println(o);
                }
                break;
            
        }
        
    }
}
