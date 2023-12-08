package practice;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class StreamPrimitivesAppl {
    private static final int N_NUMBERS = 10;
    private static final int MIN = 1;
    private static final int MAX = 10;

    public static void main(String[] args) {
        // получить случайные числа в виде потока

        Stream<Integer> numbers = getRandomNumbers( N_NUMBERS, MIN, MAX );
       // numbers.forEach( System.out::println );

        System.out.println( "=======================Sum of numbers=======================" );
        int sum = getRandomNumbers( N_NUMBERS, MIN, MAX )
                //   .mapToInt( n -> n.intValue() )
                .mapToInt( Integer::intValue )
                .peek( System.out::println )
                .sum();
        System.out.println( "Sum = " + sum );


        System.out.println( "========================Summary Statistic=============" );
        IntSummaryStatistics intStat = getRandomNumbers( N_NUMBERS, MIN, MAX )
                .mapToInt( Integer::intValue )
                .peek( System.out::println )
                .summaryStatistics();
        System.out.println("min = " + intStat.getMin());
        System.out.println("max = " + intStat.getMax());
        System.out.println("sum = " + intStat.getSum());
        System.out.println("Average = " + intStat.getAverage());

        System.out.println("==================Lotto 6 from 49==========================");
        new Random()
                .ints(1, 50)
                .distinct()
                .limit( 6 )
                .forEach( System.out::println );

        System.out.println("====================Shuffle================");
        int[] arr = {10, 20, 30, 40, 50};
        // перетосоваты в случайном порядке этот массив
        // идея тасоваты индексы
        new Random()
                .ints(0, arr.length) // в этом диапазоне тасуем индекс
                .distinct()
                .limit( arr.length )
                .forEach( i -> System.out.println(arr[i]) );
    }

    private static Stream<Integer> getRandomNumbers(int nNumbers, int min, int max) {
        return new Random()
                .ints( min, max ) // Здесь появляется Stream
                .limit( nNumbers )
                .boxed(); // авто упаковка iz int v Integer
        // .mapToObj( n -> (Integer) n );
    }
}
