
public class Bill {
    private String date;
    private String name;
    private double totalmoney;
    private boolean paid;

    public Bill() {
    }

    public Bill(String date, String name, double totalmoney, boolean paid) {
        this.date = date;
        this.name = name;
        this.totalmoney = totalmoney;
        this.paid = paid;
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
