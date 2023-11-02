package practice.supermarket.model;

public abstract class  Product {
    private long barcode;
    private String name;
    private double price;
    private String expDate; // Приватное поле для хранения срока годности продукта

    public Product(long barcode, String name, double price, String expDate) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        return barcode == product.barcode;
    }

    @Override
    public int hashCode() {
        return (int) (barcode ^ (barcode >>> 32));
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expDate='" + expDate + '\'' +
                '}';
    }
    public abstract double totalPrice(); // определили абстрактный метод (у него нет тела!)
}
