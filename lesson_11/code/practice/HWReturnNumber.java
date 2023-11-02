package practice;
//Написать метод, принимающий массив целых чисел,
// и возвращающий сумму всех его нечетных элементов (не индексы!, а сами элементы).

public class HWReturnNumber {
    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        int[] randomInt = new int[10];
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print( randomInt[i] + " " );

        }
        System.out.println();
        int sumOfOddNumber = sumOfOddElements( randomInt );
        System.out.println( "Sum of odd elements: " + sumOfOddNumber );
    }

    public static int sumOfOddElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

