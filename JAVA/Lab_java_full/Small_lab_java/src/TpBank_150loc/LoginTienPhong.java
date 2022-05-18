package TpBank_150loc;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginTienPhong {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LoginTienPhong login = new LoginTienPhong();
        login.methodStart();
    }

    public void methodOptions() {
        System.out.println("=========Login Tien Phong Bank’s Ebank===========");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public void methodStart() {
        String input;
        do {
            methodOptions();
            input = scan.nextLine();
            switch (input) {
                case "1":
                    // Locale vi_Locale = new Locale("vi", "Vn");
                    ResourceBundle bundle_vi = ResourceBundle.getBundle("TpBank_150loc.language_vi_VN");
                    loginSytem(bundle_vi);
                    break;
                case "2":
                    //Locale en_Locale = new Locale("en", "US");
                    ResourceBundle bundle_en = ResourceBundle.getBundle("TpBank_150loc.language_en_US");
                    loginSytem(bundle_en);
                    break;
            }
        } while (!input.equals("3"));
    }

    ResourceBundle bundle;

    public void loginSytem(ResourceBundle bundle) {
        checkAccount(bundle);
        checkPassword(bundle);
        checkCapcha(bundle);
    }

    //checkPhone
    public void checkAccount(ResourceBundle bundle) {
        while (true) {
            ///dòng này để làm gì
            System.out.println(bundle.getString("account"));

            String username = scan.nextLine();
            //bình thường là mình dùng do while, try catch, if else để check
            //thì đấy là các của sinh viên đang học
            //còn nếu ở công ty thì họ sẽ dùng matches để input phải đúng chính xác 
            //100% yêu cầu của công ty.
            //[0-9] là chỉ nhận số từ 0-9
            //{10} là chỉ nhận đúng 10 số, ít hơn hay nhiều hơn đều
            //không nhận
            Pattern p = Pattern.compile("^[0-9]{10}$");
            Matcher m = p.matcher(username);
            if (m.find()) {
                break;
            } else {
                System.out.println(bundle.getString("check.account"));
            }
        }
    }

    public void checkPassword(ResourceBundle bundle) {
        int check1 = 0;
        int check2 = 0;
        while (true) {
            System.out.println(bundle.getString("password"));
            String password = scan.nextLine();

            if (password.length() >= 8) {
                while (true) {
                    for (int i = 0; i < password.length(); i++) {
                        //char la 1 ki tu, string la 1 chuoi
                        char x = password.charAt(i);//bước lấy ra từng kí tự trong chuỗi
                        //password.charAt(i)
                        if (Character.isLetter(x)) {
                            check1 = 1;
                        }
                        if (Character.isDigit(x)) {
                            check2 = 1;
                        }
                    }
                    break;
                }
                if (check1 == 1 && check2 == 1) {
                    System.out.println(bundle.getString("right.password"));
                    break;
                } else {
                    System.out.println(bundle.getString("wrong.password1"));
                }
            } else {
                System.out.println(bundle.getString("wrong.password2"));
            }
        }
    }

    public StringBuffer randomCapcha() {
        String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final int N = alphabet.length();
        // giờ lấy random kiểu gì
        //lấy theo kiểu output = alphabet.charAT(i);
        //chỉ cần random ra thằng i thì tức là random ra dc thằng output;
        //công việc 1: random ra thằng i phải nằm trong khoảng 0 - 62;
        //JHk7
        //capcha = J
        //capcha = JH
        //capcha = JHk
        Random r = new Random();
        //n la do dai cua anphabet
        //cong viec la random ra 1 thang nam trong anphabet
        //thi dung ham r.nextInt(N) voi n = anphabet.length().
        //r.nextInt(62) la random ra so tu 0-6

        //vi sao dung stringbuffer: la de dung ham append de add nhung thang random sau vao chuoi
        StringBuffer capcha = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            char c = alphabet.charAt(r.nextInt(N));
            capcha.append(c);
            alphabet = alphabet.replaceAll(c + "", "");
        }
        System.out.println(capcha);
        return capcha;
    }

    public void checkCapcha(ResourceBundle bundle) {
        String capcha = "";
        while (true) {
            System.out.println(bundle.getString("capcha"));
            capcha = randomCapcha().toString();
            String input = "";
            input = scan.nextLine();
            //kieu String thuong thì dùng equal
            //con stringbuffer thì phải dùng contentEqual
            if (capcha.contains(input)) {
                System.out.println(bundle.getString("right.capcha"));
                break;
            } else {
                System.out.println(bundle.getString("wrong.capcha"));
            }
        }
    }

}
