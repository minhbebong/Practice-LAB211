package Linear_Search_50Loc;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    
    private Scanner sc = new Scanner(System.in);
    
    public int inputInt(String mess) {
        System.out.print(mess);
        while(true){
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < 0) {
                    System.out.print("Please input position number");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an valid number: ");
            }
        }
    }
}
