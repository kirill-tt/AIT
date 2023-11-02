package practice.HWPet.model;

public class PetAppl {
    public static void main(String[] args) {
        Pet pet1  = new Pet(1,   "cat    ", 8, " Basilio");
        Pet pet2 = new Pet( 2,   "dog    ", 5, " Bim");
        Pet pet3 = new Pet( 3,   "parrot ", 2, " Kesha");

        pet1.display();
        pet2.display();
        pet3.display();

        pet1.wakesup();
        pet1.makeSound();
        pet1.is();
        pet1.play();
        pet1.walk();
        pet1.is();
        pet1.sleep();


    }
}
