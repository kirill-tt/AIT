package practice.binary_search;

public class Swap {
    //Реализовать способ обмена значениями двух переменных целого типа, не используя третьей переменной. В идеале написать метод swap(a, b).
    public static void main(String[] args) {
        int a = 10;
        int b = 100;

        a = a + b; //  10 + 100 = 110
        b = a - b; // 110 - 100 = 10
        a = a - b; // 110 - 10 = 100
        System.out.println(a);
        System.out.println(b);
    }
}
