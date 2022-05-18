package Expense_100loc;


public class Expense {
    private int ID; 
    private String content;
    private String date;
    private double amount;
    //ctrl + space
    public Expense() {
    }
    public Expense(int ID, String content, String date, double amount) {
        this.ID = ID;
        this.content = content;
        this.date = date;
        this.amount = amount;
    }
    //right mouse + insert code + getter and setter
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

 
   
    @Override
    public String toString() {
        String out = String.format("%d%20s%20.0f%20s", ID, date, amount,content);
        return out;
    }
    
    
}
