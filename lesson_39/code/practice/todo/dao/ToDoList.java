package practice.todo.dao;

import practice.todo.model.Task;

public interface ToDoList {
    boolean addTask(Task task);
    void viewAllTask();
    void deleteTask (int taskNumber);
    void goOut();

}
