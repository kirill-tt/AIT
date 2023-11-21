package practice.hw;
//Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября.
// Данные представлены в виде двух массивов.
// Рассчитайте среднюю температуру в городе за прошедшие две недели.
public class Temperature {

        public static void main (String[]args){
            // температура за последнюю неделю октября
            int[] temperaturesOctober = {13, 11, 14, 11, 11, 11, 13};

            // температура за первую неделю ноября
            int[] temperaturesNovember = {12, 11, 11, 10, 10, 9, 9};

            // Рассчитываем среднюю температуру
            double averageTemperature = sumOfTemperatures( temperaturesOctober ) + sumOfTemperatures( temperaturesNovember );

            // Выводим результат
            System.out.println( "Average temperature for two weeks: " + averageTemperature / 2 );
        }
        // метод вычисления средней температуры
        static double sumOfTemperatures ( int[] temperatures){
            int sum = 0; // ставим счетчик на

            // Считаем сумму температур
            for (int i = 0; i < temperatures.length; i++) {
                sum += temperatures[i];
            }
            // Рассчитываем и возвращаем среднюю температуру
            return (double) sum / temperatures.length;

        }
    }
