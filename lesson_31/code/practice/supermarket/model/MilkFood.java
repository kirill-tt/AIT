package practice.supermarket.model;

public class MilkFood extends Product1 {
    private String milkType; // Приватное поле для хранения типа молока продукта
    private double fat; // Приватное поле для хранения содержания жира в молоке продукта


    public MilkFood(long barcode, String name, double price, String expDate, String milkType, double fat) {
        super( barcode, name, price, expDate );
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "MilkFood{" +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                "} " + super.toString();
    }

    @Override
    public double totalPrice() {
        double price = getPrice() + getPrice() * 0.07;
        return price;
    }
}
