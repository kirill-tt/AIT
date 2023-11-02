package practice.product.model;

public class MeatFood extends Food{ // Объявление класса MeatFood, который расширяет класс Food
    private String meatType; // Приватное поле для хранения типа мяса продукта


    // Конструктор класса MeatFood, принимает имя, штрих-код, цену, срок годности и тип мяса продукта
    public MeatFood(String name, long barCode, double price, String expDate, String meatType) {
        super( name, barCode, price, expDate );
        this.meatType = meatType;
    }
// Getter & Setter
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() { // Переопределение метода toString()
        return super.toString() + " | " + "MeatFood/" + // Вызов toString() супер класса Food и добавление "MeatFood/"
                "meatType: " + meatType + "\n" + "---------------------------------" +
                "---------------------------------------------"; // Добавление типа мяса и разделителя к строке
    }
}
