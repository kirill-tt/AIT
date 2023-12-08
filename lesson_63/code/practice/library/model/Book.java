package practice.library.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String author;
    private String name;
    private Integer issueYear;

    public Book(String author, String name, Integer issueYear) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals( author, book.author ) && Objects.equals( name, book.name ) && Objects.equals( issueYear, book.issueYear );
    }

    @Override
    public int hashCode() {
        return Objects.hash( author, name, issueYear );
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }



    @Override
    public int compareTo(Book o) {
        return this.author.compareTo( o.getAuthor() );
    }
}
