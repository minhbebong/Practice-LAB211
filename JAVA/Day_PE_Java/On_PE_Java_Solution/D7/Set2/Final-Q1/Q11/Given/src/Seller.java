
public class Seller extends Employee {  
    private double revenue;

    public Seller() {
    }

    public Seller(String name,double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }

    
    
    
    
     /*Complete the below function for second test case*/
    public double getSalary() {
        if(revenue<30000){
            return this.getSalarys()+0.05*this.revenue;
        }
        else{
            return this.getSalarys()+revenue*0.1;
        }
    }  
    
    //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return this.getName()+"\t"+this.getSalarys()+"\t"+revenue;
    }
    
}
