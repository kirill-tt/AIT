package practice;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.
public class HWTemperature {
    public static void main(String[] args) {
        int[] temperatureDay = new int[7];
        temperatureDay[0] = 27; // Monday
        temperatureDay[1] = 26; // Tuesday
        temperatureDay[2] = 22; // Wednesday
        temperatureDay[3] = 26; // Thursday
        temperatureDay[4] = 28; // Friday
        temperatureDay[5] = 29; // Saturday
        temperatureDay[6] = 30; // Sunday

        System.out.println( "Temperature on Tuesday: " + temperatureDay[1] + " °C " );
        System.out.println( "Temperature on Tuesday: " + temperatureDay[3] + " °C " );
        double averageTemperature = calculateAverageTemperature( temperatureDay );
        System.out.println( "Average temperature for the week: " + averageTemperature + " °C " );


    }

    public static double calculateAverageTemperature(int[] temperatures) {
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.length;
    }
}







