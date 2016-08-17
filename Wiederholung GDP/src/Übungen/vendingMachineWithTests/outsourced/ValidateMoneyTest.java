package Übungen.vendingMachineWithTests.outsourced;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidateMoneyTest {

    private int money;
    private boolean expected;



    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, true }, {2, true}, {5, true}, {10, true}, {20, true}, {50, true},
                { 25, false }, {-1, false}, {0, false}, {Integer.MAX_VALUE, false}, {Integer.MIN_VALUE, false},
        });
    }

    public ValidateMoneyTest(int money, boolean expected){
        this.expected = expected;
        this.money = money;

    }


    moneyOperations operations = new moneyOperations();

    @Test
    public void validateAcceptedMoneyTest(){
        assertEquals(expected, operations.validateAcceptedMoney(money));

    }


}
