package practice.supermarket.dao;

import practice.supermarket.model.Product1;

public class SupermarketImpl implements Supermarket1 {
    Product1[]products;// создали массив продуктов
    private int size;
    public SupermarketImpl (int capacity){products = new Product1[capacity];// capacity максимальный размер

    }
    @Override
    public boolean addProduct(Product1 product) {
        if(products == null || size == products.length || findProduct()!= null){
            return false;
        }

        products[size] = product;// новый элемент
        size++;
        return true;

    }

    @Override
    public Product1 removeProduct(int barCode) {
        for (int i = 0; i < size; i++) {
            if(products[i].getBarcode() == barCode){
                Product1 victim = products [i];// убрали найденный элемент в переменную
                products[i] = products[size-1];// на место найденного поставили последующего существующего в массиве
                products[size-1] = null; // обнулили последнего
                size--;
                return victim;
            }

        }
        return null;

    }

    @Override
    public Product1 findProduct() {
        for (int i = 0; i <size ; i++) {
            long barCode = 0;
            if(products[i].getBarcode() == barCode){// нашелся элемент массива у которого совпал ID
                return products[i];// вернули найденный элемент массива типа Employee
            }

        }

        return null;
    }



    @Override
    public int quantityProduct() {

        return size;
    }

    @Override
    public double totalPrice() {
        return 0;
    }

    @Override
    public double totalPries() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += products[i].totalPrice();

        }
        return res;

    }

    @Override
    public double avgPries() {

        return totalPries() /size;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);

    }
}}
