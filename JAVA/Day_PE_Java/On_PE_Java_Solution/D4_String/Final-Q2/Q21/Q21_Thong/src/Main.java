// ======= DO NOT EDIT MAIN FUNCTION ============
import java.util.*;
import java.io.*;
class Main
{    
    public static int checkPrime(int n){
        if(n<2)
            return 0;
        else
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)
                      return 0;
        }
        return 1;
    }
   public static void f1(ArrayList<Integer> a){          
         /*
         * YOUR CODE WILL BE PLACED AFTER THIS COMMENT
         */
         int length=a.size();
         for(int i=length-1;i>=0;i--){
             if(checkPrime(a.get(i))==1){
                 a.set(i, a.get(i)+1);
                 break;
             }
         }
   }
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> a = new ArrayList<>();
       System.out.print("Enter number of item: ");
       int n = Integer.parseInt(in.readLine());
       for(int i = 0; i < n; i++){
           System.out.print("Number " + i + " (th): ");
           a.add(Integer.parseInt(in.readLine()));
       }       
       f1(a);
       System.out.println("OUTPUT:");
       for(int i = 0; i < a.size(); i++){
           System.out.println(a.get(i));
       }
   }
 }
