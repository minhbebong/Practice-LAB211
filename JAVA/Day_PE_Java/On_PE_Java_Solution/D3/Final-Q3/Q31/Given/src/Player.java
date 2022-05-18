/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class Player {
    int code;
    String name;
    String dob;
    double income;
    boolean joined;
    double bonus;

    public Player() {
    }

    public Player(int code, String name, String dob, boolean joined, double income) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.income = income;
        this.joined = joined;
        this.bonus = bonus;
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

    public boolean isJoined() {
        return joined;
    }

    public void setJoined(boolean joined) {
        this.joined = joined;
    }


    public void setBonus(double bonus) {
        if(joined==true){
            this.bonus=0.5*income;
        }else
            this.bonus=0;
    }

    @Override
    public String toString() {
        setBonus(bonus);
        return name + "\t" + dob + "\t" + income + "\t" + bonus;
    }
    
    
    
    
    
}
