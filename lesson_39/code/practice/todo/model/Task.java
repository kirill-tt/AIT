package practice.todo.model;

public class Task implements Comparable<Task>{
private int id;
private String task;
private  int taskNumber;

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String toString() {
        return
                "id# " + id +
                "| task (" + task +
                ")| taskNumber/" + taskNumber ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task1)) return false;

        if (id != task1.id) return false;
        if (taskNumber != task1.taskNumber) return false;
        return task.equals( task1.task );
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + task.hashCode();
        result = 31 * result + taskNumber;
        return result;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare( this.taskNumber, o.taskNumber);

    }
}
