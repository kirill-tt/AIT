package practice.product.model;

import practice.product.model.Product;

public class Food extends Product { // Объявление класса Food, который расширяет класс Product
    private String expDate; // Приватное поле для хранения срока годности продукта


    // Конструктор класса Food, принимает имя, штрих-код, цену и срок годности продукта
    public Food(String name, long barCode, double price, String expDate) {
        super( name, barCode, price );
        this.expDate = expDate;
    }
// Getter & Setter
    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() { // Переопределение метода toString()
        return super.toString() + "\n" +"Food" + // Вызов toString() супер класса Product и добавление "Food"
                "expDate: " + expDate ;  // Добавление срока годности продукта
    }
}
