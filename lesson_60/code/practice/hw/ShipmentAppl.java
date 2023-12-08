package practice.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShipmentAppl {
    public static void main(String[] args) {
        //Создайте класс ShipmentAppl с методом main.
        // Задумайте случайное количество контейнеров (от 10 до 20).
        // В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
        // В каждой коробке задумайте случайное количество посылок (от 5 до 10).
        // Предположим, что каждая посылка в среднем имеет вес = 2 кг.
        // Подсчитайте общее количество посылок во всех ящиках и их общий вес.
        // Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
        // Найдите все контейнеры с максимальным количеством посылок.

        // генератор случайных чисел
        Random random = new Random();

        // Генерация случайного количества контейнеров от 10 до 20
        int containerCount = random.nextInt( 11 ) + 10; // случайное количество контейнеров от 10 до 20
        List<Container> containers = new ArrayList<>();

        // Генерация контейнеров
        for (int i = 0; i < containerCount; i++) {
            Container container = new Container( "CONTAINER №" + i );

            // Генерация случайного количества коробок от 10 до 20 в каждом контейнере
            int boxCount = random.nextInt( 10 ) +11;

            // Создание коробок и добавление в контейнер
            for (int j = 0; j < boxCount; j++) {
                Box box = new Box();

                // Генерация случайного количества посылок от 5 до 10 в каждой коробке
                int parcelCount = random.nextInt( 6 ) + 5;

                // Создание посылок средний вес посылки (от 1 до 3 кг) и добавление в коробку
                for (int k = 0; k < parcelCount; k++) {
                    double weight = random.nextDouble() * 2 + 1;
                    Parcel parcel = new Parcel( weight );
                    box.addParcel( parcel );
                }

                // Добавление коробки в контейнер
                container.addBox( box );
            }

            // Добавление контейнера в список
            containers.add( container );
        }

        // Подсчет общего количества посылок во всех контейнерах
        int totalParcels = containers.stream()
                // Преобразуем каждый контейнер в последовательность коробок и объединяем в единый поток
                .flatMap( container -> container.getBoxes().stream() )
                // Преобразуем каждую коробку в количество посылок в ней и преобразуем поток в IntStream
                .mapToInt( box -> (int) box.getParcels().size() )
                // Вычисляем сумму всех значений в IntStream
                .sum();
        System.out.println( "TOTAL NUMBER OF PARCELS: " + totalParcels );
        System.out.println( "=====================================================================" );



        // Подсчет общего веса всех посылок во всех контейнерах
        double totalWeight = containers.stream()
                // Преобразуем каждый контейнер в последовательность коробок и объединяем в единый поток
                .flatMap( container -> container.getBoxes().stream() )
                // Преобразуем каждую коробку в последовательность весов посылок и объединяем в DoubleStream
                .flatMapToDouble( box -> box.getParcels().stream().mapToDouble( Parcel::getWeight ) )
                // Вычисляем сумму всех значений в DoubleStream, получая общий вес всех посылок
                .sum();
        System.out.println( "TOTAL PARCEL WEIGHT: " + totalWeight + " KG" );
        System.out.println( "=====================================================================" );


        // Нахождение контейнера с максимальным количеством посылок
        String containerWithMaxParcels = containers.stream()
                // Находим максимальное значение среди контейнеров, сравнивая количество посылок внутри них
                .max( (c1, c2) -> Integer.compare(
                        // Вычисляем количество посылок в контейнере c1, преобразуя поток коробок и посылок в численное значение
                        (int) c1.getBoxes().stream().flatMap( box -> box.getParcels().stream() ).count(),
                        // Вычисляем количество посылок в контейнере c2, преобразуя поток коробок и посылок в численное значение
                        (int) c2.getBoxes().stream().flatMap( box -> box.getParcels().stream() ).count() ) )
                // Получаем (label) контейнера с максимальным количеством посылок или возвращаем пустую строку, если список контейнеров пуст
                .map( Container::getLabel ).orElse( "" );
        System.out.println( "LABEL CONTAINER WITH THE MAXIMUM NUMBER OF PARCEL: " + containerWithMaxParcels );
        System.out.println( "=====================================================================" );
        System.out.println();


        // Вывод количества посылок в каждом контейнере
        System.out.println( "NUMBER OF PARCELS IN EACH CONTAINER:" );
        // Используется цикл forEach по каждому контейнеру в списке containers
        containers.forEach( container -> {
            // Для каждого контейнера вычисляется количество посылок
            long parcelCount = container.getBoxes().stream()
                    // Преобразование каждой коробки в поток посылок и преобразование их в LongStream с числом 1 для каждой посылки
                    .flatMapToLong( box -> box.getParcels().stream().mapToLong( parcel -> 1L ) )
                    // Вычисление общего количества посылок во всех коробках контейнера
                    .count();
            System.out.println( container.getLabel() + " CONTAINS " + parcelCount + " PARCEL" );

        } );


        // Сортировка контейнеров по количеству посылок от большего к меньшему
        System.out.println( "=====================================================================" );
        System.out.println();
        System.out.println( "CONTAINER BY CONTENT PARCELS FROM LARGEST TO SMALLEST: " );

        containers.stream()
                // Сортировка контейнеров по количеству посылок, от большего к меньшему
                .sorted( (container1, container2) -> {
                    // Получаем количество посылок в контейнере 1
                    long parcelCount1 = container1.getBoxes().stream()
                            // Преобразование каждой коробки в поток посылок и преобразование их в LongStream с числом 1 для каждой посылки
                            .flatMapToLong( box -> box.getParcels().stream().mapToLong( parcel -> 1L ) )
                            // Вычисление общего количества посылок во всех коробках контейнера
                            .count();

                    // Получаем количество посылок в контейнере 2
                    long parcelCount2 = container2.getBoxes().stream()
                            // Преобразование каждой коробки в поток посылок и преобразование их в LongStream с числом 1 для каждой посылки
                            .flatMapToLong( box -> box.getParcels().stream().mapToLong( parcel -> 1L ) )
                            // Вычисление общего количества посылок во всех коробках контейнера
                            .count();

                    // Сравниваем количество посылок в контейнерах, сортируем по убыванию
                    return Long.compare( parcelCount2, parcelCount1 );
                } )

                // Для отсортированных контейнеров выводится количество посылок
                .forEach( container -> {
                    long parcelCount = container.getBoxes().stream()
                            // Преобразование каждой коробки в поток посылок и преобразование их в LongStream с числом 1 для каждой посылки
                            .flatMapToLong( box -> box.getParcels().stream().mapToLong( parcel -> 1L ) )
                            // Вычисление общего количества посылок во всех коробках контейнера
                            .count();
                    System.out.println( container.getLabel() + " contains " + parcelCount + " parcel" );
                } );

    }
}
