package practice;
//Часть 1. Хозяйка налепила для гостей 30 пельменей,
// каждый весом от 25 до 35 грамм.
// Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
// Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;

public class HappyDumpling {

        public static void main(String[] args) {
            int numberOfDumpling = 30; // Количество пельменей
            int[] dumplingsWeights = new int[numberOfDumpling]; // Создание массива для веса каждого пельменя

            Random random = new Random(); // Создание объекта Random для генерации случайных чисел
            int luckyDumplingIndex = random.nextInt(numberOfDumpling); // Случайно выбираем индекс счастливого пельменя

            // Заполняем массив данными о весе каждого пельменя
            for (int i = 0; i < numberOfDumpling; i++) {
                int baseWeight = random.nextInt(35-25) + 25; // Генерируем случайный вес от 25 до 35 граммов
                int weightCoin = baseWeight + 15; // Увеличиваем вес на 15 граммов

                if (i == luckyDumplingIndex) {
                    dumplingsWeights[i] = weightCoin; // Счастливый пельмень
                } else {
                   dumplingsWeights[i] = baseWeight; // Обычный пельмень
                }
            }

            // Находим и выводим счастливый пельмень
            for (int i = 0; i < numberOfDumpling; i++) {
                if (dumplingsWeights[i] > 40) { // Если вес пельменя больше 40 граммов, это счастливый пельмень
                    System.out.println("Lucky dumpling with coin: dumpling " + (i + 1) + " (" + dumplingsWeights[i] + " gram)");
                }
            }
        }
    }


