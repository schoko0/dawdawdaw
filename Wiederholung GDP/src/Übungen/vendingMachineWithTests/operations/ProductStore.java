package Übungen.vendingMachineWithTests.operations;

import Übungen.vendingMachineWithTests.databases.Product;

import java.util.ArrayList;
import java.util.List;

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

    public int getPrice(int product){
        switch (product){
            case 1 :
                return Product.CANDY.price;
            case 2 :
                return Product.SNACK.price;
            case 3 :
                return Product.NUTS.price;
            case 4 :
                return Product.COCACOLA.price;
            case 5 :
                return Product.PEPSI.price;
            case 6 :
                return Product.SODA.price;
        }
        return 0;
    }

    public void resetStockToFullAmount(Product product, int amount) {
        for (int i = 1; i <= amount; i++) {
            increase(product);
        }
    }

    public boolean isProductAvailable(ProductStore product, Product chosenProduct){
        for(Product s : product.products){
            if(s == chosenProduct){
                return true;
            }
        }
        System.out.println("\nBITTE WÄHLEN SIE EIN ANDERES PRODUKT!");
        return false;
    }

}
