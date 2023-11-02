package practice.binary_search;

//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

public class HWBinarySearch {
    public static void main(String[] args) {


        int[] array = new int[20];// Создаем массив из 20 элементов
        int a = -100;// Минимальное значение
        int b = 100;// Максимальное значение

        // Заполняем массив случайными целыми числами
        ArrayMethods3.fillArrayRandomInt( array, a, b ); // Вызываем метод из ArrayMethods3
        System.out.println( "Массив случайных чисел: " );
        ArrayMethods3.printArray( array ); // Выводим массив на экран

        ArrayMethods3.split();// Выводим разделитель


        // Сортируем массив с использованием пузырьковой сортировки
        ArrayMethods3.bubbleSort( array ); // Вызываем метод из ArrayMethods3
        System.out.println( "Массив случайных чисел после сортировки: " );
        ArrayMethods3.printArray( array );// Выводим отсортированный массив на экран

        ArrayMethods3.split();// Выводим разделитель

        // Ищем число 0 в отсортированном массиве с помощью бинарного поиска
        int index = ArrayMethods3.binarySearch( array, 0 ); // Вызываем метод из ArrayMethods3
        System.out.println("Индекс числа 0 если оно есть в массиве:" );
        System.out.println(index);// Выводим результат на экран

        ArrayMethods3.split();// Выводим разделитель

        if (index >= 0) { // Если число 0 найдено выводим сообщение об этом индексе.
            System.out.println("Число 0 найдено : " + index);// Выводим результат на экран
        } else {
            // Если число 0 не найдено, вычисляем индекс, на который его следует вставить.
            int insertIndex = - index - 1;
            // Выводим результат на экран
            System.out.println("Число 0 не найдено, eго следует вставить на индекс: " + insertIndex);
        }
        ArrayMethods3.split();// Выводим разделитель

        //Создаём новый метод для получения массива положительных чисел в ArrayMethods3

        // Вызываем метод для получения массива положительных чисел
        int [] positiveNumbersArray = ArrayMethods3.positiveNumbers( array ); // Вызываем метод из ArrayMethods3
        System.out.println("Массив положительных чисел:");
        ArrayMethods3.printArray(positiveNumbersArray);// Выводим результат на экран
        ArrayMethods3.split();// Выводим разделитель
    }

    }



