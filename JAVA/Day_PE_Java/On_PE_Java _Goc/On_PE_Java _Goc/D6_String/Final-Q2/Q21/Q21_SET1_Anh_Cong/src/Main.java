// ======= DO NOT EDIT MAIN FUNCTION ============
import java.util.*;
import java.io.*;
class Main
{    
   public static int f1(ArrayList<Integer> a){
       int sum=0;
       for(int i = 0; i < a.size(); i++){
           if (a.get(i)%2 == 0) {
               a.set(i,a.get(i)+2);
           }
       }
       for (int i=0; i<a.size(); i++){
           sum = sum + a.get(i);
       }
       return sum;
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
       System.out.println("OUTPUT:");
       System.out.println(f1(a));
   }
 }
