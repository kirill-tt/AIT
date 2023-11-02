package practice;

public class ArrayMethods {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );

        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );

        }
        System.out.println();
    }

    // Ищем максимальный элемент массива целых чисел
    public static int maxArray(int[] arr) {
        int max = arr[0];// первое приближение для максимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    // Ищем минимальный элемент массива целых чисел
    public static int minArray(int[] arr) {
        int min = arr[0];// первое приближение для минимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }


    // Метод для поиска индекса максимального элемента
    public static int maxIndex(int[] arr) {
        int max = arr[0];// первое приближение для максимума
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;

            }
        }
        return maxIndex;
    }

    // Метод для поиска индекса минимального элемента
    public static int minIndex(int[] arr) {
        int min = arr[0];// first approach to minimum
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;

            }
        }
        return minIndex;
    }


    // метод выбором сортировки от низшего к высшему
    public static int[] sortArray(int[] arr) {
        int min;
        int indexMin;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }

            }
            //переместить минимальный элемент в начало
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;

        }
        return arr;
    }


    //метод пузырьковой сортировки от большего к меньшему
    public static int[] sortArraymax(int[] arr) {
        int max;
        int indexMax;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            indexMax = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    indexMax = j;
                }

            }
            // переместить максимальный элемент в начало
            int temp = arr[i];
            arr[i] = arr[indexMax];
            arr[indexMax] = temp;

        }
        return arr;
    }

    public static void split1() {
        System.out.println( "||||||||||||||||||||||||||||||||||||||||||||||||||||||||" );

    }

    public static void split() {
        System.out.println( "--------------------------------------------------------" );
    }




    }


