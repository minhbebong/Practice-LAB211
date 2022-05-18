/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class TaxiDriver extends Driver{
    int certificateDate;
    int seniority;

    public TaxiDriver() {
    }

    public TaxiDriver(int code, String name, int year,int certificateDate) {
        super(code, name, year);
        this.certificateDate = certificateDate;
    }

    public int getSeniority() {
        return 2018-certificateDate;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return getCode()+"\t"+getName()+"\t"+getYear()+"\t"+ certificateDate + "\t" + 3;
    }
    
    
}
