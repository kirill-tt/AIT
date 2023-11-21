package practice.supermarket.model;

public class MeatFood extends Product1 {
    private String meatType; // Приватное поле для хранения типа мяса продукта
private boolean bioType;

    public MeatFood(long barcode, String name, double price, String expDate, String meatType, boolean bioType) {
        super( barcode, name, price, expDate );
        this.meatType = meatType;
        this.bioType = bioType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public boolean isBioType() {
        return bioType;
    }

    public void setBioType(boolean bioType) {
        this.bioType = bioType;
    }

    @Override
    public String toString() {
        return "MeatFood{" +
                "meatType='" + meatType + '\'' +
                ", bioType=" + bioType +
                "} " + super.toString();
    }

    @Override
    public double totalPrice() {
        double price = getPrice()+getPrice() * 0.19;
        return price;
    }
}
