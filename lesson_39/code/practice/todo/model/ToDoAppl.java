package practice.todo.model;

import practice.todo.dao.ToDoList;
import practice.todo.dao.ToDoListImpl;

import java.time.LocalDateTime;
import java.util.Scanner;

//ToDoListAppl - финальный подход.
// Добавить поле в Task - дата и время создания задачи.
// Сделать работающее приложение - выводи список нумерованных задач,
// поиск и удаление задачи по номеру,
// задачи перенумеруются после удаления любой из них.
// Добавить защиту от неправильного ввода при работе с меню (буквы вместо чисел).
public class ToDoAppl {

    public static void main(String[] args) {
        System.out.println( "Welcome to ToDoAppl " );
        ToDoList toDoList = new ToDoListImpl( 10 ); // Создаем список задач

        LocalDateTime time = LocalDateTime.now();
        boolean exitRequested = false; // запрос на выход false
        while (!exitRequested) {
            try {
                ToDo.printMenu();// Выводим меню
                Scanner scanner = new Scanner( System.in );
                System.out.println( "Input your choice: " );// приглашение пользователя
                int choice = scanner.nextInt();// приняли ввод с клавиатуры

                switch (choice) {
                    case 1 -> {
                        // Вывод действия и приглашение к вводу задачи
                        scanner.nextLine();
                        System.out.println( "Enter your task:" );
                        String tasks = scanner.nextLine();
                        int taskId = toDoList.quantity() + 1;// Получение следующей задачи
                        LocalDateTime currTime = LocalDateTime.now();
                        Task newTask = new Task( taskId, tasks, tasks.length(), currTime );
                        boolean taskAdd = toDoList.addTask( newTask );
                        if (taskAdd) {
                            System.out.println( "Task added successfully!" );// Успешное добавление задачи
                        } else {
                            System.out.println( "Failed to add task. Task list may be full." );// если ошибка при добавлении задачи
                        }
                        break;
                    }
                    case 2 -> {
                        toDoList.viewAllTask();
                        break;
                    }
                    case 3 -> {
                        System.out.println( "Enter the task number to delete: " );
                        int taskNumberToDelete = scanner.nextInt();
                        if (toDoList.deleteTask( taskNumberToDelete )) {
                            System.out.println( "Task deleted successfully!" );

                        } else {
                            System.out.println( "Failed to delete task. Task number may be invalid." );
                        }
                        break;
                    }
                    case 4 -> {
                        toDoList.goOut();
                        //System.exit( 0 ); // Выйти из приложения
                    }
                    default -> {
                        System.out.println( "Wrong choice." );
                        //exitRequested = true;// запрос na выхода true
                    }
                }
            } catch (Exception e) {
                System.out.println( "Wrong input! Please try again" );
            }


        }
    }
}

