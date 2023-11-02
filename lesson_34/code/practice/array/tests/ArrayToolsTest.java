package practice.array.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.array.utils.ArrayTools;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};


    }

    @Test
    void prntArrayTest() {
        System.out.println( "======TEST======" );
        ArrayTools.prntArray( arrNum );
        ArrayTools.prntArray( arrStr );


    }

    @Test
    void testSearch() {
        System.out.println( "======TESTSearch======" );
        int index = ArrayTools.search( arrStr, "four" );
        System.out.println( "index: " + index );
        index = ArrayTools.search( arrStr, "six" );
        System.out.println( "index: " + index );
        index = ArrayTools.search( arrNum, 4 );
        System.out.println( "index: " + index );
        index = ArrayTools.search( arrNum, 6 );
        System.out.println( "index: " + index );

    }
    @Test
    void testFindByPredicate(){
        System.out.println( "======TESTPredicate======" );
        Integer num = ArrayTools.findByPredicate(arrNum,n -> n < 5);
        System.out.println(num);
        num = ArrayTools.findByPredicate( arrNum, number -> number%5 == 0 );
        System.out.println(num);
        String str = ArrayTools.findByPredicate( arrStr, s -> s.length() ==4 );
        System.out.println(str);
    }
    @Test
    void testBubbleSort(){
        System.out.println( "======TESTBabblesorte======" );
        ArrayTools.bubbleSort( arrNum );
        ArrayTools.prntArray( arrNum );
        ArrayTools.bubbleSort( arrStr );
        ArrayTools.prntArray( arrStr );
    }
    @Test
    void testBubbleSortComparator(){
        System.out.println( "======TESTBabblesorteComporator======" );
        ArrayTools.bubbleSort( arrNum,(n1,n2)-> n2 -n1 );
        ArrayTools.prntArray( arrNum );
        ArrayTools.bubbleSort( arrStr,(s1,s2)->s1.length() -s2.length());
        ArrayTools.prntArray( arrStr );
    }

}