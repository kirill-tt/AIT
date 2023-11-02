package practice.todo.model;

import practice.todo.dao.ToDoList;
import practice.todo.dao.ToDoListImpl;

import java.util.Scanner;

public class ToDoAppl {

    public static void main(String[] args) {
        System.out.println( "Welcome to ToDoAppl " );
        ToDo [] task = ToDo.values();
        for (int i = 0; i < task.length; i++) {
            System.out.println( (i + 1) + " - " + task[i].getAction() );

        }
        ToDoList toDoList = new ToDoListImpl( 10 );
        while (true) {

            System.out.println( "Input your choice: " );// приглашение пользователя
            Scanner scanner = new Scanner( System.in );
            int choice = scanner.nextInt();// приняли ввод с клавиатуры

            switch (choice) {
                case 1-> {
                    scanner.nextLine();
                    System.out.println( "Your choice is: " + task[choice - 1].getNumber());
                    System.out.println( "The task is: " + task[choice - 1].getAction());
                     String tasks = scanner.nextLine();
                     Task newTask = new Task( 1,"Bay milk", 1 );
                     toDoList.addTask( newTask );
                    break;
                }
                default -> {
                    System.out.println( "Wrong choice." );
                }
            }

        }
    }


    }

