package practice.product.model;

public class Product {// Объявление родительского класса Product
    private String name; // Приватное поле для хранения имени продукта
    private long barCode; // Приватное поле для хранения штрих-кода продукта
    private double price; // Приватное поле для хранения цены продукта


    // Конструктор класса Product, принимает имя, штрих-код и цену продукта
    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }
    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // метод toString() для печати
    @Override
    public String toString() {
        return "Product" + // Возвращает строку "Product" с информацией о продукте

                "Name: " + name + " | " +        // Добавляет имя продукта
                "BarCode: " + barCode + " | " +  // Добавляет штрих-код продукта
                "Price: " + price +"$" ;         // Добавляет цену продукта
    }
    }

