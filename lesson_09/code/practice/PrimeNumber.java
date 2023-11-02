package practice;

import java.util.Scanner;

//Пользователь вводит натуральное число n.
// Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 ...
public class PrimeNumber {
    public static void main(String[] args) {
        // Algoritm:
        // Ljuboe celoe n budem probovatj delitj na chisla, menjsche ego, nachinaja s 2
        // 10 / 2 = 5 znachit ne prostoe chislo, 11 / 2, 3, 4, ...10 esli ne razdelilosj to chislo prostoe

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Input positive integer number: " );
        int number = scanner.nextInt();
        boolean isPrime = true;
        int div = 2; //  div eto delitelj
        while (div < number) {
            if (number % div == 0) {
                // esli razdelilosj chislo number na div ili 2
                isPrime = false;
                // vihod iz cikla mogno vihoditj iz cikla

            }
            div++;// uvelicjivaem parametr cikla
        }
        System.out.println( number + " is prime: " + isPrime );


    }
}
