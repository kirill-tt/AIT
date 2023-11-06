package practice.todo.model;

import practice.todo.dao.ToDoList;
import practice.todo.dao.ToDoListImpl;

import java.util.Scanner;

public class ToDoAppl {

    public static void main(String[] args) {
        System.out.println( "Welcome to ToDoAppl " );
        ToDo[] task = ToDo.values();
        for (int i = 0; i < task.length; i++) {
            System.out.println( (i + 1) + " - " + task[i].getAction() );

        }
        ToDoList toDoList = new ToDoListImpl( 10 );
        while (true) {

            System.out.println( "Input your choice: " );// приглашение пользователя
            Scanner scanner = new Scanner( System.in );
            int choice = scanner.nextInt();// приняли ввод с клавиатуры

            switch (choice) {
                case 1 -> {
                    // Вывод действия и приглашение к вводу задачи
                    scanner.nextLine();
                    System.out.println( "Your choice is: " + task[choice-1].getNumber() );
                    System.out.println( "The task is: " + task[choice -1].getAction() );
                    System.out.println( "Enter your task:" );
                    String tasks = scanner.nextLine();
                    int taskId = toDoList.quantity() + 1;// Получение следующей задачи
                    Task newTask = new Task( taskId, tasks, tasks.length());
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
                    int taskNumber = scanner.nextInt();
                    toDoList.deleteTask( taskNumber - 1 );
                    break;
                }
                case 4 -> {
                    toDoList.goOut();
                    System.exit( 0 ); // Exit the application
                }
                default -> {
                    System.out.println( "Wrong choice." );
                }
            }
            // Повторяем запрос до тех пор, пока не будет введен корректный выбор
            while (choice < 1 || choice > 4) {
                System.out.println("Input your choice:");
                choice = scanner.nextInt();
            }
        }
    }
    }

