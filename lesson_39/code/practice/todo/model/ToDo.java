package practice.todo.model;

public enum ToDo {

ADD(1,"Add a note"), SEE(2,"See all posts"), DEL(3, "Delete entry (by number)"), OUT(4, "Go out");
    private int number;
    private String action;

    ToDo(int number, String action) {
        this.number = number;
        this.action = action;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public void printMenu () {
        System.out.println("Menu: ");
        for (ToDo item : ToDo.values()) {
            System.out.println(item.getNumber() + " - " + item.getAction());
        }
    }

}
