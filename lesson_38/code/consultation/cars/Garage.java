package consultation.cars;

import consultation.cars.model.Car;

import java.util.stream.Stream;

public interface Garage {

    //переделать методы, которые возвращают массив Car[]
    // на методы, которые возвращают перечеслимые структуры;
    //использовать stream для циклов.
    boolean addCar(Car car);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);

    Stream<Car> findCarsByModel(String model);

    Stream<Car> findCarsByCompany(String company);

    Stream<Car> findCarsByEngineRange(double min, double max);

    Stream<Car> findCarsByColor(String color);

    int size();
}
