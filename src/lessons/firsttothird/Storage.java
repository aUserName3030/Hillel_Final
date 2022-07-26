package lessons.firsttothird;

import java.util.ArrayList;

public class Storage {
    ArrayList<Double> bets = new ArrayList<>();

    public void add(Double bet) {
        bets.add(bet);
    }

    @Override
    public String toString() {
        return "lessons.firsttothird.Storage {" +
                "bets = " + bets +
                '}';
    }
}
