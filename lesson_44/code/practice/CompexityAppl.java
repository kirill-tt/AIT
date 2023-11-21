package practice;

import java.util.Arrays;

public class CompexityAppl {
    public static void main(String[] args) {
        // заведем массив целых чисел
        // будет выполнить с ним различные операции
        // оценить вычислительную сложность

        int[] arr = {-24, 7, -67, 15, 8, 93, 1};

        // вычисление среднего значения
        // узнать длину массива
        // в цикле мы складской элементы
        // сумму делим на длину

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];// здесь растет количество операций
        }
        double avg = (double) sum / arr.length; // кастинг в другой тип данных
        System.out.println(avg);
        // что будет происходить при росте количества элементов массива?
        // эта линейная сложность так как количество операций прямо пропорционально количеству элементов массива
        // O(n) это вычислительная сложность
        // поиск элементов массива
        // если пробегает по массиву, то сложность линейная O(n)
        // если бинарный поиск

        /*Arrays.sort(arr); // сортируем целые числа

        System.out.println(Arrays.toString( arr ));
        int index = Arrays.binarySearch( arr, -67 );
        System.out.println(index);

        index = Arrays.binarySearch( arr, 93 );
        System.out.println(index);

        index = Arrays.binarySearch( arr, -100 );
        System.out.println(index);

        // при работе 8 элемента 3
        // pri 16 = 8
        // 1024 элемент = 10 операции
        // 2048 элемент = 11 операции
        // O(long(n)) -eta логарифмическая сложности (самая низкая)
*/
// сортировка методом BubbleSort сравним по 2 элементам i s i+1
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString( arr ));
        // O(n²) эта квадратичная сложность

        Arrays.sort(arr); // сортируем целые числа
        System.out.println(Arrays.toString( arr ));
        // сложность в методе полилинейная
    }
}
