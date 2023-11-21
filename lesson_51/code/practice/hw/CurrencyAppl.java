package practice.hw;

import java.util.Scanner;

// Создайте enum с кодами валют и их текущими курсами к евро.
// Убедитесь, что в списке нет дублирующихся кодов валют.
// Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя
// выбрать желаемую валюту, ввести ее количество и узнать,
// сколько он получит при обмене на евро.

public class CurrencyAppl {
    public static void main(String[] args) {

        // Создаем сканер
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Welcome to Currency Appl! " );


        while (true) {
            // Печатаем список валют
            Currency.printCurrencies();

            // Считываем код валюты
            System.out.print( "Enter currency code: " );
            String currencyCode = scanner.nextLine().toUpperCase();

            // Прерываем цикл, если введено "STOP"
            if (currencyCode.equalsIgnoreCase( "STOP" )) {
                break;
            }

            System.out.print( "Enter the amount of the selected currency: " );
            String amountStr = scanner.nextLine();// Считываем сумму для обмена

            // Удаляем пробелы из строки
            amountStr = amountStr.replace( " ", "" );

            // Удаляем запятые, если присутствует и точка и запятая
            if (amountStr.contains( "," ) && amountStr.contains( "." )) {
                amountStr = amountStr.replace( ",", "" );
            }

            // Заменяем запятую на точку, если она присутствует
            if (amountStr.contains( "," )) {
                amountStr = amountStr.replace( ',', '.' );
            }

            double amount;//объявление переменной

            try {
                amount = Double.parseDouble( amountStr );// Преобразуем сумму в число
                Currency selectedCurrency = Currency.valueOf( currencyCode ); // Получаем выбранную валюту
                double euroAmount = amount * selectedCurrency.getRateToEuro();// Проводим конвертацию

                // печать результата обмена
                System.out.printf( "To be received %.2f € for the entered amount  %s%n", euroAmount, amount, currencyCode );

            } catch (NumberFormatException e) {

                // В случае некорректного ввода суммы
                System.out.println( "Input error. Please enter a valid amount." );

            } catch (IllegalArgumentException e) {

                // В случае некорректного кода валюты
                System.out.println( "No currency with this code was found! Please try again." );
            }
        }
    }
}