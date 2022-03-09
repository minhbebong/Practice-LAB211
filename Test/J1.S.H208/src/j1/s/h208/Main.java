/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h208;

/**
 *
 * @author Lenovo
 */
public class Main {
     
    private static int swapDigit(int number){
        int result = 0;
        int unit = 1;
        while (number > 0) {            
            int num1 = number % 10; // 34567 % 10 = 3456  7
            number /= 10;
            if (number == 0) {
                result += unit * num1;
                break;
            }
            int num2 = number % 10;
            number /= 10;
            result += unit * 10 * num1 + unit * num2;
                // 40 + 3 = 43
            unit *= 100;
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Validate.inputNumber("Enter your number : ");
        System.out.println("SwapBefore : "+ swapDigit(n));
    }
    
}
