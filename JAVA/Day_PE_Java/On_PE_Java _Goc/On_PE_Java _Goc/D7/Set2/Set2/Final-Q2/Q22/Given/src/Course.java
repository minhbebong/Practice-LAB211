
public class Course { 
    public double fee;
    public String name;
    public Course() {
    }

    
    
    public Course(String name, double fee) {
        this.name = name;
        this.fee = fee;
        /*throw new UnsupportedOperationException("Remove this line and implement your code here!");*/
    }
    
 

    //add and complete you other methods (if needed) here   

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
}
