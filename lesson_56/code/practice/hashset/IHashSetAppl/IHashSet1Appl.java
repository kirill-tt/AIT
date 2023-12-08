package practice.hashset.IHashSetAppl;

import practice.hashset.IHashset1;
import practice.hashset.ISet1;



public class IHashSet1Appl {
    public static void main(String[] args) {
        ISet1<String> mySet = new IHashset1<>();
        System.out.println(mySet.size());
        mySet.add( "Berlin" );
        mySet.add( "Leipzig" );
        mySet.add( "Hamburg" );
        mySet.add( "Munich" );

        System.out.println(mySet.size());
        mySet.add( "Leipzig" );
        System.out.println(mySet.size());
        System.out.println("=======Iterator==============");
        for (String s : mySet) {
            System.out.println(s);

        }
        ISet1<Integer> numberSet = new IHashset1<>();
        for (int i = 0; i < 100; i++) {
            numberSet.add( i );

        }
        System.out.println("============Numbers============");
        for (Integer n : numberSet) {
            System.out.println(n + " | ");
        }

    }
}
