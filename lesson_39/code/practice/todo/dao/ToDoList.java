package practice.todo.dao;

import practice.todo.model.Task;

public interface ToDoList {
    boolean addTask(Task task);
    void viewAllTask();
    boolean deleteTask (int taskNumber);
    void goOut();
int quantity();
}
