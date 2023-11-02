package practice.hw.model;
//Создать класс Circle
//расширяющий класс Shape и реализующий абстрактные методы.
public class Circle extends Shape{

    public Circle(double sideLength) {
        super( sideLength );
    }

    @Override
    public double calcArea() {
        return Math.PI * sideLength * sideLength; // Площадь круга
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * sideLength; //Длина окружности
    }
}
