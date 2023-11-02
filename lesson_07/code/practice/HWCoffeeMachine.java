package practice;

import java.util.Scanner;

//Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
//
//Эспрессо
//Американо
//Латте
//Капучино
// После выбора программа должна сообщить стоимость выбранного напитка.
public class HWCoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Hello!\n" +
                "What kind of coffee would you like? \n" +
                "espresso   press 1 \n" + "americano  press 2 \n" + "latte      press 3 \n" + "cappuccino press 4\n" );
        String coffee = scanner.next();// set a variable of type String
        switch (coffee) {
            case "1" ->
                    System.out.println( "Great choice!\n" + "To be paid 2 € \n" + "Thank you for your purchase\n" + "Have a nice day!" );
            case "2" ->
                    System.out.println( "Great choice!\n" + "To be paid 2.5 € \n" + "Thank you for your purchase\n" + "Have a nice day!" );
            case "3" ->
                    System.out.println( "Great choice!\n" + "To be paid 3.5 € \n" + "Thank you for your purchase\n" + "Have a nice day!" );
            case "4" ->
                    System.out.println( "Great choice!\n" + "To be paid 3 € \n" + "Thank you for your purchase\n" + "Have a nice day!" );
            default -> System.out.println( "Wrong input!\n" + "Try entering again from 1 - 4" );

        }
    }
}
