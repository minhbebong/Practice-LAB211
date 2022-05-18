
package p0011;

import java.util.Scanner;

public class P0011 {
    static Scanner sc = new Scanner(System.in);     
    static String getValidNumberInStringConvert(int base) {      
        String input;
        String digitCheck = null;
        if (base == 2) {
            digitCheck = "01";
        } else if (base == 10) {
            digitCheck = "0123456789";
        } else if (base == 16) {
            digitCheck = "0123456789ABCDEF";
        }
        while (true) {
            System.out.print("Enter your input number:");
            input = sc.nextLine();
            boolean check = true;
            for(int i=0; i<input.length(); i++){
                if(!(digitCheck.indexOf(Character.toString(input.charAt(i)))>=0)){
                    check = false;
                    System.out.println("Invalid !!");
                    break;
                }
            }
            if(check) break;
        }
        return input;
    }

    static String convertDecTo(String dec, int base) {
        String digitCheck;
        if (base == 2){
            digitCheck = "01";
        } else {
            digitCheck = "0123456789ABCDEF";
        }
        String answer = "";
        int tempDec = Integer.parseInt(dec);
        while (tempDec != 0) {
            int div = tempDec / base;
            int mod = tempDec % base;
            answer = digitCheck.charAt(mod) + answer;
            tempDec = div;
        }
        return answer;
    }
    static String convertToDec(String input, int base) {
        String digitCheck = null;
        if (base == 2){
            digitCheck = "01";
        } else if (base == 16) {
            digitCheck = "0123456789ABCDEF";
        }
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int value = digitCheck.indexOf(String.valueOf(ch));
            int pow = (int) Math.pow(base, (input.length() - 1) - i);
            answer += value * pow;
        }
        return String.valueOf(answer);
    }



    public static void main(String[] args) {
        System.out.println("Enter 1 to binary, 2 to decimal, 3 to hexa!");
        String input, output;
        while (true) {
            System.out.print("Choose base input: ");
            input = sc.nextLine();
            if (input.equals("1") || input.equals("2") || input.equals("3")) {
                break;
            } else {
                System.out.println("ERROR");
            }
        }
        while (true) {
            System.out.print("Choose base output: ");
            output = sc.nextLine();
            if (output.equals("1") || output.equals("2") || output.equals("3")) {
                break;
            } else {
                System.out.println("ERROR");
            }
        }
        int inputBase = convertToBase(input);
        int outputBase = convertToBase(output);
        
        input = getValidNumberInStringConvert(inputBase);
        
        if (inputBase == outputBase) {
            System.out.println(input + "(" + inputBase + ") = " + input + "(" + outputBase + ")");
        } else {
            String temp = null;
            switch (inputBase) {
                case 2:
                    temp = convertToDec(input, 2);
                    if (outputBase == 16) {
                        temp = convertDecTo(temp, 16);
                    }
                    break;
                case 10:
                    if (outputBase == 2) {
                        temp = convertDecTo(input,2);
                    } else {
                        temp = convertDecTo(input,16);
                    }
                    break;
                case 16:
                    temp = convertToDec(input,16);
                    if (outputBase == 2) {
                        temp = convertDecTo(temp,2);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(input + "(" + inputBase + ") = " + temp + "(" + outputBase + ")");
        }
    }
    private static int convertToBase(String input) {
        if (input.equals("1")) {
            return 2;
        }
        if (input.equals("2")) {
            return 10;
        }
        return 16;
    }

}
