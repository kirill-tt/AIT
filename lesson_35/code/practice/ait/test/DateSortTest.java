package practice.ait.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        // Создаем Comparator для сравнения дат
        comparator = (s1, s2) -> {
            // TODO Homework. Don't use Java Time
            // Разбиваем строку с помощью split на составляющие (день, месяц и год, убираем "-")
            String[] date1 = s1.split("-");
            String[] date2 = s2.split("-");

            // Извлекаем значения дня, месяца и года из обеих дат
            int day1 = Integer.parseInt(date1[0]);
            int month1 = Integer.parseInt(date1[1]);
            int year1 = Integer.parseInt(date1[2]);

            int day2 = Integer.parseInt(date2[0]);
            int month2 = Integer.parseInt(date2[1]);
            int year2 = Integer.parseInt(date2[2]);

            // Сравниваем годы, если они разные, то возвращаем разницу
            if (year1 != year2) {
                return year1 - year2;
            }
            // Если годы одинаковые, сравниваем месяцы
            if (month1 != month2) {
                return month1 - month2;
            }
            // Если годы и месяцы одинаковы, сравниваем дни
            return day1 - day2;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };

        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
        System.out.println(Arrays.toString( dates ));
        System.out.println(Arrays.toString( expected ));

    }


}
