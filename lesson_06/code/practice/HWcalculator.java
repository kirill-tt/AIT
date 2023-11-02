package practice;

import java.io.InputStream;
import java.util.Scanner;

public class HWcalculator {
    public static void main(String[] args) {
        int n1, n2;
        int number;
        Scanner scanner = new Scanner( System.in );
        System.out.println( " Enter the first number: " );
        n1 = scanner.nextInt();
        System.out.println( " Enter second number: " );
        n2 = scanner.nextInt();
        System.out.println( " Enter a number between 1 and 5   " +
                "1 is + ;  " +
                "2 is - ;  " +
                "3 is * ;  " +
                "4 is / ;  " +
                "5 is % ;  " );
        number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println( "Your result is " + (n1 + n2) );
            }
            case 2 -> {
                System.out.println( "Your result is " + (n1 - n2) );
            }
            case 3 -> {
                System.out.println( "Your result is " + (n1 * n2) );
            }
            case 4 -> {
                System.out.println( "Your result is " + (n1 / n2) );
            }
            case 5 -> {
                System.out.println( "Your result is " + (n1 % n2) );
            }
            default -> {
                System.out.println( "Please enter numbers from 1 to 5:" );
            }

        }


    }
}
