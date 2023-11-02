package practice;

//Распечатать в консоли таблицу умножения от 1 до 10.
public class MultiPlay {
    public static void main(String[] args) {
        int n = 1;
        int m = 1;
        while (n < 10) {
            while (m <= 10) {
                System.out.print( n + " * " + m + " = " + n * m + "|" );
                m++;
            }
            System.out.println();// perehod na sledujuschuju stroku
            m = 1;// sbros na nachaljnoe znachenie
            n++; // uvelichivaem n na 1
        }
    }
}
