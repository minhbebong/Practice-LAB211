
public class Striker extends Player {
    private boolean joined;
    private double bonus;

    public Striker() {
    }

    public Striker(int code, String name, String dob, double income, double bonus, boolean joined) {
        super(code, name, dob, income);        
        this.bonus = bonus;
        this.joined = joined;
    }
           
    @Override
    public String toString(){
        return super.toString()+"\t"+bonus+"\t"+joined;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getBonus() {
        if (joined=true)
            bonus = bonus + super.getIncome()*3/10;
        return bonus;
    }
    
    public int getYear(){
        String dob=getDob();
        String s=dob.substring(dob.lastIndexOf("/")+1, dob.length());
        int x= Integer.parseInt(s);
        return x;
    }
    
}
