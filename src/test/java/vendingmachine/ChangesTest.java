package vendingmachine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChangesTest {


    @Test
    void _10원이_남아_있다면_10원짜리_동전_1개를_돌려준다(){
        Changes changes = new Changes(10);
        List<CoinSet> coinSet = changes.coin();

        assertThat(coinSet.size()).isEqualTo(1);
        assertThat(coinSet.get(0)).isEqualTo(CoinSet._10_COIN);
    }
}