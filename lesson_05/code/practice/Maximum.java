package practice;
//Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.
// Добавить метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
public class Maximum {
    public static void main(String[] args) {

        int a = 120;
        int b = -50;

        int max = maximum(a, b);
        System.out.println(" Maximum is :" + max);
        System.out.println(" ");

        int c = 60;
        int max3 = maximum3(a, b, c);

    }
    public static int maximum(int a, int b){
        int max = 0;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        return max;

    }
    public static int maximum3(int a, int b, int c){
        int max3 = 0;
        if (a > b & a > c){
            max3 = a;
        }
        if(b > a & b > c)
            max3 = b;


        max3 = 0;
        if (c > a & c > b){
            max3 = c;
        }
        return max3;
    }

}
