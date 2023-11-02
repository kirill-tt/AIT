package practice.pet.model;

public class Dog extends Pet{
    private double height;
    private double length;

    public Dog(String view, int age, String nickname, double height, double length) {
        super( view, age, nickname );
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void voic () {
        System.out.println( "Woof-woof! " );
    }
    public void display() {
        super.display();
        System.out.println("Height: "+ height);
        System.out.println("Length:" + length);
    }
    public void sleep(){
        System.out.println("dog is sleeping ");
    }
    public void play(){
        System.out.println("dog playing ");
    }
    public void walk(){
        System.out.println("dog is walking  ");
    }
    public void wakesup(){
        System.out.println("dog wakes up");
    }
    public void is(){
        System.out.println("dog eats...");
    }
}

