package practice.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
ArrayMethods arrayMethods;
    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем сумму всех элементов массива")
    void sumTest() {
        int [] array = {0, 2, -12, 8, -5};
        assertEquals( -7,arrayMethods.sum( array ) );

    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем поиск элемента в массиве если он есть")
    void searchTest() {
        int [] array = {0, 2, -12, 8, -5 };
        int target = 2;
        assertTrue(arrayMethods.search( array,target ) );
    }
    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем поиск элемента в массиве если его нет")
    void searchTestNotFound() {
        int [] array = {0, 2, -12, 8, -5};
        int target = 7;
        assertFalse(arrayMethods.search( array,target ) );
    }

}