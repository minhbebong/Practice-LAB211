package Expense_100loc;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class HandyExpense {
    //de check nhap tu 1-4
    public int getChoice(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter your choice: ");
        do{
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number < 1 && number > 4) {
                    System.out.print("Input number 1-4: ");
                    continue;
                }
            } catch (Exception e) {
                System.out.print("Please input valid number: ");
                continue;
            }
            break;
        }while(true);
        return number;
    }
    //check nhap id vao de xoa
    public int getID() {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("please try again ");
                continue;
            }
            break;
        }
        return id;
    }
    //check nhap double
    public double getDouble() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        do{
            try {
                System.out.print("Enter amount: ");
                number = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.print("Please enter valid number: ");
                continue;
            }
            break;
        }while(true);
        return number;
    }
    //check nhap date dung format
    public String getDates() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
        dateFormat.setLenient(false); 
        Date date;
        do{
            try {
                System.out.print("Enter date: ");
                date = dateFormat.parse(sc.nextLine());
            } catch (Exception e){
                System.out.print("Please enter valid date: ");
                continue;
            }
            break;
        }while(true);
        return dateFormat1.format(date);
    }
    //get content de check phai nhap gi day moi dc
    public String getContent() {
        String content = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter content: ");
            content = sc.nextLine();
            if (content.trim().equals("")) {
                continue;
            }else {
                break; //break de pha vo vong lap do while
            }
        } while (true);
        return content;
    }
    //print menu de in ra menu
    public void printMenu() {
        System.out.println("1. add");
        System.out.println("2. dispay");
        System.out.println("3. remove");
        System.out.println("4. exit");
    }
    //add la de add expense vao list Expense

    public void add(List<Expense> list) {
        String date = getDates();
        double amount = getDouble();
        String content = getContent();
        int length = list.size();
        int id = 0;
        if(list.size()==0){
            id = 1;
        }else{
            id = list.get(length-1).getID() + 1;
        }
        Expense e = new Expense(id, content, date, amount);//add properties to object
        list.add(e);
    }
    //display de show tat ca nhung object minh nhap
    public void displayAll(List<Expense> list) {
        double total = 0;
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i).toString()); //toString cua minh la ham in
            total = total + list.get(i).getAmount();
        }
        //sout + tab
        System.out.println("Total: "+total);   
    }
    public void remove(List<Expense> list) {
        int id = getID();
        boolean check = false;
        for(int i=0; i<list.size(); i++){
            if(id == list.get(i).getID()){
                list.remove(i);
                check = true; //exist
                break;
            }
        }
        if(check == true){
            System.out.println("remove succefully");
        }else {
            System.out.println("not exist");
        }
    }
    
    public static void main(String[] args) {
        HandyExpense he = new HandyExpense(); //khai bao doi tuong de goi den
        List<Expense> list = new ArrayList<>();//khoi tao trong main
        Scanner sc = new Scanner(System.in);
        while (true) {
            he.printMenu();
            int n = he.getChoice();
            switch (n) {
                case 1:
                    he.add(list);
                    break;
                case 2:
                    he.displayAll(list);
                    break;
                case 3:
                    he.remove(list);
                    break;
                case 4:
                    System.exit(0);//de nhat 
                    break;
            }
        }
    }
}
