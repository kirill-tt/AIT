package practice;

public class HWSortingMethod {


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {// правый конец будет двигаться к левому
                if (arr[j] > arr[j + 1]) {// если левый элемент больше правого то их меняем местами
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }


            }


        }

    }
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
    public static void split() {
        System.out.println( "--------------------------------------------------------" );
    }
}





