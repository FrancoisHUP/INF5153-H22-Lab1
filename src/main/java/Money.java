import java.util.Objects;

public class Money {

    private int amount;
    private String currency;


    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money m2){
        return new Money(m2.amount+this.amount,this.currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
