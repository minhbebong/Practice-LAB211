
import java.util.ArrayList;
//Your job is to complete this class 
//this class will implement IFlower interface
public class MyCake implements ICake
{

    //write the definition of method getHighestPrice here 
    @Override
    public String getHighestPrice(ArrayList a) {
         String out = "";         
         //your codes goes here
         double maxSalePrice=0;
         for(int i=0;i<a.size();i++){
             Cake c=(Cake)a.get(i);
             if(maxSalePrice<(c.price+c.itax)){
                 maxSalePrice=c.price+c.itax;
             }
         }
         for(int i=0;i<a.size();i++){
             Cake c=(Cake)a.get(i);
             if(maxSalePrice==(c.price+c.itax)){
                 out=c.name;
             }
         }
         return out;
    }
 
   
    //write the definition of method count here 
    @Override
    public int count(ArrayList a) {
        int out = -1;
        //your codes goes here  
        Cake c1=(Cake)a.get(0);
        for(int i=1;i<a.size();i++){
            
            Cake c=(Cake)a.get(i);
            if(c.itax<c1.itax){
                out++;
            }
        }
        return out;
    }
    
    //add and complete you other methods (if needed) here   
     
}
