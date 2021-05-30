package vendingmachine;

import java.util.Arrays;
import java.util.List;

public class CoinSet {

    private static final Coin _500 = new Coin(500);
    private static final Coin _100 = new Coin(100);
    private static final Coin _50 = new Coin(50);
    private static final Coin _10 = new Coin(10);

    private static final List<Coin> COIN_SET = Arrays.asList(_500, _100, _50, _10);

    public static Coin get(final int value){
        final Coin coin1 = new Coin(value);
        return COIN_SET.stream()
                .filter(coin -> coin.equals(coin1))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                ;

    }
}

