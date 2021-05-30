package vendingmachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void 동전을_생성한다(){
        Coin coin = new Coin(100);
        assertThat(coin).isNotNull();
    }

    @Test
    void 동전은_500원_100원_50원_10원이_있다(){
        Coin _500krw = new Coin(500);
        assertThat(_500krw).isEqualTo(new Coin(500));

        Coin _100krw = new Coin(100);
        assertThat(_100krw).isEqualTo(new Coin(100));

        Coin _50krw = new Coin(50);
        assertThat(_50krw).isEqualTo(new Coin(50));

        Coin _10krw = new Coin(10);
        assertThat(_10krw).isEqualTo(new Coin(10));
    }

}