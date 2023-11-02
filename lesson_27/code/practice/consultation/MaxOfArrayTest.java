package practice.consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfArrayTest  {
    MaxOfArray maxOfArray;

    @BeforeEach
    void setUp() {
       maxOfArray = new MaxOfArray();
    }

    @Test
    void maxArray() {
        int [] arr =  {500, 3, -1000, 3000};
        assertEquals( 4,maxOfArray.maxArray( arr ) );
    }
}