package Übungen.vendingMachineWithTests.outsourced;


import Übungen.vendingMachineWithTests.databases.Product;

import java.util.Map;

public class productOperations {



    public void resetStock(Map<Product, Integer> collectionToBeReset, Product stockFromCollection) {
        if(collectionToBeReset == null || stockFromCollection == null){
            throw new NullPointerException("WARNUNG: LEERE MAP ODER LEERE AUSWAHL!");

        }else {
            collectionToBeReset.put(stockFromCollection, stockFromCollection.stock);
        }
    }

    public void valueIncrease(Map<Product, Integer> blubb, Product collection) {
        if(blubb == null){
            throw new NullPointerException("WARNUNG: LEERE MAP ÜBERGEBEN!");
        }

        int compare = blubb.get(Product.PEPSI);
        if(compare < 0) {
            System.out.println("WARNUNG: STOCK IM NEGATIVBEREICH, ÜBERPRÜFEN SIE DIE ANZAHL DER WAREN!");
        } else {
            blubb.put(collection, blubb.get(collection) + 1);
        }
    }

    public void valueDecrease(Map<Product, Integer> blubb, Product collection) {
        if(blubb == null){
            throw new NullPointerException("WARNUNG: LEERE MAP ÜBERGEBEN!");
        }

        int compare = blubb.get(Product.PEPSI);
        if(compare > 0) {
            blubb.put(collection, blubb.get(collection) - 1);
        } else {
            System.out.println("WARNUNG: STOCK BEI 0 ODER IM NEGATIVBEREICH!");
        }
    }

    public String getProductName(Product selectedProduct){
        return selectedProduct.name;
    }

    public int getProductPrice(Product selectedProduct){
        return selectedProduct.price;
    }
}
