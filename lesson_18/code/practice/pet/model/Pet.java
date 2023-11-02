package practice.pet.model;
//Создайте дочерние от класса Pet классы Cat и Dog
// c дополнительными полями:порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat
// и и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main.
// Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.
public class Pet {

    private String view;
    private int age;
    private String nickname;


    // конструктор класса
    public Pet(String view, int age, String nickname) {
        this.view = view;
        this.age = age;
        this.nickname = nickname;
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
        System.out.println("View: " + view +  "  age: " + age + "  nickname: " +nickname);
    }

}
