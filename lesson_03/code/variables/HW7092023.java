package variables;

public class HW7092023 {
    public static void main(String[] args) {
        //S = a * b, where S - is Area of rectangle, a - length, b - width.
        int area = rectanglearea(18, 5);
       printrectanglearea(area);
    }
    public static int rectanglearea(int length, int width){
        return length * width;
    }
    public static void printrectanglearea(int area){
        System.out.println("rectangle area = " +area);
    }
}
