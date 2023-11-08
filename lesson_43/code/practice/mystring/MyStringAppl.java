package practice.mystring;

import java.util.Iterator;

public class MyStringAppl {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("To be or not too be");
        Mystring myString = new Mystring(str);

        Iterator<Character> iterator = myString.iterator();
        while (iterator.hasNext()){
        char ch = iterator.next();
        if(ch == 'o'){
            iterator.remove();
        }
        }
        System.out.println(myString);
    }

       /* myString.addChar( '!' );
        System.out.println(myString);
        myString.removeChar( 'r' );
        System.out.println(myString);
        myString.removeChar( 'o' );
        System.out.println(myString);

        // напечатаем всю строку болyщими i буквами
        StringBuilder builder = myString.getStr(); // в переменную builder забрали содержимое
        for (int i = 0; i <builder.length() ; i++) {
            char c = builder.charAt( i );
            c = Character.toUpperCase( c );
            System.out.print(c);
        }

        // другой программист делает:
        System.out.println();
        builder.setLength( 5 );// обрезали длину строки
        System.out.println(builder);// напечатали
        System.out.println(myString);// изменилась исходная строка плохо!



    }*/
}
