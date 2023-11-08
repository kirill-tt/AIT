package practice.homework.model;

import practice.homework.dao.Archive;
import practice.homework.dao.ArchiveImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
//Разработать приложение ArchiveAppl, в котором должно быть меню с функциями:
//добавить документ (запрос id документа, id папки, названия документа, url, присвоение текущей даты и времени)
//показать список всех документов в архиве
//узнать количество хранимых документов в архиве
//выход

//Добавить в ArchiveAppl две функции:
//поиск документа (id папки, id документа)
//удаление документа (id папки, id документа)
public class ArchiveAppl {
    public static void main(String[] args) {
        System.out.println( "Welcome to ArchiveAppl " );
        Archive archive = new ArchiveImpl( 100 ); // Создаем архив
        LocalDateTime time = LocalDateTime.now();// добавляем дату
        boolean exitRequested = false; // запрос на выход false

        while (!exitRequested) {
            try{
          Menu.printMenu();
            Scanner scanner = new Scanner( System.in );// Создаем Scanner для ввода пользователя
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt(); //ввод пользователя
            switch (choice) {

                case 1:
                    // Добавление документа
                    System.out.println( "Enter folder id: " );// Просим пользователя ввести docFolderId
                    int docFolderId = scanner.nextInt();// Считываем  docFolderId
                    System.out.println( "Enter document id: " );// Просим пользователя ввести documentId
                    int documentId = scanner.nextInt();// Считываем documentId
                    scanner.nextLine(); // Чтобы перейти на новую строку и считать следующую строку
                    System.out.println( "Enter document title: " );// Просим пользователя ввести title
                    String titles = scanner.nextLine();// Считываем title
                    System.out.println( "input URL: " );// Просим пользователя ввести URL
                    String url = scanner.nextLine();// Считываем URL
                    LocalDateTime currTime = LocalDateTime.now();// Получаем текущую дату и время
                    // Создаем объект документа с текущей датой и временем
                    Documents documents = new Documents( docFolderId, documentId, titles, url, currTime );

                    if (archive.addDocument( documents )) { // Пытаемся добавить документ в архив
                        System.out.println( "Document added successfully." );// добавление прошло успешно
                    } else {
                        System.out.println( "Error adding document." );// произошла ошибка при добавлении
                    }
                    break;
                case 2:
                    // Удаление документа
                    System.out.println("Enter folder id: ");// Просим пользователя ввести идентификатор папки
                    int deleteDocFolderId = scanner.nextInt();// Считываем идентификатор папки
                    System.out.println("Enter document id: ");// Просим пользователя ввести идентификатор документа
                    int deleteDocumentId = scanner.nextInt();// Считываем идентификатор документа
                    if (archive.removeDocument(deleteDocFolderId, deleteDocumentId)) {
                        System.out.println("Document removed successfully.");// удаление прошло успешно
                    } else {
                        System.out.println("Error removing document.");//произошла ошибка при удалении

                    }
                    break;
                case 3:
                    // Поиск документа
                    System.out.println("Enter folder id: ");// Просим пользователя ввести идентификатор папки
                    int searchDocFolderId = scanner.nextInt();// Считываем идентификатор папки
                    System.out.println("Enter document id: ");// Просим пользователя ввести идентификатор докумен
                    int searchDocumentId = scanner.nextInt();// Считываем идентификатор документа
                    Documents foundDocument = archive.getDocumentFromArchive(searchDocFolderId, searchDocumentId);
                    if (foundDocument != null) {
                        System.out.println("Document found: " + foundDocument);// Если документ найден, выводим информацию о нем
                    } else {
                        System.out.println("Document not found.");// Если документ не найден
                    }
                    break;
                case 4:

                    // Показать список всех документов в архиве
                    Documents[] allDocuments = archive.getAllDocumentFromArchive(); // Получаем все документы из архива
                    System.out.println("List of documents in the archive:");
                    for (Documents doc : allDocuments) {
                        System.out.println(doc); // Выводим информацию о документ

                  }
                    break;
                case 5:

                    // Узнать количество хранимых документов в архиве
                    int documentCount = archive.size(); // количество документов в архиве
                    System.out.println( "In the archive " + documentCount + " document." );
                    break;
                case 6:
                    // Выход из приложения
                    scanner.close();
                    System.out.println( "Exit the application." );
                    exitRequested = true;// запрос на выход true
                    break;
                default:
                    System.out.println( "Incorrect choice. Please select a menu item from 1 to 4." );
            }
            }catch (Exception e){
                System.out.println( "Wrong input! Please try again");
            }
        }
    }

    }

