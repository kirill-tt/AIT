package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;
import practice.computers.model.SmartPhone;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] comp = new Computer[5];

        comp[0] = new Computer( "i9", 16, 512, "Asus" );
        // System.out.println(comp[0]);

        comp[1] = new Laptop( "I5", 8, 256, "Acer", "14", 1000, 2 );
        // System.out.println(comp[1]);

        comp[2] = new Laptop( "M2", 16, 512, "MacBook", "14", 5000, 1.6 );
        comp[3] = new SmartPhone( "A 15 Bionic", 6, 512, "Iphone 14 Pro", "6.1", 3279, 172, 12, "IOS 17" );
        comp[4] = new SmartPhone( "Qualcomm Snapdragon 8 Gen 2",12, 256,"Samsung s23 Ultra","6.8",5000, 233,12,"Android 13" );
        for (int i = 0; i < comp.length; i++) {
            System.out.println( comp[i] );

        }
        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd = sumHdd + comp[i].getHdd();

        }
        System.out.println( "Total Hdd = " + sumHdd );
    }
}

