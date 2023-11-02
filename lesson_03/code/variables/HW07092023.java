package variables;

public class HW07092023 {
    public static void main(String[] args) {
        // S = a * a = a², where S is area square, a his side
        int square = squarearea(15);
        printarea(square);
    }
    public static int squarearea(int side){
        return side * side;
    }
    public static void printarea(int square){
        System.out.println("Area of your square = " + square);
    }
}
