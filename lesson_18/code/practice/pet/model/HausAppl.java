package practice.pet.model;

public class HausAppl {
    public static void main(String[] args) {
        Cat pet1 = new Cat( "cat", 10, "Tim", 10, "BSH" );
        pet1.display();
        pet1.voic();
        pet1.wakesup();
        pet1.is();
        pet1.walk();
        pet1.sleep();
        System.out.println( "------------------------------------------------------------" );
        Cat pet3 = new Cat( "cat", 5, "Tom", 4, "Siamese" );
        pet3.display();
        pet3.voic();
        pet1.wakesup();
        pet1.is();
        pet1.walk();
        pet1.sleep();
        System.out.println( "------------------------------------------------------------" );
        Dog pet2 = new Dog( "dog", 4, "Lacky", 37.5, 80.0 );
        pet2.display();
        pet2.voic();
        pet2.wakesup();
        pet2.is();
        pet2.play();
        pet2.walk();
        pet2.sleep();
        System.out.println( "------------------------------------------------------------" );
        Cat pet4 = new Cat( "cat",2 ,"Felix",5,"Persian");
        pet4.display();
        pet4.voic();
        pet1.wakesup();
        pet1.is();
        pet1.walk();
        pet1.sleep();
        System.out.println( "------------------------------------------------------------" );
        Dog pet5 = new Dog( "dog",7, "Boss", 65.8,101.4 );
        pet5.display();
        pet5.voic();
        pet5.is();
        pet5.play();
        pet5.walk();
        pet5.sleep();
        System.out.println( "------------------------------------------------------------" );

    }

}

