package ait.computer.model;


public class ComputerAppl {
    public static void main(String[] args) {
        double a = 10;// upper casting
        int b = (int) a;// down casting
        Computer[] shop = new Computer[5];
        shop[0] = new Computer( "i5", 12, 512, "HP" );
        shop[1] = new Laptop( "i7", 16, 512, "Asus", 3, 2.1 );
        shop[2] = new Laptop( "i7", 24, 1024, "Asus", 3, 2.1 );
        shop[3] = new Smartphone( "Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l );
        printArray( shop );
        int total = getTotalSSDapacity( shop );
        System.out.println( "Total ssd capacity = " + total );
        Laptop laptop1 = (Laptop) shop [1];// down casting
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);

        // Call a new method to get the total operating time of laptops
        double totalHoursLaptop = getTotalHoursLaptop( shop );
        System.out.println("Total operating time of laptop = " + totalHoursLaptop +" hours");

        // Call a new method to get the total capacity of laptop SSD drives
        int totalSSDLaptop = getTotalSSDLaptop( shop );
        System.out.println("Total capacity of laptop SSD drives = " + totalSSDLaptop + " MB");
    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println( arr[i] );
            }


        }
    }


    public static int getTotalSSDapacity(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }

    //Method to get the total operating time of laptops
    public static double getTotalHoursLaptop(Computer[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                res += ((Laptop) arr[i]).getHours();
            }
           if (arr[i] instanceof Smartphone) {
               res -= ((Smartphone) arr[i]).getHours();
            }
        }
        return res;
    }
    //Method to get the total capacity of laptop SSD drives
    public static int getTotalSSDLaptop(Computer[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop) {
                res += arr[i].getSsd();
            }
            if (arr[i] instanceof Smartphone) {
                res -= arr[i].getSsd();
            }
        }
        return res;
    }

}