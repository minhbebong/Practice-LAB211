
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
        this.paid = paid;
        this.totalmoney = totalmoney;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public double getTotalmoney() {
        return totalmoney;
    }

    public boolean isPaid() {
        return paid;
    }
    
    public String toString(){
        return date+"\t"+name+"\t"+totalmoney+"\t"+paid;
    }
    
}
