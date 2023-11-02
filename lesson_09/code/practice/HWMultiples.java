package practice;
//Распечатайте все числа меньшие 200 и кратные 13.
public class HWMultiples {
    public static void main(String[] args) {
        int num = 13;
        while (num < 200) {
            if (num % 13 == 0) {
                System.out.print(num + " | " );
            }
            num++;
        }
    }
}