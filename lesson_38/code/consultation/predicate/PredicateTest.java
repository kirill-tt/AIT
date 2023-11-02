package consultation.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x-> x > 0;//объявили Predicate и сразу вписали в него условия которое будет проверяться

        System.out.println(isPositive.test( 56 ));// true
        System.out.println(isPositive.test( -56 ));// false

        Predicate<Integer> isOdd = x -> x % 2 == 1;
        System.out.println(isOdd.test( 5 )); // true
        System.out.println(isOdd.test( 8 ));//false

        System.out.println("=========================");
        Predicate<String> isStartsWithW = s-> s.charAt( 0 ) == 'W';
        System.out.println("Wolf");// true
        System.out.println("Fox");// false

        System.out.println("=============JAVA============");
        Predicate<String> containsJava = s -> s.contains( "Java" );
        System.out.println(containsJava.test( "mnycjnj Java mcnjnd" )); //true
        System.out.println(containsJava.test( "mnycjnj J mcnjnd" ));// false

    }
}
