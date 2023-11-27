package patterns.behavioral.strategy.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvс;

    CreditCard(String number, String date, String cvс) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvс = cvс;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
