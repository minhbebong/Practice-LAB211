
public class Pizza {
        public double diameter;
        public  int slice;
    public Pizza(double diameter, int slice) {
        //your code goes here 
        this.diameter=diameter;
        this.slice=slice;
        
    }    
   //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return diameter+"\t"+slice;
    }
     
}
