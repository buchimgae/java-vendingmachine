package vendingmachine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ChangesTest {

    @ParameterizedTest
    @CsvSource({"10,_10_COIN","50,_50_COIN","100,_100_COIN","500,_500_COIN"})
    void n원이_남아_있다면_n원짜리_동전_1개를_돌려준다(int amount, CoinSet coin){
        Changes changes = new Changes(amount);
        List<CoinSet> coinSet = changes.coin();
        assertThat(coinSet).containsExactlyInAnyOrder(coin);
    }



}