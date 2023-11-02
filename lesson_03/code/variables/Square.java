package variables;

public class Square {
    private static double a;

    public static void main(String[] args) {
        // area square S = a², where S  is area square, a is his side

        double res = areasquare(51); // в скобках - это радиус окружности

    }

    public static double areasquare(double length){
        double S = a * a;
        return S;
    }

    public static void printPi(double a){ // этот метод просто печатает
        System.out.println("square area = " + a);
    }


}

