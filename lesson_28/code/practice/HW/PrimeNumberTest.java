package practice.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    @Test
    void isPrime() {
        int n = 20;
        assertFalse( primeNumber.isPrime( n ) );
        n = 19;
        assertTrue( primeNumber.isPrime( n ) );
    }
}