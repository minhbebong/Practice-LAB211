
public class PhoneBill extends Bill {
    double discount;

    public PhoneBill() {
    }

    public PhoneBill(String date, String name, boolean paid, double discount, double totalmoney) {
        super(date, name, paid, totalmoney);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double getTotalmoney(){
        double totalmoney = super.getTotalmoney();
        totalmoney -= discount;
        return totalmoney;
    }
    
    @Override
    public String toString(){
        return super.getDate()+"\t"+super.getName()+"\t"+discount+"\t"+getTotalmoney()+"\t"+super.isPaid();
    }
}
