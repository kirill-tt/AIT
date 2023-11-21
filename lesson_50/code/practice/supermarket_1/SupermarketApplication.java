package practice.supermarket_1;

import practice.supermarket_1.dao.SuperMarketImpl1;
import practice.supermarket_1.dao.Supermarket1;
import practice.supermarket_1.model.Product1;

import java.time.LocalDate;

public class SupermarketApplication {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Supermarket1 myMarket = new SuperMarketImpl1();

        myMarket.addProduct(new Product1(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        myMarket.addProduct(new Product1(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        myMarket.addProduct(new Product1(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        myMarket.addProduct(new Product1(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85)));
        myMarket.addProduct(new Product1(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)));

        for (Product1 p : myMarket) {
            System.out.println(p);

        }
        System.out.println();


        System.out.println("Products by Brand: ");
        Iterable<Product1> res = myMarket.findByBrand( "milkland" );
        for (Product1 p : res) {
            System.out.println(p);

        }
        System.out.println("Products by Category: ");
res = myMarket.findByCategory( "bread" );
        System.out.println(res);

        System.out.println("Products with expired date: ");
        res = myMarket.findProductsWithExpiredDate();
        for (Product1 p : res) {
            System.out.println(p);

        }
    }
}
