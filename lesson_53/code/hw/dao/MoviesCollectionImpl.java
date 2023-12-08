package hw.dao;


        import hw.model.Movie;

        import java.time.LocalDate;
        import java.util.*;

public class MoviesCollectionImpl implements MoviesCollection <Movie> {

    private Collection<Movie> movies;
    public MoviesCollectionImpl(){
        movies = new ArrayList<>();
    }

    // constructor
    public MoviesCollectionImpl(List<Movie> list) {
        this();
        for (Movie m : list) {
           // movies.add(m);// Metod ot Arraylist , он не отсекает дубликаты на этапе создания
        addMovie( m );
        }
    }



    @Override
    public boolean addMovie(Movie movie) {
        if (movie == null) { // Проверка наличия фильма
            return false; // false, если фильм  null
        }
        if (movies.contains(movie)) { // Проверка фильма в коллекции
            return false; // false, если фильм уже существует
        }

        movies.add(movie);// Добавление фильма
        return true; // Возврат true, если фильм добавлен
    }



    @Override
    public Movie removeMovie(long imdb) {
        for (Movie movie : movies) { // Перебор фильмов
            if (movie.getImdb() == imdb) { // Проверка, соответствует ли imdb искомому фильму
                movies.remove(movie); // // Удаление найденного фильма
                return movie;// Возврат удаленного фильма
            }
        }
        return null; // Возврат null, если фильм не был найден

    }

    @Override
    public Movie findById(long imdb) {
        for (Movie movie : movies) { // Перебор фильмов
            if (movie.getImdb() == imdb) { // Проверка imdb фильма
                return movie; // Возврат найденного фильма
            }
        }
        return null; // Возврат null, если фильм не найден

    }

    @Override
    public Iterable<Movie> findByGenre(String gerne) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie movie : movies) { // Перебор фильмов

            if (movie.getGenre().equals(gerne)) { // Проверка жанра фильма
                foundByGenre.add(movie); // Добавление фильма по жанру
            }
        }
        return foundByGenre; // Возврат списка фильмов по жанру

    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        List<Movie> foundByDirector = new ArrayList<>();
        for (Movie movie : movies) { // Перебор фильмов
            if (movie.getDirector().equals(director)) { // Проверка режиссёра
                foundByDirector.add(movie); // Добавление фильма по режиссёру
            }
        }
        return foundByDirector; // Возврат списка по режиссёру
    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDays(LocalDate from, LocalDate to) {
        List<Movie> foundMovies = new ArrayList<>();
        for (Movie movie : movies) { // Перебор фильмов
            LocalDate movieDate = movie.getDate();//извлекаем дату фильма

            // Проверка даты фильма по диапазону дат
            if ((movieDate.isEqual(from) || movieDate.isAfter(from)) && movieDate.isBefore(to)) {
                foundMovies.add(movie);// Добавление фильма
            }
        }
        return foundMovies;// Возврат списка фильмов
    }

    @Override
    public int totalQuantity() {
        return movies.size();// общее количество фильмов
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();//итератор для перебора фильмов
    }
}
