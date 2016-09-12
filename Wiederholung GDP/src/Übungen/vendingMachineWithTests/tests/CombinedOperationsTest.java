package Übungen.vendingMachineWithTests.tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Übungen.vendingMachineWithTests.operations.CombinedOperations;

public class CombinedOperationsTest {

    CombinedOperations combinedOperations;

    @Before
    public void setUp() {
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
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    @Test
    public void checkIfEuroWithInputString2Euro(){
        Assert.assertEquals(200, combinedOperations.checkIfEuro("2"));
    }

    @Test
    public void checkIfEuroWithInputString1Euro(){
        Assert.assertEquals(100, combinedOperations.checkIfEuro("1"));
    }

    @Test
    public void checkIfEuroWithInputString20Cents(){
        Assert.assertEquals(30, combinedOperations.checkIfEuro("20"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfEuroShouldThrowException(){
        combinedOperations.checkIfEuro("abc");
    }



}
