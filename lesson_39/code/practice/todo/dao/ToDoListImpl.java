package practice.todo.dao;

import practice.todo.dao.ToDoList;
import practice.todo.model.Task;

public class ToDoListImpl implements ToDoList {
    private Task[] tasks; // Массив для хранения задач
    private int size;// Текущий размер массива

    public ToDoListImpl(int capacity){
        tasks = new Task[capacity]; // Создание массива заданной емкости

    }

    // Метод для добавления задачи в список
    @Override
    public boolean addTask(Task task) {
        if (task == null || size == tasks.length) {
            return false; // Не удалось добавить задачу
        }
        task.setTaskNumber( size +1 );
        tasks[size] = task; // Добавление задачи в массив и увеличение размера
        size++;
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
                System.out.println(tasks[i]); // Вывод индекса и номера задачи
            }
        }

    }

    // Метод для удаления задачи

    @Override
    public boolean deleteTask(int taskNumber) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getTaskNumber() == taskNumber ) {// Нашли задачу, которую нужно удалить
                // Сдвиг всех задач с более высокими номерами на один назад
                for (int j = i; j < size - 1; j++) {
                    tasks[j] = tasks[j + 1];
                    tasks[j].setTaskNumber(j + 1);// Заменяем текущую задачу следующей
                    tasks[j].setId(j + 1); // Обновляем ID задачи
                }
                tasks[--size] = null; // Удаление последней (дублированной) задачи
                return true; // Задача успешно удалена
            }
        }
        return false; // Задача не была найдена, возвращаем false
    }
    @Override
    public void goOut() {
        System.out.println("Exit the application.");

    }

    @Override
    public int quantity() {
        return size;
    }
}
