package practice.fibonacci;

import java.util.Iterator;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci( 15 ); // Создаем объект Fibonacci с количеством чисел, равным 8
        //TODO -распечатать первые 8 чисел из ряда
        // 1,1, 2, 3, 5, 8, 13, 21 - это должно получиться
        // TODO - сложить все эти числа
        //  sum = 54

        Iterator<Integer> iterator = fibonacci.iterator(); // iterator для чисел Fibonacci
        int sum = 0;
        while (iterator.hasNext()) { // Цикл будет выполняться, пока есть следующее число
            int next = iterator.next(); // Получаем следующее число из последовательности
            System.out.print(next + " || "); // Выводим число и разделитель
            sum += next; // Добавляем число к сумме
        }
        System.out.println("Sum of numbers = " + sum); // Выводим сумму чисел
    }



    }

