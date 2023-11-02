package practice;
//Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.

public class HW25 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        System.out.println( str );
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "Last character of line: " + str.charAt( str.length() - 1 ) );// last character of line
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "Position of the substring “Java” in the string: " + str.indexOf( "Java" ) );//position of the substring “Java” in the string
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "Contains 'Java': " + str.contains( "Java" ) );//We check whether the given string contains the substring “Java”, expect true
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "replacement o na a: " + str.replace( "o", "a" ) );// replacement o na a
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "Uppercase string: " + str.toUpperCase() );// uppercase string
        System.out.println("--------------------------------------------------------------------");
        System.out.println( "lowercase string: " + str.toLowerCase() );//lowercase string
        System.out.println("--------------------------------------------------------------------");
        System.out.println(str.substring( 0,18  ) + str.substring( 23,24 )+str.substring( 29 ) );//Cutting a Java substring using the method substring().
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Ends with '!!!': " + str.endsWith("!!!")); //We check whether the string ends with the substring “!!!”, expect true
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Starts with 'I'm proud': " + str.startsWith("I'm proud"));//Checking if a string begins with a substring “I'm proud”, expect true

    }
}
