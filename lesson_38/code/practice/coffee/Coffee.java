package practice.coffee;
// Используя enum, напишите программу для продажи 4-х видов кофе:
// ESPRESSO, AMERICANO, CAPUCCINO, LATTE
// Предложите пользователю кофе на выбор,
// по результатам выбора сообщите стоимость напитка.
public enum Coffee {
   ESP("Espresso", 3.25), AMR("Americano", 3.85), CAP("Cappuccino", 4.5), LAT ("Latte", 4.85) ;
    private String type;
    private double price;

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}


