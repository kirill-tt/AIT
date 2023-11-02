package practice;
//Создать 2 числовых массива, один на 10, другой на 20 элементов.
// Выполнить сортировку этих массивов методами:
//сортировка выбором
//пузырьковая сортировка В одном классе - методы, в другом - main.


public class HWSortingNumber {
    public static void main(String[] args) {
        int[] random1 = new int[10];// Создаем массив random1 размером 10 элементов
        int[] random2 = new int[20];// Создаем массив random2 размером 20 элементов


        // Заполнение первого массива случайными числами
        for (int i = 0; i < random1.length; i++) {
            random1[i] = (int) (Math.random() * 100);// Генерируем случайное целое число от 0 до 99

        }
        // Заполнение второго массива случайными числами
        for (int i = 0; i < random2.length; i++) {
            random2[i] = (int) (Math.random() * 100);// Генерируем случайное целое число от 0 до 99

        }
        HWSortingMethod.bubbleSort( random1);
        HWSortingMethod.bubbleSort( random2 );
        HWSortingMethod.sortArray( random1 );
        HWSortingMethod.sortArray( random2 );

        // Вывод массивов для печати

        System.out.println( "Первый массив после сортировки методом Bubble Sort(10 элементов): " );
        printRandom( random1 );// Вызываем метод printRandom для вывода элементов первого массива
        System.out.println();
        System.out.println( "Второй  массив после сортировки методом Bubble Sort(20 элементов): " );
        printRandom( random2 );//Вызываем метод printRandom для вывода элементов второго массива
        System.out.println();
        HWSortingMethod.split();
        System.out.println( "Первый массив после сортировки методом SortArray (10 элементов):" );
        printRandom( random1 );// Вызываем метод printRandom для вывода элементов первого массива
        System.out.println();
        HWSortingMethod.split();
        System.out.println( "Второй  массив после сортировки методом SortArray(20 элементов): " );
        printRandom( random2 );//Вызываем метод printRandom для вывода элементов второго массива
    }

    public static void printRandom(int[] arr) { // Метод printRandom для вывода массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " | " );// Выводим элементы массива в печать с разделителем |


        }


    }


}












