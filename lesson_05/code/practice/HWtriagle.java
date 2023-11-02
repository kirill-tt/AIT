package practice;

//Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.
public class HWtriagle {
    public static void main(String[] args) {
        int a = 15;
        int b = 11;
        int c = 24;
        // where a, b, c, are the sides of the triangle
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (a < bc & b < ac & c < ab) {
            System.out.println("This triangle exist !");
        }
        else {
            System.out.println("This triangle doesn`t exist ");
        }

    }
}




