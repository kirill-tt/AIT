package practice.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class AthletesAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ); // Создаем Scanner для считывания ввода пользователя
        ArrayList<Athletes> athletes = new ArrayList<>(); // Создаем ArrayList для хранения данных о спортсменах

        // Ввод результатов спортсменов
        for (int i = 1; i <= 5; i++) {
            try { // Защита от неправильного ввода
                // Ввод данных о спортсмене
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

                // Создание Athletes и добавление его в список athletes
                athletes.add( new Athletes( lastName, firstName, registrationNumber, club, resultInSeconds ) );
            } catch (Exception e) { // В случае некорректного ввода
                System.out.println( "Wrong input! Please try again" );
                scanner.nextLine(); // Чистим ввод после ошибочного ввода
                i--; // Уменьшаем счетчик i для повторного ввода данных для того же спортсмена
            }
        }
        // Сортировка спортсменов по результатам
        athletes.sort( Comparator.comparingDouble( o -> o.resultInSeconds ) );

        // Вывод итогового протокола
        System.out.println( "Final competition protocol:" );
        System.out.println( "---------------------------------------------------------------" );

        for (Athletes athlete : athletes) { // Цикл проходится по списку спортсменов
            System.out.println( athlete );//  Выводит информацию о каждом спортсмене
        }
    }
}


