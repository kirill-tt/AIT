package practice.currency.model;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String code;
    private double rate;
    private double sellRate;

    // Конструктор с двумя курсами: покупки и продажи
    public Currency(String code, double rate, double sellRate) {
        this.code = code;
        this.rate = rate;
        this.sellRate = sellRate;
    }

  /*  private static final Map<String, Currency> currencies = new HashMap<>();

    // Метод для получения валюты по коду
    public static Currency getCurrencyByCode(String currencyCode) {
        return currencies.get(currencyCode);
    }

    // Метод для проверки наличия валюты по коду
    public static boolean isCurrencyAvailable(String currencyCode) {
        return currencies.containsKey(currencyCode);
    }*/

    public String getCode() {
        return code;
    }

    public double getRate() {
        return rate;
    }

    public double getSellRate() {
        return sellRate;
    }




}
