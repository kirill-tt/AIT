package practice;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        int [] array = {-12, 5, 36, 28, -16, 100, 82, 64, 57, 5 };
        BubbleSortV2.printArray( array );// печать до сортировки
        BubbleSortV2.bubbleSortV2(array  );;//делаем сортировку
        BubbleSortV2.printArray( array );// печать после сортировки



    }

}
