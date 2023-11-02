package practice.HW.library.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.HW.library.dao.Library;
import practice.HW.library.dao.LibraryImpl;
import practice.HW.library.model.Book;
import practice.company.model.Employee;
import practice.company.model.Manager;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl( 6 );
        books = new Book[5];
        books[0] = new Book( 100, "Fedor Dostoevsky", "Idiot", 1868 );
        books[1] = new Book( 110, "Mikhail Bulgakov", "Master and Margarita", 1967 );
        books[2] = new Book( 120, "Antoine De Saint Exupery", "The Little Prince", 1943 );
        books[3] = new Book( 130, "Mikhail Bulgakov", "Heart of a Dog", 1925 );
        books[4] = new Book( 140, "Nikolay Gogol", "Viy", 1835 );
        for (int i = 0; i < books.length; i++) {
            library.addBook( books[i] );
        }
    }

    @Test
    void addBookTest() {
        // не можем добавить null
        assertFalse( library.addBook( null ) );
        // не можем добавить второй раз, уже существующий
        assertFalse( library.addBook( books[1] ) );
        Book book = new Book( 150, "Ivan Turgenev", "Mu-Mu", 1854 );
        assertTrue( library.addBook( book ) );
        assertEquals( 6, library.bookCount() );
        // создаем еще одного нового
        Book book1 = new Book( 160, "Alexandr Pushkin", "Eugene Onegin", 1833 );
        assertFalse( library.addBook( book1 ) ); // не можем превысить capacity
    }

    @Test
    void removeBookTest() {
        assertEquals( books[1], library.removeBook( 110 ) );
        assertEquals( 4, library.bookCount() ); //  стало на 1 меньше (5 - 1)
        assertNull( library.removeBook( 110 ) ); // дважды не можем удалить
        assertNull( library.findBook( 110 ) ); // не можем найти после удаления
    }


    @Test
    void findBookTest() {
        assertEquals( books[1], library.findBook( 110 ) );
        assertNull( library.findBook( 170 ) );
    }

    @Test
    void bookCountTest() {
        assertEquals( 5, library.bookCount() );

    }

    @Test
    void printBookTest() {
        library.printBook();
    }
}
