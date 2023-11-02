package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {
Sentence sentence;// поле класса типа Sentence
    @BeforeEach
    void setUp() {
        sentence = new Sentence(); // вызвали пустой конструктор который есть по умолчанию у всех объектов

    }

    @Test
    void countWordsTest() {
        String str = "One ,two three four five  ";
        assertEquals( 5,sentence.countWords( str ) );

    }

    @Test
    void countSymbolsTest() {
        String str = "One:(Two);,     !!Three, four";
        assertEquals(15,sentence.countSymbols( str ) );

    }


    @Test
    void countWords1Test() {
        String str = "One ,two three four five six   ";
        assertEquals( 6,sentence.countWords1( str ) );
    }


    @Test
    void countSymbols1() {
        String str = "One:(Two);, +#=  six   !!Three, four";
        assertEquals(21,sentence.countSymbols( str ) );
    }

}