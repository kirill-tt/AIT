package practice.hw;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetNumbers {
    public static void main(String[] args) {
        // Создание TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Добавление элементов
        treeSet.add(55);
        treeSet.add(-2);
        treeSet.add(24);
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(-54);
        treeSet.add(21);
        treeSet.add(9);
        treeSet.add(-89);
        treeSet.add(100);

        // Вывод элементов TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Удаление элемента
        treeSet.remove(11);
        System.out.println("After removing 11: " + treeSet);

        System.out.println( treeSet.floor( 7 ));

    }
}
