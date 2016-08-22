package Übungen.vendingMachineWithTests.tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Übungen.vendingMachineWithTests.operations.CombinedOperations;

public class CombinedOperationTest {

    CombinedOperations combinedOperations;

    @Before
    public void setUp() throws Exception {
        combinedOperations = new CombinedOperations();
    }

    @Test
    public void shouldReturnAmountOfSavedObjects(){
        Assert.assertEquals(1, combinedOperations.saveInputMoney(50));
    }

    @Test
    public void shouldReturnTheRestToPay(){
        combinedOperations.saveInputMoney(100);
        Assert.assertEquals(10, combinedOperations.showRestToPay(4, combinedOperations.moneyManager));
    }
}
