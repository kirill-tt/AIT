package practice;

public class ArrayAppl {
    public static void main(String[] args) {

        int [] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22};
        System.out.println("Целые числа группа № 1");
        ArrayMethods.printArray(number);

        int max = ArrayMethods.maxArray( number );
        System.out.println("↑ Максимальный элемент ↑ = " + max);
        int maxIndex = ArrayMethods.maxIndex( number );
        System.out.println("[Index] максимального элемента = " + maxIndex);
        int min = ArrayMethods.minArray( number );
        System.out.println("↓ Минимальный элемент ↓ = " + min);
        int minIndex = ArrayMethods.minIndex( number );
        System.out.println("[Index] минимального элемента = " + minIndex);


        ArrayMethods.split();
        ArrayMethods.sortArray( number );// выполняет сортировку
        System.out.println("Номера после сортировки от меньшего ↓ к ↑ большему: ");
        ArrayMethods.printArray( number );// печатаем после сортировки
        ArrayMethods.sortArraymax( number );
        System.out.println("Номера после сортировки от большего ↑ к ↓ меньшему : ");
        ArrayMethods.printArray( number );
        ArrayMethods.split();
        ArrayMethods.split1();
        ArrayMethods.split1();



        int[] number2 = {-5, 56, -100, 0, 15, 52, 67, 8, 1,} ;
        System.out.println("Целые числа группа № 2");
        ArrayMethods.printArray( number2 );
        int max2 = ArrayMethods.maxArray( number2 );
        System.out.println("↑ Максимальный элемент ↑ = " + max2);
        int maxIndex2 = ArrayMethods.maxIndex( number2 );
        System.out.println("[Index] максимального элемента =  " + maxIndex2);
        int min2 = ArrayMethods.minArray( number2 );
        System.out.println("↓ Минимальный элемент ↓ =  " + min2);
        int minIndex2 = ArrayMethods.minIndex( number2 );
        System.out.println("[Index] минимального элемента =  " + minIndex2);
        ArrayMethods.split();


        ArrayMethods.sortArray( number2 );
        System.out.println("Номера после сортировки от меньшего ↓ к ↑ большему: ");
        ArrayMethods.printArray( number2);
        ArrayMethods.sortArraymax( number2 );
        System.out.println("Номера после сортировки от большего ↑ к ↓ меньшему : ");
        ArrayMethods.printArray( number2 );
        ArrayMethods.split();
        ArrayMethods.split1();
        ArrayMethods.split1();


        int [] number3 = {-4, 9, -1, 6, 118, 13, -52, 8, 21, 88, 7};
        System.out.println("Целые числа группа № 3");
        ArrayMethods.printArray( number3 );
        int max3 = ArrayMethods.maxArray( number3 );
        System.out.println("↑ Максимальный элемент ↑ = " + max3);
        int maxIndex3 = ArrayMethods.maxIndex( number3 );
        System.out.println("[Index] максимального элемента =  " + maxIndex3);
        int min3 = ArrayMethods.minArray( number3 );
        System.out.println("↓ Минимальный элемент ↓ =  " + min3);
        int minIndex3 = ArrayMethods.minIndex( number3 );
        System.out.println("[Index] минимального элемента =  " + minIndex3);
        ArrayMethods.split();


        ArrayMethods.sortArray( number3 );
        System.out.println("Номера после сортировки от меньшего ↓ к ↑ большему: ");
        ArrayMethods.printArray( number3 );
        ArrayMethods.sortArraymax( number3 );
        System.out.println("Номера после сортировки от большего ↑ к ↓ меньшему : ");
        ArrayMethods.printArray( number3 );
        ArrayMethods.split();
        ArrayMethods.split1();
        ArrayMethods.split1();

        String [] digits = {"zero", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"};
        ArrayMethods.split();
        ArrayMethods.printArray( digits );
        ArrayMethods.split();
        ArrayMethods.split1();
        ArrayMethods.split1();


    }



}
