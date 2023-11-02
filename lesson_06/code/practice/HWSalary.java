package practice;
//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,если базовая зарплата 500$.
// За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class HWSalary {

    public static void main(String[] args) {

        double basicSalary = 500;//basic salary

        // for three years of work bonus 10% = basicSalary * 0.1
        // for five years of work bonus 50% = basicSalary * 0.5
        // for ten years of work bonus 100% = basicSalary * 1
        // for fifteen years of work bonus 150% = basicSalary * 1.5

        Scanner scanner = new Scanner( System.in );//  enabled keyboard input
        System.out.println( "Entering work experience: " ); // keyboard prompt
        int year = scanner.nextInt();// entering work experience from the keyboard
        switch (year) {
            case 3, 4 -> {
                System.out.println( "Your salary including bonus for work over three years " + (basicSalary + (basicSalary * 0.1)) + "$!" );
            }
            case 5, 6, 7, 8, 9 -> {
                System.out.println( "Your salary including bonus for work over five years " + (basicSalary + (basicSalary * 0.5)) + "$!" );
            }
            case 10, 11, 12, 13, 14 -> {
                System.out.println( "Your salary including bonus for work over ten years " + (basicSalary + (basicSalary * 1)) + "$!" );
            }
            case 15, 16, 17, 18, 19, 20 -> {
                System.out.println( "Your salary including bonus for work over fifteen years " + (basicSalary + (basicSalary * 1.5)) + "$!" );

            }
            default -> {  // false input
                System.out.println( "Wrong input!" );
            }
        }
    }

}




