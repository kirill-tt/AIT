package practice.supermarket_1.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product1 {
    private long barCode;
    private String name;
    private String category;
    private String brand;
    private double price;
    private LocalDate date;

    public Product1(long barCode, String name, String category, String brand, double price, LocalDate date) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.date = date;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product1 product1)) return false;
        return barCode == product1.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash( barCode );
    }
}
