package practice.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomArrayTest {
    RandomArray randomArray;
    int [] randomNumbers = {-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0, 9, -1};

    @BeforeEach
    void setUp() {
        randomArray =new RandomArray();

    }

    @Test
    void countPositiveNumbersTest() {
        int [] randomNumbers ={-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0, 9, -1};
        assertEquals( 7, randomArray.countPositiveNumbers( randomNumbers ) );
    }

    @Test
    void countNegativeNumbersTest() {
        int [] randomNumbers = {-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0, 9, -1};
    assertEquals( 6, randomArray.countNegativeNumbers( randomNumbers ) );
    }

    @Test
    void countEvenNumbersTest() {
        int [] randomNumbers = {-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0, 9, -1};
        assertEquals( 9, randomArray.countEvenNumbers( randomNumbers ) );

    }

    @Test
    void countZerosTest() {
        int [] randomNumbers = {-9, 2, 4, 10, -6, 4, 1, -7, -8, 0, 3, -4, 0,  9, -1};
        assertEquals( 2, randomArray.countZeros( randomNumbers ) );
    }
}