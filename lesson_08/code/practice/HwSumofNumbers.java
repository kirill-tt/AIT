package practice;
//Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class HwSumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Input positive integer number: " );
        int number = scanner.nextInt();
        System.out.println( "Your number is :" + number );
        int sum = 0;
        while (number > 0) {
            int result = number % 10;
            sum += result;
            number /= 10;
        }
        System.out.println( "Sum of number is: " + sum );
    }
}
