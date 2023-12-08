package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class  GarageImpl implements Garage{
     //переделать методы, которые возвращают массив Car[]
     // на методы, которые возвращают перечеслимые структуры;
     //использовать stream для циклов.
    // Fields
    private Car[] cars;
    private int size;

    // Constructor
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        // Проверяем, что машина не является null и гараж не заполнен
        // полностью, и такая машина еще не существует в гараже
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            // Возвращаем false, если условия не соответствуют для добавления машины
            return false;
        }
        // Добавляем машину в гараж
        cars[size++] = car;
        // Возвращаем true, если машина успешно добавлена
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        // Проходим по массиву
        for (int i = 0; i < size; i++) {
            // Проверяем, есть ли машина с указанным номером
            if (cars[i].getRegNumber().equals(regNumber)) {
                // Сохраняем удаляемую машину
                Car removedCar = cars[i];
                // Перемещаем последнюю машину на место удаляемой
                cars[i] = cars[--size];
                // Очищаем последнюю позицию в массиве
                cars[size] = null;
                // Возвращаем удаленную машину
                return removedCar;
            }
        }
        // Возвращаем null, если машина с номером не найдена
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        // Преобразуем массив машин в поток и фильтруем по регистрационному номеру
        // находим первую машину с соответствующим номером или возвращаем null, если машина не найдена

        return Arrays.stream(cars, 0, size)  // Преобразуем массив в поток с размером size
                .filter(c -> regNumber.equals(c.getRegNumber()))// Фильтруем по указанному номеру
                .findFirst() // Находим первую соответствующую машину в потоке
                .orElse(null);// Возвращаем найденную машину или null, если машина не найдена
    }

    @Override
    public Stream<Car> findCarsByModel(String model) {
        // Преобразуем массив машин в поток и фильтруем по model
        return Arrays.stream(cars, 0, size)// Преобразуем массив в поток с размером size
                .filter(c -> model.equals(c.getModel()));// Фильтруем машины по model
    }

    @Override
    public Stream<Car> findCarsByCompany(String company) {
        // Преобразуем массив машин в поток и фильтруем по company
        return Arrays.stream(cars, 0, size)// Преобразуем массив в поток с размером size
                .filter(c -> company.equals(c.getCompany()));//Фильтруем машины по company
    }

    @Override
    public Stream<Car> findCarsByEngineRange(double min, double max) {
        // Преобразуем массив машин в поток и фильтруем по диапазону значений двигателя
        return Arrays.stream(cars, 0, size)// Преобразуем массив в поток с размером size
                .filter(c -> c.getEngine() >= min && c.getEngine() <= max);// Фильтруем машины по диапазону значений двигателя
    }

    @Override
    public Stream<Car> findCarsByColor(String color) {
        // Преобразуем массив машин в поток и фильтруем по color
        return Arrays.stream(cars, 0, size)// Преобразуем массив в поток с размером size
                .filter(c -> color.equals(c.getColor()));//Фильтруем машины по color
    }

    @Override
    public int size() {
        return size;// Возвращаем размер
    }
}

