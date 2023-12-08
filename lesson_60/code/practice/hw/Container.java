package practice.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Iterable<Box>  {
    // Создайте класс Container с полями:
    // String label (маркировка) и List - список коробок с посылками
    //Классы Container и Box являются итерируемыми

   // Поля
    private String label;
    private List<Box> boxes;

    // Конструктор
    public Container(String label) {
        this.label = label;
        this.boxes = new ArrayList<>();
    }

    // Метод для получения маркировки
    public String getLabel() {
        return label;
    }

    // Метод для получения списка коробок
    public List<Box> getBoxes() {
        return boxes;
    }

    // Метод для добавления коробок
    public void addBox(Box box) {
        boxes.add(box);
    }

    // iterator для итерации по списку коробок
    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
