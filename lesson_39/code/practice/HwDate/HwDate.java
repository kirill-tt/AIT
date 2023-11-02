package practice.HwDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class HwDate {


    public static int getAge(String birthDate) {

            String[] parts = birthDate.split("-");

            if (parts.length != 3) {
                return -1; // Неверный формат даты
            }

            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);

            LocalDate birthLocalDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();
            int age = currentDate.getYear() - birthLocalDate.getYear();

            // Проверка, если день рождения еще не наступил в текущем году
            if (birthLocalDate.getMonthValue() > currentDate.getMonthValue() ||
                    (birthLocalDate.getMonthValue() == currentDate.getMonthValue() && birthLocalDate.getDayOfMonth() > currentDate.getDayOfMonth())) {
                age--;
            }

            return age;
        }

        public static String[] sortStringDates(String[] dates) {
            // Просто сортируем массив строк с датами
            Arrays.sort(dates);
            return dates;
        }
    }







