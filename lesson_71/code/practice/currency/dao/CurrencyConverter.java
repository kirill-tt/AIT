package practice.currency.dao;




import practice.currency.model.Currency;

import java.util.List;
import java.util.Map;

public interface CurrencyConverter {

    List<Currency> readCurrenciesFromFile(String filePath);

    void buyCurrency(String currencyCode, double amount);

    void sellCurrency(String currencyCode, double amount);

    void saveTransactionsToFile(List<Currency> currencies, String filePath);
}
