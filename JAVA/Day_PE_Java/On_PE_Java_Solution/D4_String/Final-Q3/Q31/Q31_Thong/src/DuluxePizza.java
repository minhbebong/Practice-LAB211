
public class DuluxePizza extends Pizza{
        public String addedTopping;
    public DuluxePizza(String addedTopping, double diameter, int slice) { 
        super(diameter, slice);
        //your code goes here
        this.addedTopping=addedTopping;
    }   
    
    //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return addedTopping + "\t\t"+ super.toString();
    }
    
}
