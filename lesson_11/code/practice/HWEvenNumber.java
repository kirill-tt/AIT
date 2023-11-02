package practice;

//Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов с четными индексами.
public class HWEvenNumber {
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
        int multOfNumber = multElements( randomInt );
        System.out.println( "Multiplication elements with even indices: " + multOfNumber );

    }

    public static int multElements(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                mult *= arr[i];
            }
        }
        return mult;
    }
}



