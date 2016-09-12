package Übungen.vendingMachineWithTests.tests;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import Übungen.vendingMachineWithTests.databases.Money;
import Übungen.vendingMachineWithTests.databases.Product;
import Übungen.vendingMachineWithTests.operations.CombinedOperations;
import Übungen.vendingMachineWithTests.operations.MoneyManager;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MoneyManagerTest {

    private MoneyManager moneyManager;
    private CombinedOperations combinedOperations;

    @Before
    public void setUp() throws Exception{
        moneyManager = new MoneyManager();
        combinedOperations = new CombinedOperations();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();


//    @Test
//    public void shouldReturnZeroWhenNoMoney() throws Exception {
//        for (Money p : Money.values()) {
//            assertEquals(0, moneyManager.decreaseAmountOfCoins(p));
//        }
//    }

//    @Test
//    public void shouldCountRemainingMoney(){
//        moneyManager.increaseAmountOfCoins(Money.ONE_EURO);
//        moneyManager.increaseAmountOfCoins(Money.FIFTY_CENTS);
//
//        assertEquals(1, moneyManager.decreaseAmountOfCoins(Money.FIFTY_CENTS));
//    }

//    @Test
//    public void shouldReturnValueOfPaidMoney(){
//        moneyManager.increaseAmountOfCoins(Money.FIFTY_CENTS);
//        moneyManager.increaseAmountOfCoins(Money.TEN_CENTS);
//        moneyManager.increaseAmountOfCoins(Money.TWO_EUROS);
//
//        assertEquals(260,moneyManager.getAmountOfPaidMoney());
//    }

    @Test
    public void shouldCheckIfInputIsAssignedCorrectly(){
        assertEquals(Money.FIFTY_CENTS, moneyManager.convertInputToMoneyEnum(50, true));
    }

    @Test
    public void shouldCheckIfInputIsAssignedWrongly(){
        assertEquals(null, moneyManager.convertInputToMoneyEnum(55, false));
    }

    @Test
    public void shouldReturnTrueWithValidMoneyInput(){
        for (Money p : Money.values()) {
            assertEquals(true, moneyManager.validateInputMoney(p.value));
        }
    }

    @Test
    public void shouldThrowAnExceptionWithInvalidMoneyInput(){
//        exception.expect(IllegalArgumentException.class);
        assertEquals(false, moneyManager.validateInputMoney(25));
    }

    @Test
    public void shouldReturnTheCorrectRest(){
        combinedOperations.saveInputMoney(50);
        combinedOperations.saveInputMoney(100);

//        assertEquals(100, moneyManager.calculatesRestToPay(Product.CANDY.price, combinedOperations.moneyManager));
    }

    @Test
    public void shouldReturnChangeWithValidCoins(){
        ArrayList<Integer> comparable = new ArrayList<>();
        comparable.add(200);
        comparable.add(200);
        comparable.add(50);

        assertEquals(comparable, moneyManager.returnChangeInCoins(450));
    }

    @Test
    public void shouldSaveInputToEnumInRightOrder(){
        assertEquals(1, combinedOperations.saveInputMoney(20));
    }

}
