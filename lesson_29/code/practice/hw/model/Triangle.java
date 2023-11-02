package practice.hw.model;
//Создать класс Triangle
//расширяющий класс Shape и реализующий абстрактные методы.
public class Triangle extends Shape {

    public Triangle(double sideLength) {
        super( sideLength );
    }

    @Override
    public double calcArea() {
        return (Math.sqrt( 3 ) / 4) * sideLength * sideLength; // Формула для площади равностороннего треугольника
    }

    @Override
    public double calcPerimeter() {
        return 3 * sideLength; // Периметр равностороннего треугольника
    }
}
