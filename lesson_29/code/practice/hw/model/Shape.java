package practice.hw.model;
//Создайте абстрактный класс Shape
// с типом поля double (одно)
//и абстрактными методами calcArea и calcPerimeter.
public abstract class Shape {
    protected double sideLength;

    public Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();
}
