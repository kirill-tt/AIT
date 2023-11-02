package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals( 4, garage.size() );
        assertEquals( c[1], garage.removeCar( "N2" ) );
        assertEquals( 3,garage.size() );
        assertNull( garage.findCarByRegNumber( "N2" ) );


    }

    @Test
    void findCarByRegNumberTest() {
        assertEquals( c[0] ,garage.findCarByRegNumber( "N1" ));
    assertNull( garage.findCarByRegNumber( "N6" ) );
    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = { c[2],c[3]};
        Car[] actuel = garage.findCarsByModel( "M3" );
        assertArrayEquals( expected ,actuel );
    }

    @Test
    void findCarsByCompanyTest() {
        Car [] expected = {c[2], c[3]};
        Car [] actual = garage.findCarsByCompany( "C2" );
        assertArrayEquals( expected,actual );
    }

    @Test
    void findCarsByEngineTest() {
        Car [] expected = {c[0], c[2], c[3]};
        Car [] actual = garage.findCarsByEngine(1.0,2.1  );
        assertArrayEquals( expected,actual );


    }

    @Test
    void findCarsByColorTest() {
        Car [] expected = {c[0], c[2]};
        Car [] actual = garage.findCarsByColor( "Red" );
        assertArrayEquals( expected,actual );
    }
}