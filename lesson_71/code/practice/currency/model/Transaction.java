package practice.currency.model;

public class Transaction {
    private Currency fromCurrency;
    private Currency toCurrency;
    private double amount;
    private double result;

    public Transaction(Currency fromCurrency, Currency toCurrency, double amount, Object result) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.result = (double) result;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
