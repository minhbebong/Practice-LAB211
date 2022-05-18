import java.util.*;
//Your task is to complete this class 
public class MyProduct implements IProduct
{    
    //write the definition of method f1 here 
    @Override
    public String f1(ArrayList<Product> a) {
        double max=0;
        String ID=a.get(0).catID;
         for(int i=0;i<a.size()-1;i++){
             int sum=a.get(i).price;
             int quantity=1;
             for(int j=i+1;j<a.size();j++){
                 if(a.get(i).catID.equals(a.get(j).catID)){
                     sum+=a.get(j).price;
                     quantity++;
                 }
             }
             if((sum/quantity)>=max){
                 max=sum/quantity;
                 ID=a.get(i).catID;
             }
         }
         return ID;
    }  
    
    //write the definition of method f2 here 
    @Override
    public int f2(ArrayList<Product> a) {
        int count=0;
        for (int i=0; i<a.size(); i++) {
            if(a.get(i).price >= 20){
                count++;
            }
        }
        return count;
    }    
    //add and complete you other methods (if needed) here   
     
}
