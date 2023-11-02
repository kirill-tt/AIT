package practice.hw.model;
//Создать класс Square
//расширяющий класс Shape и реализующий абстрактные методы.
public class Square extends Shape {


    public Square(double sideLength) {
        super( sideLength );
    }

    @Override
    public double calcArea() {

        return sideLength * sideLength; // Площадь квадрата
    }

    @Override
    public double calcPerimeter() {
        return 4 * sideLength ; // Периметр квадрата
    }
}
