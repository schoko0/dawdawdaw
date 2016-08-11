package Übungen.vendingMachineWithTests.Tests;


import Übungen.vendingMachineWithTests.Collection.Collection;

import java.util.HashMap;


public class ProbierWiese {

    public static void main(String[] args) {
//        HashMap map = new HashMap();
//
//        Collection candy1 = new Collection(50);
//
//        map.put(candy1.getStock(), candy1);
//
//        map.get(candy1.getStock());
        ProbierWiese wiese = new ProbierWiese();
        Collection collection = new Collection();
        HashMap<Collection, Integer> blubb = new HashMap<>();

        blubb.put(collection, collection.stockCandy);
        System.out.println(blubb.get(collection));
        wiese.valueIncreaseTest(blubb, collection);
        System.out.println(blubb.get(collection));
        wiese.valueDecreaseTest(blubb, collection);
        wiese.valueDecreaseTest(blubb, collection);
        System.out.println(blubb.get(collection));





    }

    public int quadrat(int a){
        return a * a;
    }

    public void valueIncreaseTest(HashMap<Collection, Integer> blubb, Collection collection){
        int value = blubb.get(collection);
        blubb.put(collection, value + 1);
    }

    public void valueDecreaseTest(HashMap<Collection, Integer> blubb, Collection collection){
        int value = blubb.get(collection);
        blubb.put(collection, value - 1);
    }

}
