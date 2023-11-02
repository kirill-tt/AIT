package practice;
// Создайте массив из 20 целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
public class HWNumber {
    public static void main(String[] args) {
        int[] arrayNum = new int[30];

        for (int i = 9; i < arrayNum.length; i++) {
            arrayNum[i] = i + 1;
            System.out.print( arrayNum[i] + "," );
        }
        {
            int res = arrayNum[0];
            arrayNum[0] = arrayNum[arrayNum.length -1];
            arrayNum[arrayNum.length - 1] = res;

        }
        System.out.println();
        for (int replacement : arrayNum) {


            System.out.print( replacement + "," );
        }

    }
}













