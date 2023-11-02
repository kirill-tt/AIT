package practice;

public class MaxMinValue {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String type = args[i];
            if ("byte".equals(type)) {
                System.out.println(type + ": minimum = " + Byte.MIN_VALUE + ", maximum = " + Byte.MAX_VALUE);
            } else if ("short".equals(type)) {
                System.out.println(type + ": minimum = " + Short.MIN_VALUE + ", maximum = " + Short.MAX_VALUE);
            } else if ("char".equals(type)) {
                System.out.println(type + ": minimum = " + (int) Character.MIN_VALUE + ", maximum = " + (int) Character.MAX_VALUE);
            } else if ("int".equals(type)) {
                System.out.println(type + ": minimum = " + Integer.MIN_VALUE + ", maximum = " + Integer.MAX_VALUE);
            } else if ("long".equals(type)) {
                System.out.println(type + ": minimum = " + Long.MIN_VALUE + ", maximum = " + Long.MAX_VALUE);
            } else if ("float".equals(type)) {
                System.out.println(type + ": minimum = " + Float.MIN_VALUE + ", maximum = " + Float.MAX_VALUE);
            } else if ("double".equals(type)) {
                System.out.println(type + ": minimum = " + Double.MIN_VALUE + ",maximum = " + Double.MAX_VALUE);
            } else {
                System.out.println("Wrong Type: " + type);
            }
        }
    }
}


