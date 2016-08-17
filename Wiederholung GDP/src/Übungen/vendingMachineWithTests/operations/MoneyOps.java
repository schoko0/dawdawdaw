package Übungen.vendingMachineWithTests.operations;


import Übungen.vendingMachineWithTests.databases.Money;

import java.util.ArrayList;
import java.util.List;

public class MoneyOps {

    private final List<Money> amountOfMoney;
    private final int acceptedMoney[] = {10, 20, 50, 100, 200};

    public MoneyOps(){this.amountOfMoney= new ArrayList<>();}


    public int increaseAmountOfCoins(Money coinToAdd) {
        amountOfMoney.add(coinToAdd);
        return amountOfMoney.size();
    }

    public int decreaseAmountOfCoins(Money coinToRemove) {
        amountOfMoney.remove(coinToRemove);
        return  amountOfMoney.size();
    }

    public int getAmountOfPaidMoney() {
        int counter = 0;
        Money tmp;
        for (int i = 0; i < amountOfMoney.size();i++){
            tmp= amountOfMoney.get(i);
            counter += tmp.value;
        }
        return counter;
    }

    public Money convertInputToMoneyEnum(int i) {
        switch(i){
            case 10:
                return Money.TEN_CENTS;
            case 20:
                return Money.TWENTY_CENTS;
            case 50:
                return Money.FIFTHY_CENTS;
            case 100:
                return Money.ONE_EURO;
            case 200:
                return Money.TWO_EUROS;
            default:
                throw new IllegalArgumentException("HIER IST IRGENDETWAS SCHIEF GELAUFEN!");
        }
    }


}
