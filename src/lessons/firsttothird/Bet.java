package lessons.firsttothird;

import java.util.Objects;

public class Bet {
    double bet;
    int value;
    double risk;

    public Double getBet() {
        return bet;
    }

    public void setBet(Double bet) {
        this.bet = bet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet1 = (Bet) o;
        return Objects.equals(bet, bet1.bet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bet);
    }

    @Override
    public String toString() {
        return "lessons.firsttothird.Bet{" +
                "bet=" + bet +
                '}';
    }
}
