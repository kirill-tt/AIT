package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    // поля класса
    private Car[] cars;// массив для хранения объектов типа Car
    private int size;// текущие количество Auto

    // конструктор
    public GarageImpl(int capacity) {
        cars = new Car[capacity];

    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber( car.getRegNumber() ) != null) {
            return false;
        }
        cars[size++] = car;// добавляет в массив Car в конец массива(первая свободная позиция)
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if ( cars[i].getRegNumber() == regNumber) {
                Car temp = cars[i];
                cars[i] = cars[--size];// ставим на место удаляемого элемента ставим последний из массива
                cars[size] = null;
                return temp;
            }

        }
        return null;

    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        // пробегает по массиву ишем элемент массива
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals( regNumber )) {
                return cars[i];

            }

        }
        return null;
    }

    // шаг 1 первый количество результатов
    // шаг 2 создаем массив длинной count
    // шаг 3 заполняем массив результатами поиска / отбор по критерию
    // для отбора элементов будет использовать интерфейс Predicat
    @Override
    public Car[] findCarsByModel(String model) {

        return findCarsByPredicate ( c-> model.equals( c.getModel() ));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate( c-> company.equals( c.getCompany() ) );
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate( c-> c.getEngine() >= min && c.getEngine()<=max );
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate( c-> color.equals( c.getColor() ) );
    }

    @Override
    public int size() {
        return size;
    }

    private Car [] findCarsByPredicate (Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test( cars[i] )) {
                count++;

            }

        }
       Car [] res = new Car[count];
        // fil array
        for (int i = 0, j= 0; j < res.length; i++) {
            if (predicate.test( cars [i])){
                res[j] = cars [i];
                j++;
            }

        }
        return res;
    }
}

