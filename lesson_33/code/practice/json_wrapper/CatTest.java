package practice.json_wrapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat[] cat;// создали массив кошек

    @BeforeEach
    void setUp() {
        cat = new Cat[4];
        cat[0] = new Cat( 101, "Tishka", "Brith", 5, 3.5 );
        cat[1] = new Cat( 102, "Genny", "Sfinks", 1, 1.2 );
        cat[2] = new Cat( 103, "Murzik", "Pers", 9, 5.0 );
        cat[3] = new Cat( 104, "Motya", "Maikun", 2, 8.5 );

    }
    @Test
    void testCatSort(){
        System.out.println("-----------------------------Test Cat Sorting-----------------------------");
        printArray( cat );// печатаем массив как есть он не отсортирован
        Arrays.sort(cat);// выполнили сортировку
        System.out.println("===Sort by age=========");
        printArray( cat );



    }
    @Test
    void testCatSortComparator(){
        // второй способ
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo( o2.getName() );// здесь сравнили по именам (pole name)
            }
        };
                printArray( cat );// печатаем массив как есть он не отсортирован
            Arrays.sort(cat,catComparator  );
        System.out.println("========Sort by name=========");
        printArray( cat );
        }
    void testCatSortComparator2(){
        // второй способ
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge() ;// здесь сравнили по возрасту (pole name)
            }
        };
        printArray( cat );// печатаем массив как есть он не отсортирован
        Arrays.sort(cat,catComparator  );
        System.out.println("========Sort by name=========");
        printArray( cat );
    }


    public void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}