package practice;
//Родители позволяют ребенку играть на компьютере 1 час. Напишите программу, которая будет реагировать на полученную в школе оценку:
//
//"Молодец!", время для игр на компьютере увеличивается на 30 мин.
//"Хорошо", ты можешь играть на компьютере обычные 60 минут.
//"Посредственно.", время для игр уменьшается на 30 мин.
//"Плохо!", сегодня никаких игр на компьютере.
//"Позор семьи!", никаких игр на компьютере 2 дня.



import java.util.Scanner;

public class Evaluation { public static void main(String[] args) {

     int timeForGame = 60; //сколько разрешено играть

   Scanner scanner = new Scanner( System.in );//  включили ввод с клавиатуры
        System.out.println("Input today`s mark: "); //приглашение ко вводу
        int mark = scanner.nextInt();// получение оценки с клавиатуры
        switch (mark) {
            case 1 -> {
                System.out.println( "Good child!" );//похвалили
                timeForGame = timeForGame + 30;// увеличили время
                System.out.println( "Time for game = " + timeForGame + "min" );
            }
            case 2 -> {
                System.out.println( "Seher gut!" );
            }
            case 3 -> {
                System.out.println( "No so good" );
                timeForGame = timeForGame - 30;
            }
            case 4 -> {
                System.out.println( "Very bad!" );
                timeForGame = 0;
            }
            case 5 -> {
                System.out.println( "Shame you!" );
                System.out.println( "No games for 2 days!" );
            }
            default -> {// если ввели неправильное число
                System.out.println( "Wrong input!" );
            }
        }
    }
}
