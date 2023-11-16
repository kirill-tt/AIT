package practice.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SportsResultsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        ArrayList<Athlete> athletes = new ArrayList<>();

        // Ввод результатов спортсменов
        for (int i = 1; i <= 2; i++) {
            try {
                System.out.println( "Enter results for athlete #" + i );
                System.out.print( "LastName: " );
                String lastName = scanner.next();
                System.out.print( "FirstName: " );
                String firstName = scanner.next();
                System.out.print( "Number: " );
                int registrationNumber = scanner.nextInt();
                System.out.print( "Club: " );
                String club = scanner.next();
                System.out.print( "Result (in seconds): " );
                double resultInSeconds = scanner.nextDouble();

                athletes.add( new Athlete( lastName, firstName, registrationNumber, club, resultInSeconds ) );
            } catch (Exception e) {
                System.out.println( "Wrong input! Please try again" );
                scanner.nextLine(); // Чистим ввод после ошибочного ввода
                i--; // Повторяем ввод для того же спортсмена
            }
        }
                // Сортировка спортсменов по результатам
                athletes.sort( Comparator.comparingDouble( o -> o.resultInSeconds ) );

                // Вывод итогового протокола
                System.out.println( "\nFinal competition protocol:" );
                System.out.println( "---------------------------------------------------------------" );

                System.out.println( "---------------------------------------------------------------" );

                for (Athlete athlete : athletes) {
                    System.out.println( athlete );
                }
            }
        }


