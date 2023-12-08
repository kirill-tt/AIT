package practice.hw;

public class Parcel {
    //Создайте класс Parcel (посылка) с полем double weight - вес посылки

    // Поле
    private double weight;

    // Конструктор
    public Parcel(double weight) {
        this.weight = weight;
    }

    // Метод для получения веса посылки
    public double getWeight() {
        return weight;
    }
}
