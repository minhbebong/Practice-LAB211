// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.StringTokenizer;
class Main
{
   public static int f1(String s){
        /*an
        * YOUR CODE WILL BE PLACED AFTER THIS COMMENT
        */

           s=s.toLowerCase();
        int count =0;
        String [] s1=s.split("\\s");
        
        for(String w:s1){
            if(w.contains("u")||w.contains("e")||w.contains("o")||w.contains("a")||w.contains("i"))
                count++;
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
