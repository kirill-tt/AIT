package practice.supermarket.dao;

import practice.supermarket.model.Product1;

//- добавить продукт
//- удалить продукт
//- найти продукт
//- кол-во продукт
//- средняя цена продуктов
//- объем продаж
//- напечатать список продуктов
public interface Supermarket {
    boolean addProduct(Product1 product);

  Product1 removeProduct(int barCode);

    Product1 findProduct();
    int quantityProduct();
    double totalPrice();// общая цена

  double totalPries();

  double avgPries();// средняя цена


    void printEmployees();

}
