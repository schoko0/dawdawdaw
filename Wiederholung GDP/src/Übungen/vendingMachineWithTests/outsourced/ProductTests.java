package Übungen.vendingMachineWithTests.outsourced;
import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import Übungen.vendingMachineWithTests.databases.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductTests {
    @Rule
    public final ExpectedException exception = ExpectedException.none();


    productOperations ops = new productOperations();
    Map<Product, Integer> testCase= new HashMap<>();


    @Test
    public void checkTheResetMethodValid(){

        testCase.put(Product.PEPSI, 5);               // Changing Pepsi value
        ops.resetStock(testCase, Product.PEPSI);      // reset value to 20
        int check = testCase.get(Product.PEPSI);      // saving the reset in var.

        assertEquals(Product.PEPSI.stock, check);
    }

    @Test
    public void resetStockTestWithEmptyMap(){
        exception.expect(NullPointerException.class);
        ops.resetStock(null, Product.NUTS);
    }

    @Test
    public void resetStockTestWithEmptyProductRange(){
        exception.expect(NullPointerException.class);
        ops.resetStock(testCase, null);
    }

    @Test
    public void valueDecreaseWithStockZero(){
        testCase.put(Product.PEPSI, 0);
        ops.valueDecrease(testCase, Product.PEPSI);
        int check = testCase.get(Product.PEPSI);

        assertEquals(0, check);
    }

    @Test
    public void valueDecreaseWithEmptyMap(){

        exception.expect(NullPointerException.class);
        ops.valueDecrease(null, Product.PEPSI);
    }

    @Test
    public void valueDecreaseWithValidInput(){
        testCase.put(Product.PEPSI, 5);
        ops.valueDecrease(testCase, Product.PEPSI);
        int check = testCase.get(Product.PEPSI);
        assertEquals(4, check);
    }

    @Test
    public void valueIncreaseWithStockZero(){
        testCase.put(Product.PEPSI, -5);
        ops.valueIncrease(testCase, Product.PEPSI);
        int check = testCase.get(Product.PEPSI);

        assertEquals(-5, check);

    }

    @Test
    public void valueIncreaseWithEmptyMap(){
        exception.expect(NullPointerException.class);
        ops.valueIncrease(null, Product.PEPSI);
    }

    @Test
    public void valueIncreaseWithValidInput(){
        testCase.put(Product.PEPSI, 5);
        ops.valueIncrease(testCase, Product.PEPSI);
        int check = testCase.get(Product.PEPSI);
        assertEquals(6, check);
    }

    @Test
    public void getProductNameIsValid(){
        String check = ops.getProductName(Product.COCACOLA);
        assertEquals("COCA COLA", check);
    }

    @Test
    public void getProductPriceIsValid(){
        int check = ops.getProductPrice(Product.CANDY);
        assertEquals(50, check);
    }


}
