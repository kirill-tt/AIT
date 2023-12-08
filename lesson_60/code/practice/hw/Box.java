package practice.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Iterable<Parcel> {
    //Создайте класс Box с полем: List - список посылок.
    //Классы Container и Box являются итерируемыми

    // Поле
    private List<Parcel> parcels;

    // Конструктор
    public Box() {
        this.parcels = new ArrayList<>();
    }

    public int quantity() {
        return parcels.size();
    }


    // Метод для получения списка посылок в коробке
    public List<Parcel> getParcels() {
        return parcels;
    }
    // Метод для добавления посылки в коробку
    public void addParcel(Parcel parcel) {
        parcels.add(parcel);
    }

    // iterator для итерации по списку посылок
    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}
