package practice.HW;
// Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//сумма всех элементов массива;
//поиск элемента в массиве;
//Разработайте тесты для этих методов.
public class ArrayMethods {
    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public boolean search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
