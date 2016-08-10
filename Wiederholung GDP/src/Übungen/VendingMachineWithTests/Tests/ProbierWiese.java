package Übungen.VendingMachineWithTests.Tests;


import Übungen.VendingMachineWithTests.Collection.Candy;

import java.util.HashMap;
import java.util.Map;

public class ProbierWiese {

    public static void main(String[] args) {
//        HashMap map = new HashMap();
//
//        Candy candy1 = new Candy(50);
//
//        map.put(candy1.getStock(), candy1);
//
//        map.get(candy1.getStock());
        ProbierWiese wiese = new ProbierWiese();
        Candy candy = new Candy();
        HashMap<Candy, Integer> blubb = new HashMap<>();
        blubb.put(candy, 50);


        System.out.println(blubb.get(candy));
        wiese.valueIncreaseTest(blubb, candy);
        System.out.println(blubb.get(candy));
        wiese.valueDecreaseTest(blubb, candy);
        wiese.valueDecreaseTest(blubb, candy);
        System.out.println(blubb.get(candy));

    }

    public void valueIncreaseTest(HashMap<Candy, Integer> blubb, Candy candy){
        int value = blubb.get(candy);
        blubb.put(candy, value + 1);
    }

    public void valueDecreaseTest(HashMap<Candy, Integer> blubb, Candy candy){
        int value = blubb.get(candy);
        blubb.put(candy, value - 1);
    }

}
