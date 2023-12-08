package hw;

import hw.dao.MoviesCollectionImpl;
import hw.model.Movie;

import java.time.LocalDate;

//Create class with method main.
//In method main create object of class MoviesCollectionimpl.
//Add in collection of movies a few films, and print them.
//Also print all films produced in the last 5 years.
public class MoviesCollectionAppl {
    public static void main(String[] args) {
        MoviesCollectionImpl moviesCollection = new MoviesCollectionImpl();

        // Добавление фильмов в коллекцию
        moviesCollection.addMovie( new Movie( 1, "The Big Short", "Comedy-Drama", "Adam McKay", LocalDate.of( 2016, 3, 15 ) ) );
        moviesCollection.addMovie( new Movie( 2, "The Wolf of Wall Street", "Crime", "Martin Scorsese", LocalDate.of( 2013, 12, 17 ) ) );
        moviesCollection.addMovie( new Movie( 3, "Interstellar", "Fantastic", "Christopher Nolan", LocalDate.of( 2014, 11, 7 ) ) );
        moviesCollection.addMovie( new Movie( 4, "My Blind Date with Life", "Comedy-Drama", "Marc Rothemund", LocalDate.of( 2017, 1, 26 ) ) );
        moviesCollection.addMovie( new Movie( 5, "Limitless", "Fantastic", "Neil Burger", LocalDate.of( 2011, 3, 18 ) ) );

        // Распечатка всех фильмов коллекции
        System.out.println( "All movies in the collection:" );
        for (Movie movie : moviesCollection) {

            // выводим название фильмов и год создания
            System.out.println( movie.getTitle() + " - " + movie.getDate().getYear() );
        }

        // Печать фильмов, выпущенных за последние 10 лет.
        System.out.println( "\nMovies produced in the last 10 years:" );
        // Определяет дату 10 лет назад от текущей даты.
        LocalDate tenYearsAgo = LocalDate.now().minusYears( 10 );

        // Перебирает фильмы из коллекции созданные 10 лет назад
        for (Movie movie : moviesCollection.findMoviesCreatedBetweenDays( tenYearsAgo, LocalDate.now() )) {

            // выводим название фильма и год создания
            System.out.println( movie.getTitle() + " - " + movie.getDate().getYear() );
        }
        // Поиск фильмов по режиссеру
        System.out.println("\nMovies by director:");
        Iterable<Movie> moviesByDirector = moviesCollection.findByDirector("Marc Rothemund");
        for (Movie movie : moviesByDirector) {
            System.out.println(movie.getTitle() + " - Directed by: " + movie.getDirector());
        }

        // Поиск фильмов по жанру
        System.out.println("\nMovies by genre:");
        Iterable<Movie> moviesByGenre = moviesCollection.findByGenre("Comedy-Drama");
        for (Movie movie : moviesByGenre) {
            System.out.println(movie.getTitle() + " - Genre: " + movie.getGenre());
        }

    }
}
