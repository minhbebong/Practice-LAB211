
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CompareDate {
    public Date inputDateFormat(String mess, String format){
        Date date = null;
        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setLenient(false);
        Scanner sc = new Scanner(System.in);
        System.out.println(mess);
        while (true) {            
            try {
                date = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invaild date, please input again: ");
            }
        }
        return date;
    }
     
    public static void main(String[] args) {
        Date firstDate, secondDate;
        CompareDate cd = new CompareDate();
        firstDate = cd.inputDateFormat("Please enter the first date : ", "MMM/dd/yyyy");
        secondDate = cd.inputDateFormat("Please enter the second date : ", "dd/MM/yyyy");
        if (firstDate.before(secondDate)) {
            System.out.println("Date 1 is before Date 2");
        }else if (secondDate.before(firstDate)) {
            System.out.println("Date 2 is before Date 1");
        }else{
            System.out.println("Date 1 is equal Date 2");
        }
    }
}
