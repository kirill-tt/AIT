package practice;

import java.util.Scanner;

//Напишите программу для машины на светофоре.
// Что нужно делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.
public class Ampel {

    public static void main(String[] args) {

        // как будем кодировать цвет
        // либо цифрами 1 2 3 ,либо вводит строку, либо задаём строкой (типа String)
        Scanner scanner = new Scanner( System.in );
        System.out.println( " What is the color? (Red ,Yellow, Green" );


        String color = scanner.next(); // задаём переменную типа String

        switch (color) {
            case "Red" -> System.out.println( "Stop , wait!" );
            case "Yellow" -> System.out.println( "Be ready to go." );
            case "Green" -> System.out.println( "You can go! " );
            default -> System.out.println( "Wrong input!" );
        }
    }
}


