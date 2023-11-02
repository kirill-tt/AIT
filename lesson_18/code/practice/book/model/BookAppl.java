package practice.book.model;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book( "The Little Prince | ", "Antoine de Saint-Exupery | ",1946, 1 );
        book1.display();
        System.out.println( "--------------------------------------------------------------------------------" );

        Book book2 = new Book( "Мастер и маргарита | ", "Михаил Афанасьевич Булгаков | ",1966, 2 );
        book2.display();
        System.out.println( "--------------------------------------------------------------------------------" );

        Dictionary1 book3 = new Dictionary1( "Англо – русский словарь | ", " Владимир Мюллер | ",2007, 3, " Английский Русский" );
        book3.display();
        System.out.println( "--------------------------------------------------------------------------------" );

        Dictionary1 book4 = new Dictionary1( "Русско – немецкий словарь | ", "Михаил Цвиллинг | ",2009, 4, " Русский Немецкий" );
        book4.display();
        System.out.println( "--------------------------------------------------------------------------------" );
        System.out.println("DONE!");
    }
}
