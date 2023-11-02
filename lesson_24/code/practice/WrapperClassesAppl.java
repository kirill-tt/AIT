package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        // количество чисел в числе, версия 2 (делим на 10 до получения 0)
        Integer x = 1_987_654_321; // это объект класса типа Integer
        String st = x.toString();// Преобразование в строку
        int l = st.length();// Узнали длину строки
        System.out.println( "Number of digits in " + x + " = " + l );
        System.out.println( "Max value og Integer" + x.MAX_VALUE );
        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println( "Number of digits in " + y + " = " + st1.length() );

        // присвоение и вычисления
        int n = 20;
        Integer m = 10;
        System.out.println( "n = " + n );
        System.out.println( "m = " + m );
        m = m + n;//автораспаковка и автоупаковка
        System.out.println("m + n = " + m);
        Double pi = 3.14;
        double circlelength = 2 * pi * 10;
        System.out.println("Circle length = " + circlelength);
        System.out.printf("Circle length = %.2f", circlelength);

        // konstanti klassov obertok
        System.out.println("---------------Consatnts of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);

        // обработка деления на 0
        System.out.println("---------------------Not-aNumber (NaN)------------");
        double a = 20.0 / 2;
        if (Double.isInfinite(a) || Double.isNaN( a )){ // получилось бесконечность или несуществующее число
            System.out.println("Wrong operation or wrong result. ");

        }else {
            System.out.println(a);
        }
        // Перевод строки String в число
        System.out.println("Parsing String to number");
        String str = "0987654321";
        int num = Integer.parseInt( str );
        System.out.println("String = " +str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble( str1 );
        System.out.println("Exp = " + exp);
    }
}
