package practice;

//Измените (лучше скопируйте и сделайте еще один метод) метод так,
// чтобы он работал с массивом, заполненном "цифрами прописью": zero, one, two, three, ..., nine
// Выполните "разворот" это массива.

public class HWReplaceWorlds {
    public static void main(String[] args) { //// Create an array of strings with numbers
        String[] words = {"one", "two", " three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        replaceWordsArray( words );// Method call
    }
    public static void replaceWordsArray(String[] arr) { // Method for rotating and displaying an array of strings with numbers
        for (int i = arr.length - 1; i >= 0; i--) {// Start a loop that iterates through the array from end to beginning
            System.out.print( arr[i] + " |" + " " ); // Print the result
        }
    }
}
