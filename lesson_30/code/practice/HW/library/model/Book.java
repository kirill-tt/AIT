package practice.HW.library.model;

public class Book {
    //поля класса
    protected int iSbn;
    protected String authorName;
    protected String bookTitle;
    protected int yearOfPublishing;


    public Book(int iSbn, String authorName, String bookTitle, int yearOfPublishing) {
        this.iSbn = iSbn;
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getiSbn() {
        return iSbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        if (iSbn != book.iSbn) return false;
        return authorName.equals( book.authorName );
    }

    @Override
    public int hashCode() {
        int result = iSbn;
        result = 31 * result + authorName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iSbn=" + iSbn +
                ", authorName='" + authorName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
