package HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {
    public static void main(String[] args) {
        // Создаем HashMap для хранения цифр
        HashMap<Integer, Integer> digitFrequency = new HashMap<>();
        // Генерируем 1 миллион чисел
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            int number = random.nextInt( Integer.MAX_VALUE ); // Генерируем случайное положительное число
            countNumberFrequency( number, digitFrequency );
        }
        // Выводим частоту встречаемости цифр
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            System.out.println( "Number " + entry.getKey() + " appears " + entry.getValue() + " times" );
        }
    }


    // Метод для подсчета частоты встречаемости цифр в числе и обновления HashMap
    private static void countNumberFrequency(int number, Map<Integer, Integer> digitFrequency) {

        // Преобразуем число в строку для обработки каждой цифры по отдельности
        String numberStr = String.valueOf( number );

        // Проходим по строке и обновляем частоту встречаемости цифр
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue( digitChar ); // Получаем числовое значение символа
            digitFrequency.put( digit, digitFrequency.getOrDefault( digit, 0 ) + 1 ); // Обновляем встречаемость цифры
        }
    }

}