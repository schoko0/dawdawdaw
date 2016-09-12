package Übungen.vendingMachineWithTests.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Übungen.vendingMachineWithTests.databases.Product;
import Übungen.vendingMachineWithTests.operations.ProductStore;

import java.util.Random;


public class ProductStoreTest {

    private ProductStore productStore;

    @Before
    public void setUp() throws Exception {
        productStore = new ProductStore();
    }

    @Test
    public void shouldReturnZeroWhenNoProduct() throws Exception {
        for (Product p : Product.values()) {
            Assert.assertEquals(0, productStore.decrease(p));
        }
    }

    @Test
    public void shouldCountRemainingProducts() {
        productStore.increase(Product.COCACOLA);
        productStore.increase(Product.COCACOLA);
        productStore.increase(Product.COCACOLA);
        Assert.assertEquals(2, productStore.decrease(Product.COCACOLA));
    }

    @Test
    public void shouldReturnName(){
        productStore.increase(Product.NUTS);
        Assert.assertEquals("NUTS", productStore.getName(Product.NUTS));
    }

    @Test
    public void shouldReturnPrice(){
        productStore.increase(Product.NUTS);
//        Assert.assertEquals(125, productStore.getPrice(Product.NUTS));
    }

    @Test
    public void shouldResetSingleProductToStartAmount(){
        int amount = new Random().nextInt(200);
        productStore.resetStockToFullAmount(Product.CANDY, amount);
        productStore.increase(Product.CANDY);
        Assert.assertEquals(amount, productStore.decrease(Product.CANDY));
    }



    @Test
    public void isAvailable(){
        productStore.increase(Product.CANDY);
        productStore.increase(Product.CANDY);
        Assert.assertEquals(true, productStore.isProductAvailable(productStore, Product.CANDY));
    }


}
