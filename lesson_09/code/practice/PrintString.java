package practice;

import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Napischite kakoe-nibudj strokovoe znachenie : ");
        String input= scanner.nextLine();
        System.out.println(" Vvedite chislo raz dlja pechti");
        System.out.println(" chislo ne dolgno bitj bolschim chtobi ne poluchitj peregruz pamjati");
        int count = scanner.nextInt();
        System.out.println( " vvidite skorostj vvoda ot 1-3");
        int speed = scanner.nextInt();
        while (count > 0){
            System.out.println(input);
            Thread.sleep(speedConverter(speed) );
            count--;

        }

    }
    public static int speedConverter( int speed){
        return speed = 300;
    }
}
