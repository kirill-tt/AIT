package practice;
//Напишите метод, принимающий массив целых чисел,
// и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.


public class ReturnNumber {
    public static void main(String[] args) {
        int[] myArray = new int[10]; // Declare an array
        int a = 1;
        int b = 10; //Fill the array with random numbers from 1 to 10

        fillArray( myArray, 1, 10 ); // the fill method call is for filling
        printArray( myArray ); // method call,
        System.out.println( "=================================" );
        System.out.println( "=================================" );
        reverseArrray( myArray ); // Call the reverseArrray method to reverse the array
        printArray( myArray ); //Call the printArray method to print the expanded array


    } // ============end of main =============================

    // ======================Methods==========================
    public static void reverseArrray(int[] arr) {// Method for rotating the array
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i]; // take the left element into a temporary variable
            arr[i] = arr[arr.length - 1 - i]; // move the right element to the place of the left one
            arr[arr.length - 1 - i] = temp; //replace the right one with the one in the temporary variable
        }
    }

    public static void fillArray(int[] arr, int a, int b) { // Method for filling an array with random numbers
        for (int i = 0; i < arr.length; i++) {  // traversal, iterate through all elements of the array
            arr[i] = (int) (Math.random() * (b - a + 1) + a); // put a random integer into an array element
        }
    }
    public static void printArray(int[] arr) { // Method for outputting an array and print

        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );
        }
        System.out.println();
    } // ===========end of Methods ===================

}




