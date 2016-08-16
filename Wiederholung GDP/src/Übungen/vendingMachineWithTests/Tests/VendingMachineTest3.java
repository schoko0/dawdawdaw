package Übungen.vendingMachineWithTests.Tests;
import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import Übungen.vendingMachineWithTests.Collection.ProductRangeAndValues;
import Übungen.vendingMachineWithTests.Operations;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineTest3 {
    @Rule
    public final ExpectedException exception = ExpectedException.none();


    Operations ops = new Operations();
    Map<ProductRangeAndValues, Integer> testCase= new HashMap<>();


    @Test
    public void checkTheResetMethodValid(){

        testCase.put(ProductRangeAndValues.PEPSI, 5);               // Changing Pepsi value
        ops.resetStock(testCase, ProductRangeAndValues.PEPSI);      // reset value to 20
        int check = testCase.get(ProductRangeAndValues.PEPSI);      // saving the reset in var.

        assertEquals(ProductRangeAndValues.PEPSI.stock, check);
    }

    @Test
    public void resetStockTestWithEmptyMap(){
        exception.expect(IllegalArgumentException.class);
        ops.resetStock(null,ProductRangeAndValues.NUTS);
    }

    @Test
    public void resetStockTestWithEmptyProductRange(){
        exception.expect(IllegalArgumentException.class);
        ops.resetStock(testCase, null);
    }

    @Test
    public void valueDecreaseWithStockZero(){
        testCase.put(ProductRangeAndValues.PEPSI, 0);
        ops.valueDecrease(testCase, ProductRangeAndValues.PEPSI);
        int check = testCase.get(ProductRangeAndValues.PEPSI);

        assertEquals(0,check);

    }


}
