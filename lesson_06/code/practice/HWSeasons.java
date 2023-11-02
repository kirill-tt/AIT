package practice;

import java.util.Scanner;

public class HWSeasons {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner( System.in );//  enabled keyboard input
        System.out.println( "Enter the month number: " ); // keyboard prompt
        int number = scanner.nextInt(); // Enter the month number from the keyboard
        switch (number) {
            case 1, 2, 12: {
                System.out.println( "It`s a winter month!" );
                break;
            }
            case 3, 4, 5: {
                System.out.println( "It`s spring month" );
                break;
            }
            case 6, 7, 8: {
                System.out.println( "It`s a summer month" );
                break;
            }
            case 9, 10, 11: {
                System.out.println( "It`s autumn month" );
                break;
            }
            default: {  // false input
                System.out.println( "Wrong input!" );

            }
        }
    }

}
