
import java.text.DecimalFormat;


public class VNBook extends Book{
    public String code;
   
    public VNBook(String name, int price, String code) { 
        super(name, price);
        //your code goes here      
         this.code=code;
    }    
    //add and complete your other methods here (if needed)
    public double calSalesPrice(){
        
        if(this.code.charAt(0)=='D'||this.code.charAt(0)=='d'){
            return this.price;
        }
        return this.price+0.1*this.price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return super.toString()+"\t"+df.format(calSalesPrice());
    }
    
    
    
}
