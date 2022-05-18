// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;
class Main {
   public static void main(String args[]) throws Exception{
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter number of Product: ");
       int n = Integer.parseInt(in.readLine());
       ArrayList<Product> a = new ArrayList();     
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Enter category ID: ");          
           String catID = in.readLine();           
           System.out.print("Enter product name: ");
           String name = in.readLine();           
           System.out.print("Enter product price: ");           
           int price = Integer.parseInt(in.readLine());                     
           a.add(new Product(catID, name, price));
       }
       System.out.println("");
       System.out.print("Enter test function(1-f1;2-f2): ");
       int c = Integer.parseInt(in.readLine());
       IProduct i = new MyProduct();
       System.out.println("OUTPUT:");    
       if(c == 1)
          System.out.println(i.f1(a));       
       else if(c == 2)
          System.out.println(i.f2(a));
   }
 }
