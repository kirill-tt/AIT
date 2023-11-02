package practice.book.model;

public class Dictionary extends Book{
    private String genre;
    private String language;

    public Dictionary(String title, String author, int year, int numIsbn, String genre, String language) {
        super( title, author, year, numIsbn );
        this.genre = genre;
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Genre: " + genre + " Language: " + language);
    }
}
