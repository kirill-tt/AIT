package practice;
//В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target
// и должна вывести одно натуральное число.
public class HwRunTarget {
    public static void main(String[] args) {
        double start =1.5;
        int target =10;
        int day = 0;
        while (start <= target){
            start = start +( start * 0.1);
            day++;
            System.out.println(" Your target for the day " + start +" km" );
        }
        System.out.println(" Your target " + target+" km will be reached in " + day +" days");
    }

}
