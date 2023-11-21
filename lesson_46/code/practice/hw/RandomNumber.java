package practice.hw;

import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        // Создаём ArrayList для хранения случайных целых чисел
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Создаём Random для генерации случайных чисел
        Random random = new Random();

        // Заполняем ArrayList 20-ю случайными целыми числами в интервале от 1 до 10
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt( 10 );
            numbersList.add( randomNumber );
        }

        // Вывод исходного списка
        System.out.println( "Original ArrayList: " + numbersList );

        for (int i = 0; i < numbersList.size(); i++) { // Перебираем все элементы
            int currentNumber = numbersList.get( i ); // Получаем текущий элемент списка по индексу i
            for (int j = i + 1; j < numbersList.size(); j++) { // Внутренний цикл
                if (currentNumber == numbersList.get( j )) { // Проверяем на дубликат
                    numbersList.remove( j ); //Если дубликат найден, выполняется удаление элемента с индексом j
                    j--; // Уменьшаем индекс, чтобы не пропустить следующий элемент
                }
            }

        }
        Collections.sort( numbersList ); // Сортировка списка

        // Вывод списка после удаления дубликатов
        System.out.println( "ArrayList without duplicates: " + numbersList );

    }
}

