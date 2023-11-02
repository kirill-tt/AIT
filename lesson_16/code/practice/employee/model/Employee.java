package practice.employee.model;

public class Employee {
    // поля класса
    private int id; // идентификатор
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private boolean gender; // пол сотрудника

    // конструктор класса

    public Employee(int id, String firsName, String lastName, int age, double salary, boolean gender) {
        this.id = id;
        this.firstName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void display() {
        System.out.println("ID: " + id + ", first name: " + firstName + ", last name: "
                + lastName + ", salary: " + salary + ", gender: " + (gender ? "male" : "female"));
    }
    public void work(){
        System.out.println("Employee is working hard!...");
    }
    public void lunch(){
        System.out.println("Employee eating lunch");
    }
    public void sleep(){
        System.out.println("Empoyee is sleeping");
    }
}
