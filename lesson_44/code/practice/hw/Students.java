package practice.hw;

import java.util.Random;
//  Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом.
//  Определить массив студентов в программе. Получить на выходе 2 списка студентов (2 массива).
public class Students {
    public static void main(String[] args) {
        // Создаем массив студентов
        String[] students = {
                "Student1", "Student2", "Student3", "Student4", "Student5",
                "Student6", "Student7", "Student8", "Student9", "Student10",
                "Student11", "Student12", "Student13"
        };

        // Перемешиваем массив студентов
        randomArray(students);

        // Определяем размер первой группы
        int groupStudents = students.length / 2;

        // Создаем два массива для групп
        String[] group1 = new String[groupStudents];
        String[] group2 = new String[students.length - groupStudents];


        // Заполняем группы из перемешанного массива студентов
        for (int i = 0; i < groupStudents; i++) { // Заполняем первую группу элементами
            group1[i] = students[i];
        }

        for (int i = groupStudents; i < students.length; i++) { // Заполняем вторую группу элементами
            group2[i - groupStudents] = students[i];
        }

        // Выводим результат
        System.out.print("GROUP_1: ");
        printArray(group1);

        System.out.println("===========================================================================");

        System.out.print("GROUP_2: ");
        printArray(group2);
    }

    // Метод для перемешивания массива
    static void randomArray(String[] array) {
        Random random = new Random(); // Создаем объект для генерации случайных чисел
        for (int i = array.length - 1; i > 0; i--) { // пробегает по массиву
            int index = random.nextInt(i + 1); // Генерируем случайный индекс от 0 до i включительно

            // Обмен значениями между элементами массива для случайного порядка

            String temp = array[index];// Сохраняем значение текущего элемента во временной переменной
            array[index] = array[i]; // Заменяем значение текущего элемента значением случайного элемента
            array[i] = temp;// Меняем местами текущий элемент и случайный элемент
        }
    }

    // Метод для вывода массива
    static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {// пробегает по массиву
            System.out.print(array[i]);// Выводим текущий элемент массива
            if (i < array.length - 1) {
                System.out.print(" | ");// Если элемент не последний, выводим разделитель
            }
        }
        System.out.println();
    }

}
