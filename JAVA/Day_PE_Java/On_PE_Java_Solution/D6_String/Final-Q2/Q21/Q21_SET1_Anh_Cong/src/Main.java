// ======= DO NOT EDIT MAIN FUNCTION ============
import java.util.*;
import java.io.*;
class Main
{    
   public static int f1(ArrayList<Integer> a){
       int s=0;
       for(Integer I:a){
           if(I%2==0){
               s+=2;
           }
           s+=I;
       }
       return s;
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
