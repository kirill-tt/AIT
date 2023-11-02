package practice.pet.model;

public class Cat extends Pet{
    private int weight;
    private String breed;

    public Cat(String view, int age, String nickname, int wight, String breed) {
        super( view, age, nickname );
        this.weight = wight;
        this.breed = breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void voic (){
        System.out.println("Meow! ");

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Weight: "+ weight);
        System.out.println("Breed: " + breed);
    }

    public void sleep(){
        System.out.println("cat is sleeping ");
    }
    public void play(){
        System.out.println("cat playing ");
    }
    public void walk(){
        System.out.println("cat is walking  ");
    }
    public void wakesup(){
        System.out.println("cat wakes up");
    }
    public void is(){
        System.out.println("cat eats...");
    }
}
