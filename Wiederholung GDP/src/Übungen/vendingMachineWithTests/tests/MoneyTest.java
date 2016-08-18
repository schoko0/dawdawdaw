package Übungen.vendingMachineWithTests.tests;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import Übungen.vendingMachineWithTests.databases.Money;
import Übungen.vendingMachineWithTests.databases.Product;
import Übungen.vendingMachineWithTests.operations.MoneyManager;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    private MoneyManager moneyManager;

    @Before
    public void setUp() throws Exception{
        moneyManager = new MoneyManager();
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
        exception.expect(IllegalArgumentException.class);
        assertEquals(Money.FIFTY_CENTS, moneyManager.convertInputToMoneyEnum(55, false));
    }

//    @Test
//    public void shouldReturnTrueWithValidMoneyInput(){
//        for (Money p : Money.values()) {
//            assertEquals(true, moneyManager.validateInputMoney(p.value));
//        }
//    }

//    @Test
//    public void shouldThrowAnExceptionWithInvalidMoneyInput(){
////        exception.expect(IllegalArgumentException.class);
//        assertEquals(false, moneyManager.validateInputMoney(25));
//    }

//    @Test
//    public void shouldReturnTheCorrectRest(){
//        moneyManager.saveInput(50);
//        moneyManager.saveInput(100);
//
//        assertEquals(100, moneyManager.calculatesRestToPay(Product.CANDY.price, moneyManager));
//    }

    @Test
    public void shouldReturnChangeWithValidCoins(){
        ArrayList<Integer> comparable = new ArrayList<>();
        comparable.add(200);
        comparable.add(200);
        comparable.add(50);

        assertEquals(comparable, moneyManager.returnChangeInCoins(450));
    }

//    @Test
//    public void shouldSaveInputToEnumInRightOrder(){
////        moneyManager.increaseAmountOfCoins(Money.ONE_EURO);
////        moneyManager.increaseAmountOfCoins(Money.ONE_EURO);
//        assertEquals(1, moneyManager.saveInput(20));
//    }










    /*public static void main(String[] args) {
        MoneyManager test = new MoneyManager();
        int coin1 = 50;
        int coin2 = 100;
        int coin3 = 20;

        test.increaseAmountOfCoins(test.convertInputToMoneyEnum(coin1, test.validateInputMoney(coin1)));
        test.increaseAmountOfCoins(test.convertInputToMoneyEnum(coin2, test.validateInputMoney(coin2)));
        test.increaseAmountOfCoins(test.convertInputToMoneyEnum(coin3, test.validateInputMoney(coin3)));
        System.out.println(test.getAmountOfPaidMoney());
    }*/
}
