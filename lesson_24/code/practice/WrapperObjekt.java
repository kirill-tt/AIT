package practice;

public class WrapperObjekt {

    public static void main(String[] args) {
        Integer myInt = 7;
        Double myDouble = 18.99;
        Character myChar = 'T';
        String myString = "Hello world!";
        System.out.println( myInt );
        System.out.println( myDouble );
        System.out.println( myChar );
        System.out.println(myString);
        System.out.println("---------------------------------------");


        Integer myInt1 = 444;
        Double myDouble1 = 12.05;
        Character myChar1 = 'A';
        System.out.println(myInt1.intValue());
        System.out.println(myDouble1.doubleValue());
        System.out.println(myChar1.charValue());
        System.out.println("---------------------------------------");


        Integer myInt2 = 1004;
        String myString1 = myInt2.toString();
        System.out.println(myString1.length());


    }
    }



