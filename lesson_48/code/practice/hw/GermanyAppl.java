package practice.hw;

import java.util.Comparator;
import java.util.LinkedList;

// В классе GermanyAppl (main) cоздать LinkedList,
// содержащий города - столицы земель Германии.
// Опробовать на нем методы, которые доступны для класса LinkedList.
// Добавить Гамбург в середину списка, в начало списка.
public class GermanyAppl {
    public static void main(String[] args) {

        // Создаем LinkedList для городов
        LinkedList<String> germanHauptStadt = new LinkedList<>();

        // Добавляем города
        germanHauptStadt.add( "Wiesbaden" );
        germanHauptStadt.add( "Mainz" );
        germanHauptStadt.add( "München" );
        germanHauptStadt.add( "Schwerin" );
        germanHauptStadt.add( "Hannover" );
        germanHauptStadt.add( "Saarbrücken" );
        germanHauptStadt.add( "Dresden" );
        germanHauptStadt.add( "Magdeburg" );
        germanHauptStadt.add( "Kiel" );
        germanHauptStadt.add( "Düsseldorf" );
        germanHauptStadt.add( "Postdam" );
        germanHauptStadt.add( "Erfurt" );
        germanHauptStadt.add( "Stuttgart" );
        germanHauptStadt.add( "Berlin" );
        germanHauptStadt.add( "Bremen" );

        // Выводим исходный список
        System.out.print( "Hauptstädte Deutschland: " + germanHauptStadt );
        System.out.println();

        // Добавляем Гамбург в середину списка
        germanHauptStadt.add( 7, "Hamburg" );
        System.out.println( "===============================================" );
        System.out.println( germanHauptStadt );
        System.out.println( "===============================================" );

        // Добавляем Гамбург в начало списка
        germanHauptStadt.addFirst( "Hamburg" );
        System.out.println( germanHauptStadt );
        System.out.println( "===============================================" );

        // Удаляем Майнц из списка
        germanHauptStadt.remove( "Mainz" );
        System.out.println( germanHauptStadt );
        System.out.println( "===============================================" );

        // Количество городов в списке
        System.out.println( germanHauptStadt.size() );
        System.out.println( "===============================================" );

        // Добавляем Франкфурт ам Майн в конец соиска
        germanHauptStadt.addLast( "Frankfurt am Main" );
        System.out.println( germanHauptStadt );
        System.out.println( "===============================================" );


        // Создает клон списка
        germanHauptStadt.clone();
        System.out.println(germanHauptStadt);
        System.out.println( "===============================================" );

        // Сортировка списка по алфавиту
        germanHauptStadt.sort( Comparator.naturalOrder() );
        System.out.println(germanHauptStadt);
        System.out.println( "===============================================" );

        // Удаление очистка всего списка
        germanHauptStadt.removeAll(germanHauptStadt  );
        System.out.println(germanHauptStadt);
        System.out.println( "===============================================" );

    }
}
