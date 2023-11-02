package practice;
//Напишите программу, которая запрашивает строку от пользователя и затем:
// сообщает сколько слов в строке
// сообщает сколько букв (символов) в строке
// печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class HWScannerCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );// Creating a Scanner for User Input
        System.out.print( "Enter the string: " );// asking the user to enter a string
        String input = scanner.nextLine();//user input
        String[] words = input.split( " ");//create an array of words and divide the entered string into words using split
        int wordCount = words.length;//create a word counter
        int letterCount = input.length();//create a letter counter
        System.out.println( "Number of words per line: " + wordCount );//Print the number of words per line
        System.out.println( "Number of letters per line: " + letterCount );//Print the number of letters in a line
        System.out.print( "String backwards: " );// Print the line backwards starting from the last word
        for (int i = words.length - 1; i >= 0; i--) {// we run through the array starting from the last one and move to the beginning of the array (index 0)
            System.out.print( words[i] + " " );// Print the line backwards
        }
    }
}
