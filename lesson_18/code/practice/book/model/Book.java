package practice.book.model;

// Создайте класс Book с полями: название - title автор - author год издания - year уникальный номер - ISBN
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
//Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.
public class Book {
    private String title;
    private String author;
    private int year;
    private int numIsbn;

    // конструктор


    public Book(String title, String author, int year, int numIsbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.numIsbn = numIsbn;
    }
    //Getter & Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumIsbn() {
        return numIsbn;
    }

    public void setNumIsbn(int numIsbn) {
        this.numIsbn = numIsbn;
    }

    // Print
    public void display() {
        System.out.println("Title: " + title + "Author:  " + author + "  Year: " + year + "  ISBN : " + numIsbn );
    }
}
