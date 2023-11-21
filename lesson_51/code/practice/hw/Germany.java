package practice.hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Germany {
    public static void main(String[] args) {
        //Написать программу, которая:
        //прочитает с клавиатуры количество вводимых названий земель в Германии,
        //прочитает с клавиатуры названия земель и соберёт их в множество,
        //выведет полученные результаты на экран.

        // Создаем сканер для ввода
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Welcome to Bundesländer App!" );// Приветствие

        System.out.print( "Enter the number of lands in Germany: " );// Запрос количества земель в Германии

        int count = scanner.nextInt();// Ввод числа

        scanner.nextLine(); // Обновляем после ввода числа

        // Создание Set для хранения уникальных названий земель
        Set<String> bundesLander = new HashSet<>();

        // Цикл для ввода названий земель и добавления их в Set
        for (int i = 0; i < count; i++) {
            System.out.print( "Enter land name: " );
            String state = scanner.nextLine();
            bundesLander.add( state );// Добавление земли в Set
        }
        // Вывод названия земель
        System.out.println( "Names of lands in Germany:" );
        for (String lander : bundesLander) {
            System.out.print( lander + " | " );
        }
    }
}
