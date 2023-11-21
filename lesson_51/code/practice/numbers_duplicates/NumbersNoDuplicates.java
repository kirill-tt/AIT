package practice.numbers_duplicates;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//- Имеется список из 100 случайных чисел в интервале от 1 до 10,
// необходимо удалить из него
//  все дубликаты.
public class NumbersNoDuplicates {
    public static void main(String[] args) {

        int [] numbers = new int[100];
        int a = 1;
        int b = 10;

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = random.nextInt(a,b) +1 ;

        }
        for (Integer n : numbers) {
            System.out.print(n + " | ");

        }
        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("==============================================");
        System.out.println("Size of set:" + uniqueNumbers.size());
        System.out.println("Is empty = " + uniqueNumbers.isEmpty());

       // занесли массив в сет
        for (int i = 0; i <numbers.length ; i++) {
            uniqueNumbers.add( numbers[i] );

        }

        for (Integer n : numbers) {
            uniqueNumbers.add( n );

        }
        // распечатали сет способ 1
        for (Integer n : uniqueNumbers) {
            System.out.print(n + " | ");

        }

        System.out.println(uniqueNumbers);




    }
}
