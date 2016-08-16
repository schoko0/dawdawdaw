package Übungen.vendingMachineWithTests;


import Übungen.vendingMachineWithTests.Collection.ProductRangeAndValues;

import java.util.HashMap;
import java.util.Map;

public class Operations {

    public boolean validateAcceptedMoney(int money){
        int [] acceptedMoney = {1, 2, 5, 10, 20, 50};

        for(int i = 0; i < acceptedMoney.length; i++){
            if(acceptedMoney[i] == money){
                return true;
            }
        }
        return false;
    }

    public int change(int costs, int paid){
        if(costs > 200 || paid > 400){return -3;}       //returns if both values are too high
        if(costs < 0 || paid < 0){return -1;}           //returns if negative values
        if(costs == paid){return 0;}                    //returns if exactly paid
        if(costs > paid){return -2;}                    //returns if not enough paid
        return paid - costs;                            //returns the change
    }

    public void resetStock(Map<ProductRangeAndValues, Integer> collectionToBeReset, ProductRangeAndValues stockFromCollection) {
        if(collectionToBeReset == null || stockFromCollection == null){
            throw new IllegalArgumentException("WARNUNG: LEERE MAP ODER LEERE AUSWAHL!");

        }else {
            collectionToBeReset.put(stockFromCollection, stockFromCollection.stock);
        }
    }

    public void valueIncrease(Map<ProductRangeAndValues, Integer> blubb, ProductRangeAndValues collection) {
        blubb.put(collection, blubb.get(collection) + 1);
    }

    public void valueDecrease(Map<ProductRangeAndValues, Integer> blubb, ProductRangeAndValues collection) {
        int compare = blubb.get(ProductRangeAndValues.PEPSI);
        if(compare > 0) {
            blubb.put(collection, blubb.get(collection) - 1);
        } else {
            System.out.println("WARNUNG: MAP LEER ODER STOCK BEI 0!");

        }
    }
}
