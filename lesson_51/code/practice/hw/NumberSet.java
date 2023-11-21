package practice.hw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumberSet {
    public static void main(String[] args) {

        //Написать программу, которая:
        //прочитает с клавиатуры количество вводимых чисел,
        //прочитает с клавиатуры сами числа и соберёт их в множество,
        //удалить из множества числа большие 10
        // и выведет полученные результаты на экран.
        // Все числа, которые подаются на вход программы, целые.


        // создаем сканер для ввода
        Scanner scanner = new Scanner( System.in );

        // Запрашиваем количество чисел у пользователя
        System.out.print( "Enter the number of numbers: " );
        int count = scanner.nextInt();
        scanner.nextLine(); // Очищаем буфер после ввода числа

        // Создаем множество для хранения чисел
        Set<Integer> numbers = new HashSet<>();

        // Запрашиваем числа и добавляем их
        for (int i = 0; i < count; i++) {
            System.out.print( "Input the number: " );
            int num = scanner.nextInt();
            numbers.add( num );
        }

        // Создаем итератор для множества чисел
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) { // Пока в множестве есть следующий элемент
            int num = iterator.next();// Получаем следующий элемент
            if (num > 10) {// Если текущее число больше 10
                iterator.remove(); // Удаляем число, если оно больше 10
            }
        }

        // Выводим числа, не превышающие 10
        System.out.println( "Numbers less than 10:" );
        for (int num : numbers) {
            System.out.println( num );
        }
    }
}
