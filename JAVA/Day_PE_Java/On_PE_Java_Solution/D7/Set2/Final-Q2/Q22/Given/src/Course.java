
public class Course { 
    public double fee;
    public String name;
//    public Course() {
//        throw new UnsupportedOperationException("Remove this line and implement your code here!");
//    }

    public Course() {
    }
    
    
//    public Course(String name, double fee) {
//        throw new UnsupportedOperationException("Remove this line and implement your code here!");
//    }
    
 
    public Course(String name,double fee) {
        this.fee = fee;
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
    //add and complete you other methods (if needed) here   
     
}
