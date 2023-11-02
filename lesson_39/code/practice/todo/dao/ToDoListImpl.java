package practice.todo.dao;

import practice.todo.dao.ToDoList;
import practice.todo.model.Task;

public class ToDoListImpl implements ToDoList {
private Task[] tasks; // Массив для хранения задач
private int size;// Текущий размер массива
    private int capacity;
public ToDoListImpl(int capacity){
    tasks = new Task[capacity]; // Создание массива заданной емкости
}

    // Метод для добавления задачи в список
    @Override
    public boolean addTask(Task task) {
        if (task == null || size == tasks.length || tasks[size] != null) {
            return false; // Не удалось добавить задачу
        }
        tasks[size++] = task; // Добавление задачи в массив и увеличение размера
        return true; // Задача успешно добавлена
    }

    // Метод для просмотра всех задач в списке
    @Override
    public void viewAllTask() {
        if (size == 0) {
            System.out.println("The task list is empty. "); // Сообщение, если список пустой
        } else {
            System.out.println("Task list:");
            for (int i = 0; i < size; i++) {
                System.out.println(i + " - " + tasks[i].getTaskNumber()); // Вывод индекса и номера задачи
            }
        }

    }

    // Метод для удаления задачи

    @Override
    public void deleteTask(int taskNumber) {
        if (taskNumber < 0 || taskNumber >= size) {
            System.out.println("Wrong task ID.");// Сообщение, если указан некорректный ID
            return;
        }
        for (int i = taskNumber; i < size - 1; i++) {
            tasks[i] = tasks[i + 1];
        }
        tasks[--size] = null;
        System.out.println("The task was successfully deleted.");


    }

    @Override
    public void goOut() {
        System.out.println("Exit the application.");

    }

    @Override
    public int quantity() {
        return quantity();
    }
}
