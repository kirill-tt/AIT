package practice.hw;

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        // Создаем ArrayList типа Character для хранения букв латинского алфавита
        ArrayList<Character> alphabetList = new ArrayList<>();

        for (char letter = 'A'; letter <= 'Z'; letter++) { // Присваиваем переменной letter значением 'A', начало цикла
            alphabetList.add( letter );//  добавляем к следующему символу в алфавите

            // В результате цикла в ArrayList добавлены все символы латинского алфавита от 'A' до 'Z'
        }

        System.out.println( alphabetList );
        System.out.println( "===========================" );

        alphabetList.clear(); // Очистка списка перед заполнением

         // Заполнение структуры ArrayList символами латинского алфавита от A(65) до Z(90)
        for (int i = 65; i <= 90; i++) { // Инициализация переменной i значением 65 (код символа 'A'), начало цикла пробегает до 90 (код символа 'Z')
            char letter = (char) i; // Преобразование casting i в символ (char), получаем текущий символ
            alphabetList.add( letter ); // Текущий символ добавляется в ArrayList
        }
         // В ArrayList добавлены все символы латинского алфавита от 'A' до 'Z'

        System.out.println( alphabetList ); // Вывод списка
    }
}

