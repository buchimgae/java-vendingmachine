package vendingmachine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VendingMachineTest {

    @Test
    public void 자판기_생성(){
        VendingMachine vendingMachine = new VendingMachine();
        Assertions.assertThat(vendingMachine).isNotNull();
    }

//    @Test
//    void 자판기에_500원을_넣으면_500원이_들어있음을_알_수_있다(){
//        VendingMachine vendingMachine = new VendingMachine();
//        vendingMachine.put(500);
//        assertThat(vendingMachine.getChanges()).isEqualTo(500);
//    }
//
//    @Test
//    void 자판기에_1000원을_넣으면_1000원이_들어있음을_알_수_있다(){
//        VendingMachine vendingMachine = new VendingMachine();
//        vendingMachine.put(1000);
//        assertThat(vendingMachine.getChanges()).isEqualTo(1000);
//    }

    @ParameterizedTest(name = "자판기에_{0}원을_넣으면_{0}원이_들어있음을_알_수_있다")
    @ValueSource(ints = {500, 1000})
    void 자판기에_n원을_넣으면_n원이_들어있음을_알_수_있다(int changes){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.put(changes);
        assertThat(vendingMachine.getChanges()).isEqualTo(changes);
    }


    @Test
    @Disabled
    public void _1000원이_들이있는_자판기에_500원을_넣으면_1500원이_들어있음을_알_수_있다(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.put(1000);
        vendingMachine.put(500);
        assertThat(vendingMachine.getChanges()).isEqualTo(1500);
    }

}