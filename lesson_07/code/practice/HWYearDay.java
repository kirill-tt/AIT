package practice;

import java.util.Scanner;

//Написать программу, которая принимает с клавиатуры номер месяца и год
// и выводит на экран название месяца и количество дней в нем.
import java.util.Scanner;

public class HWYearDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Введите номер месяца: " +
                "\nНапример: Январь => 1 ; Декабрь => 12");
        int numberOfMonth = scanner.nextInt();
        System.out.println("-------------");
        System.out.println(monthsNumber(numberOfMonth, year));
        System.out.println("-------------");

    }

   private static String monthsNumber(int numberOfMonth, int year) {
       String monthName = " ";
        switch (numberOfMonth) {
            case 1 -> monthName = "Январь";
            case 2 -> monthName = "Февраль";
            case 3 -> monthName = "Март";
            case 4 -> monthName = "Апрель";
            case 5 -> monthName = "Май";
            case 6 -> monthName = "Июнь";
            case 7 -> monthName = "Июль";
            case 8 -> monthName = "Август";
            case 9 -> monthName = "Сентябрь";
            case 10 -> monthName = "Октябрь";
            case 11 -> monthName = "Ноябрь";
            case 12 -> monthName = "Декабрь";
            default -> monthName = "Неправильный ввод, попробуйте снова";
        }
        int dayInMonth = 0;

        if (leapYear(year)) {
            if (numberOfMonth == 2) {
                dayInMonth = 29;
            }
        } else {
            if (numberOfMonth == 2) {
                dayInMonth = 28;
            }
        }
        switch (numberOfMonth) {
            case 1, 3, 5, 7, 9, 12 -> dayInMonth = 31;
            case 4, 6, 8, 10, 11 -> dayInMonth = 30;

        }

        return "В месяце " + monthName + " в " + year + " году " + dayInMonth + " дней." ;
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;

        }
        return false;
    }

}