package practice.product.model;

public class MilkFood extends Food{ // Объявление класса MilkFood, который расширяет класс Food
    private String milkType; // Приватное поле для хранения типа молока продукта
    private double fat; // Приватное поле для хранения содержания жира в молоке продукта


    // Конструктор класса MilkFood, принимает имя, штрих-код, цену, срок годности, тип молока и содержание жира
    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super( name, barCode, price, expDate );
        this.milkType = milkType;
        this.fat = fat;
    }
 //Getter & Setter
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
    public String toString() { // Переопределение метода toString()
        return super.toString() + " | " +"MilkFood/" + // Вызов toString() супер класса Food и добавление "MilkFood/"
                "milkType: " + milkType + " | " +  // Добавление типа молока к строке
                "Fat: " + fat +
                '%' + "\n" + "---------------------------------" +
                "---------------------------------------------"; // Добавление содержания жира и разделителя к строке
    }

    }

