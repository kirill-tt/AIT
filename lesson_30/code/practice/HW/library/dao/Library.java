package practice.HW.library.dao;

import practice.HW.library.model.Book;

import java.util.List;

public interface Library {
    boolean addBook(Book book); // Добавить книгу

    Book removeBook(int iSbn); // Удалить книгу

    Book findBook(int iSbn);// Найти книгу
    int bookCount();// Получить количество книг
Book findBookAuthor(String author);

   void printBook();// Напечатать список книг


}
