package practice.consultation.dao;


import practice.consultation.model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SupermarketImpl implements Supermarket {

    List<Product> source = new ArrayList<>();
    @Override
    public boolean addProduct(Product product) {

        if(product == null ||findByBarCode( product.getBarCode())!= null){
            return false;
        }
        return source.add( product );
        }



    @Override
    public Product removeProduct(long barCode) {
        Product productByBarCode = findByBarCode( barCode );
        if (productByBarCode != null){
            source.remove( barCode );
            return productByBarCode;

        }
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product thisProduckt : source ) {
            if(thisProduckt.getBarCode() == barCode){
                return thisProduckt;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        return null;
    }

    /**
     * Возвращает товарные позиции в магазине
     * @return
     */
    @Override
    public int skuQuantity() {
        return source.size();
    }

    @Override
    public Iterator<Product> iterator() {
        Iterator<Product> productIterator = new Iterator<Product>() {

         private int currentPosition;
            @Override
            public boolean hasNext() {
                return currentPosition < source.size() ;
            }

            @Override
            public Product next() {
                return source.get(currentPosition ++ );
            }
        };
        return productIterator;
    }
}