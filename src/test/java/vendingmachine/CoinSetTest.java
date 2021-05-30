package vendingmachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CoinSetTest {
    @Test
    void 동전을_생성한다(){
        Coin coin = CoinSet.get(100);
        assertThat(coin).isEqualTo(new Coin(100));
    }
}