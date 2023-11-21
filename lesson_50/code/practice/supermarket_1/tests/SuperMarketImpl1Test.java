package practice.supermarket_1.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.supermarket_1.dao.SuperMarketImpl1;
import practice.supermarket_1.dao.Supermarket1;
import practice.supermarket_1.model.Product1;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SuperMarketImpl1Test {


    Supermarket1 myMarket;
    LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        myMarket = new SuperMarketImpl1();

    }


    @Test
    void addProduct() {
        Product1 product1 = new Product1(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        Product1 product2 = new Product1(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        Product1 product3 = new Product1(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        Product1 product4 = new Product1(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85));
        Product1 product5 = new Product1(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));

        assertTrue(myMarket.addProduct(product1)); // Добавляем продукты в магазин
        assertFalse(myMarket.addProduct(null)); // Нельзя добавить null
        assertFalse(myMarket.addProduct(new Product1(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)))); // Нельзя добавить второй раз
    }

    @Test
    void removeProduct() {

    }



    @Test
    void findByBarCode() {
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByBrand() {
    }

    @Test
    void findProductsWithExpiredDate() {
    }

    @Test
    void skuQuantity() {
    }
}