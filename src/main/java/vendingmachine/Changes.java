package vendingmachine;

import java.util.Arrays;
import java.util.List;

public class Changes {
    private int amount;

    public Changes(int amount) {
        this.amount = amount;
    }

    List<CoinSet> coin(){
        return Arrays.asList(CoinSet.valueOf(amount));

    }
}
