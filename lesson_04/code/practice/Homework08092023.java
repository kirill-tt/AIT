package practice;

public class Homework08092023 {
    public static void main(String[] args) {
        // Cube volume V = a ^ 3 = a * a * a / where a is the side of the cube
        int a = 28;
        int kub = cub(a);
        System.out.println("Cube volume = " + cub(a));



        // Cube area S = 6 H² / where H is the length of the cube face
        int h = 49;
        int kube = cubeArea(h);
        System.out.println("Cube surface area = " + cubeArea(h));



        // Area of a triangle based on its base and height
        // S = ( h * a) / 2   // where h1 height , a1 where length


        int triangle = triangleArea( h ,a );
        System.out.println("Triangle area = " + triangleArea(h ,a));
    }




     public static int triangleArea(int h, int a){
        return h * a / 2;

     }
    public static int cubeArea(int h){
        return (h * 2) * 6;

    }

    public static int cub(int a){
        return a * a * a;

    }

}
