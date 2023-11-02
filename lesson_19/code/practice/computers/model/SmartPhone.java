package practice.computers.model;

public class SmartPhone extends Laptop{ // Объявление класса SmartPhone, который расширяет класс Laptop
    private int camera;// Приватное поле для хранения информации о камере в смартфоне
    private String os;// Приватное поле для хранения информации операционной системе смартфона


    // Конструктор класса SmartPhone, принимает характеристики смартфона
    public SmartPhone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight, int camera, String os) {
        super( cpu, ram, hdd, brand, display, batteryCapacity, weight );
        this.camera = camera;
        this.os = os;
    }
  //Getter & Setter
    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {// Переопределение метода toString()
        return super.toString() +"SmartPhone{" + // Вызов toString() супер класса Laptop и добавление "SmartPhone"
                "camera=" + camera +  // Добавление информации о камере
                ", os='" + os + '\'' + // Добавление информации об операционной системе
                '}';
    }
}
