package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car [] c ;


    @BeforeEach
    void setUp() {
        garage = new GarageImpl( 5 );
        c = new Car[4];
        c[0] = new Car( "N1", "M1","C1",1.5, "Red" );
        c[1] = new Car( "N2", "M2","C1",2.5, "Gray" );
        c[2] = new Car( "N3", "M3","C2",1.5, "Red" );
        c[3] = new Car( "N4", "M3","C2",2.0, "Gray" );
        for (int i = 0; i <c.length ; i++) {
            garage.addCar( c[i] );

        }
    }

    @Test
    void addCarTest() {
        //не добавлять null
        assertFalse( garage.addCar( null ) );
        // не добавлять уже имеющийся
        assertFalse( garage.addCar( c[2] ) );
        // успешно добавить новый объект
        Car car = new Car( "N5" ,"M1", "C1",3.0, "white");
        assertTrue( garage.addCar( car ) );
        // не добавлять когда достигнут capacity
       car = new Car( "N6" ,"M1", "C1",3.0, "white");
        assertFalse( garage.addCar( car ) );

    }

    @Test
    void removeCarTest() {
        // Проверяем размер гаража до удаления
        assertEquals( 4, garage.size() );
        // Удаляем машину "N2" и сравниваем ее с ожидаемым значением
        assertEquals( c[1], garage.removeCar( "N2" ) );
        // Проверяем размер гаража после удаления машины
        assertEquals( 3,garage.size() );
        // Проверяем, что машина "N2" больше не найдена
        assertNull( garage.findCarByRegNumber( "N2" ) );


    }

    @Test
    void findCarByRegNumberTest() {
        // Проверяем, что машина с номером "N1" найдена
        assertEquals( c[0] ,garage.findCarByRegNumber( "N1" ));
        // Проверяем, что машина с номером "N6" не найдена
    assertNull( garage.findCarByRegNumber( "N6" ) );
    }

    @Test
    void findCarsByModelTest() {
        // Ожидаемые машины модели "M3"
        Car[] expected = { c[2],c[3]};
        // Получаем поток машин модели "M3"
        Stream<Car> actualStream = garage.findCarsByModel("M3");
        // Преобразуем поток в массив
        Car[] actual = actualStream.toArray(Car[]::new);
        // Проверяем, что машины соответствуют ожидаемым
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        // Ожидаемые машины company "C2"
        Car [] expected = {c[2], c[3]};
        // Получаем поток машин, принадлежащих company "C2"
        Stream<Car> actualStream = garage.findCarsByCompany("C2");
        // Преобразуем поток в массив
        Car[] actual = actualStream.toArray(Car[]::new);
        // Проверяем, что машины соответствуют ожидаемым
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngineTest() {
        // Ожидаемые машины с объем двигателя от 1.0 до 2.1
        Car [] expected = {c[0], c[2], c[3]};
        // Получаем поток машин с двигателями в заданном диапазоне
        Stream<Car> actualStream = garage.findCarsByEngineRange(1.0, 2.1);
        // Преобразуем поток в массив
        Car[] actual = actualStream.toArray(Car[]::new);
        // Проверяем, что машины соответствуют ожидаемым
        assertArrayEquals(expected, actual);


    }

    @Test
    void findCarsByColorTest() {
        // Ожидаемые машины color Red
        Car [] expected = {c[0], c[2]};
        // Получаем поток машин color Red
        Stream<Car> actualStream = garage.findCarsByColor("Red");
        // Преобразуем поток в массив
        Car[] actual = actualStream.toArray(Car[]::new);
        // Проверяем, что машины соответствуют ожидаемым
        assertArrayEquals(expected, actual);
    }
}