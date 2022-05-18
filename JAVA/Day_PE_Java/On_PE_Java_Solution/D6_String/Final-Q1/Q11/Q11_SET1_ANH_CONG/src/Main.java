// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
class Main
{
   public static int f1(String s){
       
       /*       
        * your code before
       */
       //new requirement
       //calculate and return the number of digit characters in string s
       //ex: the quick brown fox 2015 -> 4
       int count=0;
       String s1[]=s.split("\\s");
       for(int i=0;i<s1.length;i++){
           if(s1[i].length()<=4){
               count++;
           }
       }
       return count;
   }
   public static void main(String args[]) throws Exception
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String s = "";
       System.out.print("Enter a string s: ");
       s = in.readLine();
       System.out.println("OUTPUT:");
       System.out.println(f1(s));
   }
 }
