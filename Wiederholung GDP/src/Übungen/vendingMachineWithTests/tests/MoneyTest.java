package Übungen.vendingMachineWithTests.tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import Übungen.vendingMachineWithTests.databases.Money;
import Übungen.vendingMachineWithTests.operations.MoneyOps;

public class MoneyTest {

    private MoneyOps moneyOps;

    @Before
    public void setUp() throws Exception{
        moneyOps = new MoneyOps();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldReturnZeroWhenNoMoney() throws Exception {
        for (Money p : Money.values()) {
            Assert.assertEquals(0, moneyOps.decreaseAmountOfCoins(p));
        }
    }

    @Test
    public void shouldCountRemainingMoney(){
        moneyOps.increaseAmountOfCoins(Money.ONE_EURO);
        moneyOps.increaseAmountOfCoins(Money.FIFTHY_CENTS);

        Assert.assertEquals(1, moneyOps.decreaseAmountOfCoins(Money.FIFTHY_CENTS));
    }

    @Test
    public void shouldReturnValueOfPaidMoney(){
        moneyOps.increaseAmountOfCoins(Money.FIFTHY_CENTS);
        moneyOps.increaseAmountOfCoins(Money.TEN_CENTS);
        moneyOps.increaseAmountOfCoins(Money.TWO_EUROS);

        Assert.assertEquals(260,moneyOps.getAmountOfPaidMoney());
    }

    @Test
    public void shouldCheckIfInputIsAssignedCorrectly(){
        Assert.assertEquals(Money.FIFTHY_CENTS, moneyOps.convertInputToMoneyEnum(50));
    }

    @Test
    public void shouldCheckIfInputIsAssignedWrongly(){
        exception.expect(IllegalArgumentException.class);
        Assert.assertEquals(Money.FIFTHY_CENTS, moneyOps.convertInputToMoneyEnum(55));
    }
}
