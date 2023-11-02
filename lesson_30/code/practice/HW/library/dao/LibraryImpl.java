package practice.HW.library.dao;

import practice.HW.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library {
    private Book [] books;
    int size ;

    // Конструктор класса
    public LibraryImpl( int capacity) {

      books = new Book[capacity];
      //size = 0;
    }

    @Override
    public boolean addBook(Book book) {// Добавляет книгу в библиотеку.
        if(book == null || size == books.length || findBook(book.getiSbn()) != null){
            return false;
        }
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Book removeBook(int iSbn) {// Удаляет книгу из библиотеки по ISBN (iSbn).
        Book removeBook = null;
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getiSbn() == iSbn) {
                removeBook = book;
                // Сдвигаем оставшиеся книги влево
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[size - 1] = null; // Очищаем последний элемент
                size--;
                break;
            }
        }
        return removeBook;
    }


    @Override
    public Book findBook(int iSbn) {// Ищет книгу в библиотеке по (iSbn).
        Book foundBook = null;
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getiSbn() == iSbn) {
                foundBook = book;
                break;
            }
        }
        return foundBook;
    }

    @Override
    public int bookCount() {
        // Возвращает количество книг в библиотеке.
        return size;
    }

    @Override
    public Book findBookAuthor(String author) {
        return null;
    }


    @Override
    public void printBook() { // Выводит информацию о всех книгах в библиотеке.
        for (int i = 0; i < size; i++) {

            System.out.println(books[i]);
        }
    }

    }



