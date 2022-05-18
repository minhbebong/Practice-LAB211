
public class Course {   
     private double fee;
     private String name;
    public Course() {
    }

    //String name, double fee

    public Course(String name, double fee) {
        this.fee = fee;
        this.name = name;
    }
   
 
    public String getName() {
        return name;
    }
 
    //add and complete you other methods (if needed) here   

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

     
}
