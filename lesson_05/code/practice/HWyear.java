package practice;
//Написать программу, определяющую, является ли год високосным.
// Для того чтобы год был високосным, он должен: делится без остатка на 4 и,
// либо не должен делится без остатка на 100,
// либо если он делится на 100, то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.
public class HWyear {
    public static void main(String[] args) {
        int year = 2000;
        int year1 = year%4; // must be divisible by 4
        int year2 = year%100; // must be divisible by 100
        int year3 = year%400; // must be divisible by 400
        if (year1 ==0 & year2 !=0 ^ (year2 ==0 & year3 == 0)){
            //Exclusive or, XOR, strict disjunction. Denoted by a “^” symbol between two operands.
            System.out.println("Year" +year+"leap");
        }else System.out.println("Year" +year+ "not a leap");
        }

    }

