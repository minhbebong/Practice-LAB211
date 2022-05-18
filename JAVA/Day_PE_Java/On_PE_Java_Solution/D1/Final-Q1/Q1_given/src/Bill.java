
public class Bill {
    String date;
    String name;
    double totalmoney;
    boolean paid;

    public Bill() {
    }

    public Bill(String date, String name, boolean paid, double totalmoney) {
        this.date = date;
        this.name = name;
        this.totalmoney = totalmoney;
        this.paid = paid;
    }
    
    public String getName() {
        return name;
    }
    public double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(double totalmoney) {
        this.totalmoney = totalmoney;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String toString(){
        return date+"  "+name+"\t"+paid+"  "+totalmoney;
    }
}
