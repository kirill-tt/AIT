package practice.supermarket_1.dao;

import practice.supermarket_1.model.Product1;

public interface Supermarket1 extends Iterable<Product1> {
    boolean addProduct(Product1 product1);

    Product1 removeProduct(long barCode);

    Product1 findByBarCode(long barCode);

    Iterable<Product1> findByCategory(String category);

    Iterable<Product1> findByBrand(String brand);

    Iterable<Product1> findProductsWithExpiredDate();

    int skuQuantity(); //количество складских edenic 1 товар = 1 sku

}
