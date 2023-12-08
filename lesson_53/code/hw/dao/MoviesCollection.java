package hw.dao;

import hw.model.Movie;

import java.time.LocalDate;

public interface MoviesCollection<Movie> extends Iterable<Movie> {
    boolean addMovie (Movie movie);
    Movie removeMovie (long imdb);
    Movie findById(long imdb);
    Iterable<Movie>findByGenre(String gerne);
    Iterable<Movie>findByDirector(String director);
    Iterable<Movie> findMoviesCreatedBetweenDays(LocalDate from , LocalDate to);
    int totalQuantity();

}
