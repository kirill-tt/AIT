package practice;

import java.util.*;

public class MapIntroAppl {
    public static void main(String[] args) {
        // Создаем мапу отражающую количество людей в городах
        Map< String, Integer> usaCities = new TreeMap<>(); // создали объект типа Map
        usaCities.put( "Denver", 600_000 );
        usaCities.put( "Boston", 670_000 );
        usaCities.put( "Chicago", 2_700_000 );
        usaCities.put( "Atlanta", 470_000 );
        usaCities.put( "New York", 8_500_000 );
        usaCities.put( "Dallas", 1_300_000 );
        usaCities.replace( "Dallas", 1_300_010 );
        System.out.println("Map size = " + usaCities.size());
        System.out.println("Is empty" + usaCities.isEmpty());

        // получение значения по ключу
        Integer num = usaCities.get( "Chicago" );
        System.out.println(num);
        int pop = usaCities.get( "Atlanta" );
        System.out.println(pop);

        // proverka klyucha na nalichie
        System.out.println(usaCities.containsKey( "Boston" )); // ожидам true
        System.out.println(usaCities.containsKey( "Detroit" )); // false

        //обновить значение по ключу
        usaCities.put( "Chicago", 2_700_001 );
        System.out.println(num); // это старое значение
        System.out.println(usaCities.get( "Chicago" )); // извлечение значений
        num = usaCities.put( "Chicago", 2_700_002 );
        System.out.println(num);

        Collection<Integer> population = usaCities.values(); // vitashili kollekciyu
        int total = 0;
        for (Integer integer : population) {
            total += integer;
        }
        System.out.println("Population: " + total);

        // Распечатать содержимое map
        System.out.println("========Print Map==========");
        Set<String> keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + usaCities.get( key ));
        }
        // еще один способ
        System.out.println("========Print Map another time ==========");
        Set<Map.Entry<String,Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
        System.out.println("========Print Map another time 2 ==========");
        System.out.println( usaCities.entrySet() );



    }
}
