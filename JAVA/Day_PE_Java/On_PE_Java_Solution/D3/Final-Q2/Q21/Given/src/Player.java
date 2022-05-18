
public class Player {
    private int code;
    private String name;
    private String dob;
    private double income;

    public Player() {
    }

    public Player(int code, String name, String dob, double income) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.income = income;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
    
    public String toString(){
        return code+"\t"+name+"\t"+dob+"\t"+income;
    }
    
    
}
