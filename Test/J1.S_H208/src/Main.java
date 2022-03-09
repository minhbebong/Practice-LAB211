
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {

    private static int swapDigitPairs(int number) {
        int result = 0;
        int unit = 1;
        while (number > 0) {
            int num1 = number % 10; //234 = 2
            number /= 10;     //0
            if (number == 0) {
                result += unit * num1;
                break;
            }
            int num2 = number % 10;
            number /= 10;
            result +=  unit*10 * num1 + unit * num2;
            //40 + 3 =43
            unit *= 100;
        }
        return result;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int number = checkInput.inputNumber("Enter number: ");
        System.out.println(swapDigitPairs(number));
    }
}
