package practice.hw.model;
//Напишите класс FigureAppl с методом main.
// В методе создайте массив фигур.
// Добавьте в массив два круга, один треугольник и один квадрат.
// Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class FigureAppl {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(7);
        shapes[1] = new Circle(4);
        shapes[2] = new Triangle(11);
        shapes[3] = new Square(6);

        double totalArea = 0;
        double totalPerimeter = 0;
        double totalCircleArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calcArea();
            totalPerimeter += shapes[i].calcPerimeter();
            if (shapes[i] instanceof Circle) {
                totalCircleArea += shapes[i].calcArea();
            }
        }

        System.out.println("Общая площадь фигур: " + totalArea);
        System.out.println("Общий периметр фигур: " + totalPerimeter);
        System.out.println("Общая площадь кругов: " + totalCircleArea);
    }
}