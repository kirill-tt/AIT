package practice;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        // Создайте список известных вам фруктов.
        // Выполните поиск имеющегося и отсутствующего элемента списка.
        // Отсортируйте этот список по алфавиту в прямом и обратном порядке.
        // Проверьте работу методов
        // max(Collection<?> coll)
        // min(Collection<?> coll), что они возвращают?

        List<String> fruits = new ArrayList<>();
        fruits.add( "Apple" );
        fruits.add( "Orange" );
        fruits.add( "Banana" );
        fruits.add( "Pear" );
        fruits.add( "Plum" );
        fruits.add( "Strawberry" );

        System.out.println("========================");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("=======================");
        Collections.sort( fruits ); // Сделали сортировку
        System.out.println("========================");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("=======================");
        String key = "Banana";
        int index = Collections.binarySearch( fruits,key );
        System.out.println(index + " of " + key);
        key = "Kiwi";
        index = Collections.binarySearch( fruits,key );
        System.out.println(index + " of " + key);

        Comparator<String> fComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo( o2 );// Сортируем в обратном порядке

            }
        };
        Collections.sort( fruits, fComparator );
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("=======================");
        String max = Collections.max( fruits );
        System.out.println("Max of = " + max);

        String min = Collections.min( fruits );
        System.out.println("Min of = " + min);

        Collections.reverse( fruits );
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("=======================");
        max = Collections.max( fruits );
        System.out.println("Max of = " + max);

        min = Collections.min( fruits );
        System.out.println("Min of = " + min);

    }
}
