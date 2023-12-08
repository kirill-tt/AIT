package hw.tests;

import hw.dao.MoviesCollection;
import hw.dao.MoviesCollectionImpl;
import hw.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {
    MoviesCollection moviesCollection;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImpl( List.of(
                new Movie( 1, "A", "A", "A", now.minusYears( 3 ) ),
                new Movie( 2, "B", "B", "B", now.minusYears( 4 ) ),
                new Movie( 3, "C", "C", "C", now.minusYears( 1 ) ),
                new Movie( 4, "D", "D", "D", now.minusYears( 2 ) ),
                new Movie( 5, "E", "E", "E", now.minusYears( 7 ) ) ) );

    }

    @Test
    void addMovieTest() {
        // Добавление null должно вернуть false.
        assertFalse( moviesCollection.addMovie( null ) );
        // Добавление уже существующего должно вернуть false
        assertFalse( moviesCollection.addMovie( new Movie( 2, "B", "B", "B", now.minusYears( 4 ) ) ) );
        assertEquals( 5, moviesCollection.totalQuantity() );
        // Добавление нового элемента
        assertTrue( moviesCollection.addMovie( new Movie( 6, "F", "B", "B", now.minusYears( 8 ) ) ) );
       // Проверка, что фильм добавился
        assertEquals( 6, moviesCollection.totalQuantity() );

    }

    // Проверка удаления фильма из коллекции фильмов
    @Test
    void removeMovieTest() {
        // Проверка удаления несуществующего фильма
        assertNull( moviesCollection.removeMovie( 6 ) );
        assertEquals( 5, moviesCollection.totalQuantity() );
        // Проверка удаления существующего фильма
        assertNotNull( moviesCollection.removeMovie( 5 ) );
        // Проверка количества фильмов после удаления
        assertEquals( 4, moviesCollection.totalQuantity() );

    }

   // Тест метод поиска фильма
    @Test
    void findByIdTest() {
       // Поиск фильма метод findByIdTest должен вернуть не-null
        Movie movie = (Movie) moviesCollection.findById( 3 );
        assertNotNull( movie ); // Проверка, что найден фильм
        assertEquals( "C", movie.getTitle() );// Проверка по title найденного фильма
    }

    // Тест метод поиска фильмов по жанру.
    @Test
    void findByGenreTest() {
        // Поиск фильмов по жанру
        Iterable<Movie> movies = moviesCollection.findByGenre("D");
        int count = 0;// счетчик
        for (Movie movie : movies) { // Перебор фильмов
            assertEquals("D", movie.getGenre()); // Проверка жанра найденных фильмов
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(1, count); // Проверка найденных фильмов по жанру "D"
    }

    //Тест метод поиска фильмов по режиссеру.
    @Test
    void findByDirectorTest() {
        // Поиск фильмов по режиссеру
        Iterable<Movie> movies = moviesCollection.findByDirector("C");
        int count = 0; // счетчик
        for (Movie movie : movies) { // Перебор фильмов
            // Проверка режиссера найденных фильмов
            assertEquals("C", movie.getDirector());
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(1, count); // Проверка количества найденных фильмов по режиссеру "C"
    }

    //Тест метод поиска фильмов, между указанными датами
    @Test
    void findMoviesCreatedBetweenDaysTest() {
        // Определение начальной и конечной дат для поиска фильмов
        LocalDate startDate = LocalDate.now().minusYears(4);
        LocalDate endDate = LocalDate.now().minusYears(1);

        // Поиск фильмов, между указанными датами
        Iterable<Movie> movies = moviesCollection.findMoviesCreatedBetweenDays(startDate, endDate);
        int count = 0; // счетчик
        for (Movie movie : movies) { // Перебор фильмов

            // Проверка, что фильмы были созданы после начальной даты или включают эту дату
            assertTrue(movie.getDate().isAfter(startDate) || movie.getDate().isEqual(startDate));

            // Проверка, что фильмы были созданы до конечной даты или включают эту дату
            assertTrue(movie.getDate().isBefore(endDate) || movie.getDate().isEqual(endDate));
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(3, count); // Проверка найденных фильмов, созданных между указанными датами
    }

    //Тест метод totalQuantity(), возвращает общее количество фильмов
    @Test
    void totalQuantityTest() {
        // Проверка, что общее количество фильмов
        assertEquals(5, moviesCollection.totalQuantity());
    }

    // Тест проверяет метод iterator()
    @Test
    void iteratorTest() {
        int count = 0;
        for (Object movie : moviesCollection) { // Перебор фильмов
            assertNotNull(movie);// Проверка, что итератор возвращает непустые объекты фильмов
            count++;  // Увеличение счетчика найденных фильмов
        }

        assertEquals(5, count);// Проверка, что количество фильмов соответствует значению
    }
}