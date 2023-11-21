package practice.hw;

import java.util.HashSet;
import java.util.Set;
// Создайте enum с кодами валют и их текущими курсами к евро.
// Убедитесь, что в списке нет дублирующихся кодов валют.
// Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя
// выбрать желаемую валюту, ввести ее количество и узнать,
// сколько он получит при обмене на евро.

public enum Currency {
    USD(0.91),
    GBP(1.14),
    JPY(0.0062),
    AUD(0.60),
    RUB(0.010),
    BTC (34178.44),
    ETH(1855.64),
    BNB(239.48),
    XRP(0.57),
    SOL(55.18);

    private final double rateToEuro;

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    public static void printCurrencies() {
        System.out.println("Available currencies and their rates to the euro:");
        for (Currency currency : values()) {
            System.out.println(currency.name() + " - " + currency.getRateToEuro() + " EUR");
        }
    }

    // Проверка на дубликаты кодов валют
    static {
        Set<String> currencyCodes = new HashSet<>();
        for (Currency currency : values()) {
            if (!currencyCodes.add(currency.name())) {
                throw new IllegalStateException("Duplicate currency code: " + currency.name());
            }
        }
    }

}