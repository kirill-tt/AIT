package practice.book.model;

public class  Dictionary1 extends Book{
    private String language;

    public Dictionary1(String title, String author, int year, int numIsbn, String language) {
        super( title, author, year, numIsbn );
        this.language = language;
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
        System.out.println("Dictionary language :" + language);

    }
}
