package practice.HWPet.model;
//Создать класс Pet (Домашнее животное)
//с приватными полями: id, вид, возраст, кличка
//Стандартные методы:конструктор на все поля;геттеры и сеттеры на все поля;метод display
//Дополнительные методы:спать, есть, делать звук, играть, гулять
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.
public class Pet {
    private int id;
    private String view;
    private int age;
    private String nickname;

    // конструктор класса

    public Pet(int id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }
// Getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void display(){
        System.out.println("Id:" + id + "  view:" + view + "  age:" + age + "  nickname:" +nickname);
    }
    public void is(){
        System.out.println("Pet eats...");
    }
    public void makeSound(){
        System.out.println("pet makes a sound ");
    }
    public void sleep(){
        System.out.println("the pet is sleeping ");
    }
    public void play(){
        System.out.println("pet playing ");
    }
    public void walk(){
        System.out.println("pet is walking  ");
    }
    public void wakesup(){
        System.out.println("pet wakes up");
}
    }