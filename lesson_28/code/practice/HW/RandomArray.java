package practice.HW;
//Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//положительных чисел;
// отрицательных чисел;
// четных чисел;
//нулей.
//Оформите решение данной задачи методами и напишите для них тесты.

public class RandomArray {
    int [] randomNumbers = {-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0,  9, -1};
    public  int countPositiveNumbers(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count++;
            }
        }

        return count;
    }

    public  int countNegativeNumbers(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                count++;
            }
        }

        return count;
    }

    public  int countEvenNumbers(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int countZeros(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
            }
        }

        return count;
    }

}






