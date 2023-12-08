package practice.stream_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stremappl {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 9, 2, 8,3,7, 4, 6, 5 ));
    numbers.stream()
            .filter( n-> n > 3 )
            .peek( n -> System.out.println("peek befor sort: " + n) )
            .sorted((n1, n2) -> Integer.compare( n1,n2 ))
            .forEach( System.out::println );

        System.out.println("==============================");
        numbers.forEach(System.out::println); // еще один вариант печати
        System.out.println("==============================");
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        Stream<Integer> streamInt = Arrays.stream( arr )
                .filter( n -> n > 2 )
                .filter( n -> n % 2 == 0 )
                .sorted((n1,n2) -> Integer.compare( n1, n2 ));
        streamInt.forEach( System.out ::println );

        Integer res = Arrays.stream(arr)
                .map(n -> n * 10) //
                .reduce(0, (accum, n) ->  accum + n);
        System.out.println("sum = " + res);

          String str = Arrays.stream(arr)
                .sorted((n1,n2) -> -Integer.compare( n1,n2 ))
                .map(Object::toString) // преобразование в string
                .reduce("Result = ", (accum, n) ->  accum + n);
        System.out.println(str);
        System.out.println("==============================");

    }
}
