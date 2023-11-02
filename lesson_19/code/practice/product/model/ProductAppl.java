package practice.product.model;

import java.util.Arrays;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] prod = new Product[4]; // Создание массива объектов типа Product

        // Инициализация массива объектами MeatFood и MilkFood
        prod[0] = new MeatFood( "Best sausage", 109756755, 5.99, "12.12.2023", "Pork" );
        prod[1] = new MilkFood( "House of the village", 1947895678, 2.99, "10.10.2023", "Lactose free", 1.8 );
        prod[2] = new MeatFood( "Juicy Steak", 988876541, 19.99, "23.10.2023", "Beef" );
        prod[3] = new MilkFood( "Favorite Milk", 756308329, 3.99, "09.10.2023", "Pasteurized Milk", 3.8 );


        for (int i = 0; i < prod.length; i++) { // проходим весь массив
            System.out.println( prod[i] ); // Вывод на печать информации о продуктах
        }
        System.out.println();

        // Вычисление суммы цен всех продуктов
        double sumOfPrice = 0;
        for (int i = 0; i < prod.length; i++) {
            sumOfPrice = sumOfPrice + prod[i].getPrice();

        }
        // Вывод на печать общей суммы цен
        System.out.println( "Total Price = " + sumOfPrice + "$" );

    }
}
