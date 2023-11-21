package practice.supermarket.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.supermarket.dao.Supermarket1;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.MeatFood;
import practice.supermarket.model.MilkFood;
import practice.supermarket.model.Product1;

class SupermarketImplTest {
Supermarket1 supermarket;
Product1[] products;
    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl( 6 );
        products = new Product1[5];
        products[0] = new MeatFood( 100,"Saugsau", 5.99,"10.11.2023","Pork", true );
        products[1] = new MilkFood( 110," domik v derevne",2.99,"10.11.2023", "lactosefree",1.5 );


    }

    @Test
    void addProduct() {
    }

    @Test
    void removeProduct() {
    }

    @Test
    void findProduct() {
    }

    @Test
    void quantityProduct() {
    }

    @Test
    void totalPries() {
    }

    @Test
    void avgPries() {
    }

    @Test
    void printEmployees() {
    }
}