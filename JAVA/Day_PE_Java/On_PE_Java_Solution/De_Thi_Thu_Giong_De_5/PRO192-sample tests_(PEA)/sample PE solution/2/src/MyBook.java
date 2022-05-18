import java.util.*;
//Your task is to complete this class 
public class MyBook implements IBook {    
    //write the definition of method f1 here 
    @Override
    public String f1(ArrayList<Book> a) {
Book x = a.get(0);
return(x.getName());
    }  
    
    //write the definition of method f2 here 
    @Override
    public int f2(ArrayList<Book> a, int price) { 
Book x; int n,i,s;
n = a.size();
s = 0;
for(i=0;i<n;i++) {
   x = a.get(i);
   if(x.getPrice()>=price) s++;
}
return(s);
    }    
    //add and complete you other methods (if needed) here   
     
}
