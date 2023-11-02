package practice;

import java.util.Scanner;

//В кинотеатре есть разные типы билетов: стандартный, студенческий и для пенсионеров.
// Каждый тип билета имеет свою стоимость.
// Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice,
// который принимает возраст клиента, статус студента и флаг VIP-места.

public class HWCalculateTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Please enter your age: " );
        int age = scanner.nextInt();
        System.out.println( "Are you a student? Write yes or no: " );
        String status = scanner.next();
        System.out.println( "Would you like to upgrade your ticket to VIP? Write yes or no: " );
        String vip = scanner.next();

        double ticketPrice = calculateTicketPrice( age, status, vip );
        System.out.println( "Ticket price: " + ticketPrice + " €" );
    }

    public static double calculateTicketPrice(int age, String status, String vip) {
        double basePrice;

        if (status.equals( "yes" )) {// checking whether the student is or not
            basePrice = 7;
        } else if (age >= 67) {//check whether he is senior or not
            basePrice = 6;
        } else {
            basePrice = 9; // price standart ticket
        }
        if (vip.equals( "yes" )) {// if you choose a VIP ticket we add 25%
            basePrice += (basePrice * 0.25);
        }
        return basePrice;
    }
}
