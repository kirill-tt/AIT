package variables;

public class MethodsAdvAppl {
    public static void main(String[] args) {
        //длидлина окружности L = 2 * Pi * r
        double constanta = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLenght(100); // в скобках - это радиус окружности
        System.out.println("L = " +res);
    }

    public static double circleLenght(double radius){
        return 2 * pi() * radius;
    }

    public static void printPi(double p){
        System.out.println("Pi = " + p);
    }

    public static double pi(){ // double - метметод долдолжен вервернуть такой тип
        double pi = 3.1415926;
        return pi;
    }
}
