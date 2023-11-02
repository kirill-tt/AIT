package practice.hw.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenElementsTest {
EvenElements evenElements;
    @BeforeEach
    void setUp() {
        evenElements = new EvenElements();
    }

    @Test
    void averageOfEvenNumber() {
        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        // Ожидаемый результат: (22 + 18 - 30 - 2) / 4 = 2
     assertEquals( 2, evenElements.averageOfEvenNumber( numbers ) );
    }
}