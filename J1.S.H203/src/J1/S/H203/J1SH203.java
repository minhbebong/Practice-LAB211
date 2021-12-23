
package J1.S.H203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class J1SH203 {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static void printReverse(String str){
        String listString[] = str.split("\\s+");
        str = "";
        for(int i=listString.length-1; i>=0; i--){
            str += listString[i]+" ";
        }
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        System.out.println(str.trim());
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str;
        do {            
           str = bufferedReader.readLine();
           if(str.isEmpty()){
               System.out.println("String not empty!");
           }
        } while (str.isEmpty());
        printReverse(str);
    }
}
