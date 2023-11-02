package practice;

import java.util.Scanner;

//Напишите программу, которая принимает текущий час (от 0 до 23)
// и выводит приветствие
// в зависимости от времени суток (утро, день, вечер, ночь).
public class HWTimesOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Please write the current hour from 0 - 23: " );
        int hourOftime = scanner.nextInt();
        if (hourOftime >= 0 && hourOftime <= 4) {
            System.out.println( hourOftime + " Good night!" );
        } else if (hourOftime >= 5 && hourOftime < 12) {
            System.out.println( hourOftime + " Good morning!" );
        } else if (hourOftime >= 12 && hourOftime < 18) {
            System.out.println( hourOftime + " Good day!" );
        } else if (hourOftime >= 18 && hourOftime <= 23) {
            System.out.println( hourOftime + " Good evening!" );
        } else {
            System.out.println( "Wrong input." );
        }
    }
}
