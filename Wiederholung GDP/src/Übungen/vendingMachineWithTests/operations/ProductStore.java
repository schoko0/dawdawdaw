package Übungen.vendingMachineWithTests.operations;

import Übungen.vendingMachineWithTests.databases.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sniendorf on 17.08.2016.
 */
public class ProductStore {

    private final List<Product> products;

    public ProductStore() {
        this.products = new ArrayList<>();
    }

    public void increase(Product product) {
        products.add(product);
    }

    public int decrease(Product requestedProduct) {
        products.remove(requestedProduct);
        return products.size();
    }

    public String getName(Product name) {
        return name.name;
    }

    public int getPrice(Product price) {
        return price.price;
    }

    public void allProductsToFullStock(){
        for(Product product : Product.values()) {
            resetStockToFullAmount(product, product.stock);
        }
    }

    public void resetStockToFullAmount(Product product, int amount) {
        for (int i = 1; i <= amount; i++) {
            increase(product);
        }
    }

}
