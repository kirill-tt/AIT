package practice.supermarket.dao;

import practice.supermarket.model.Product;

//- добавить продукт
//- удалить продукт
//- найти продукт
//- кол-во продукт
//- средняя цена продуктов
//- объем продаж
//- напечатать список продуктов
public interface Supermarket {
    boolean addProduct(Product product);

  Product removeProduct(int barCode);

    Product findProduct();
    int quantityProduct();
    double totalPrice();// общая цена

  double totalPries();

  double avgPries();// средняя цена


    void printEmployees();

}
