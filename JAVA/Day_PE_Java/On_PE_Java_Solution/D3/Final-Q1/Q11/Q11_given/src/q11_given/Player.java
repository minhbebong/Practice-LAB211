package q11_given;


public class Player {
    private String code;
    private String name;
    private String dob;
    private double income;
    private double bonus;

    public Player() {
    }

    public Player(String code, String name, String dob, double income, double bonus) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.income = income;
        this.bonus = bonus;
    }

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String toString(){
        return getCode()+"\t"+name+"  "+dob+"   "+income+"\t"+bonus;
    }
}
