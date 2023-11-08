package practice.homework.model;

public enum Menu {
    ADD( 1, "Add document" ),DELETION(2,"Deleting a document"), SEARCH(3, "Search of document "),LIST( 4, "List of documents" ), QUANTITY( 5, "Quantity" ),  EXIT(6, "Exit" );

    //fields
    private int menuItem;
    private String action;

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu() {
        Menu[] menu = Menu.values(); // put enum items into array
        for (int i = 0; i < menu.length; i++) {
            System.out.print( (menu[i].menuItem) + " - " + menu[i].action + " | "  );
        }
        System.out.println(); // new line
    }
}