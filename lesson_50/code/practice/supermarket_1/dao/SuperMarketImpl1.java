package practice.supermarket_1.dao;

import practice.supermarket_1.model.Product1;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SuperMarketImpl1 implements Supermarket1{

    private Collection<Product1> products = new ArrayList<>(); // LIST ILI ARRAYLIST
    @Override
    public boolean addProduct(Product1 product1) {
       if(product1 == null || products.contains( product1 )) {
           return  false;
       }
      return  products.add( product1 );
    }


    @Override
    public Product1 removeProduct(long barCode) {
        Product1 removed = findByBarCode( barCode ); // нашли продукт по баркуду
        products.remove( removed );// удалили из списка
        return removed;// вернули из метода тот который удалили
    }

    @Override
    public Product1 findByBarCode(long barCode) {
        for (Product1 p : products) {
            if(p.getBarCode() == barCode){
                return p;
            }

        }
        return null;
    }

    @Override
    public Iterable<Product1> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase( p.getCategory() ));
    }

    @Override
    public Iterable<Product1> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase( p.getBrand() ));
    }

    @Override
    public Iterable<Product1> findProductsWithExpiredDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter( p.getDate() ));
    }

    private Iterable<Product1> findByPredicate(Predicate<Product1> predicate){

    List<Product1> res = new ArrayList<>();
    // perebiraem vesy spisok produktov naxodim te kotorie udovletvoryjut usloviju predicate
        for (Product1 p : products) {
            if(predicate.test( p )){
                res.add( p );
            }

        }
        return res;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product1> iterator() {
        return products.iterator(); // берем итератор от ArrayList
    }
}
