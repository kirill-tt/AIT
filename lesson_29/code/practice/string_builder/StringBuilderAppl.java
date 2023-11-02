package practice.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        // StringBuilder это класс в нем есть полезные методы для работы с строкой
        // append - добавить
        String str = "Java";
         // str = str + "_" + 11
       str = str.concat( "_" );// concat - это склеивание
        str = str.concat( "" +11 );// к строке добавляем примитив int
        System.out.println(str);

        // StringBuilder -mutable!
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append( "_" ).append( 11 );
        System.out.println(sb);// объект sb -мутирует
        sb.reverse(); // строка задом на перед
        System.out.println(sb);
        // Можно ли вернуть тип StringBuilder обратно в String

        str = sb.reverse().toString();
        System.out.println(str);



    }
}
