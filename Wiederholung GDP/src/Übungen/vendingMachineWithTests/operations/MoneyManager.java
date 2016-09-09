package Übungen.vendingMachineWithTests.operations;


import Übungen.vendingMachineWithTests.databases.Money;

import java.util.ArrayList;
import java.util.List;

public class MoneyManager {

    private final List<Money> amountOfMoney;


    public MoneyManager() {
        this.amountOfMoney = new ArrayList<>();
    }

    public int increaseAmountOfCoins(Money coinToAdd) {
        if(coinToAdd == null){return 0;
        } else {
        amountOfMoney.add(coinToAdd);
        return amountOfMoney.size();}
    }

    private int decreaseAmountOfCoins(Money coinToRemove) {
        amountOfMoney.remove(coinToRemove);
        return amountOfMoney.size();
    }

    public int getAmountOfPaidMoney() {
        int counter = 0;
        Money tmp;
        for (int i = 0; i < amountOfMoney.size(); i++) {
            tmp = amountOfMoney.get(i);
            counter += tmp.value;
        }
        return counter;
    }

    public Money convertInputToMoneyEnum(int input, boolean status) {
        if (status) {
            switch (input) {
                case 10:
                    return Money.TEN_CENTS;
                case 20:
                    return Money.TWENTY_CENTS;
                case 50:
                    return Money.FIFTY_CENTS;
                case 100:
                    return Money.ONE_EURO;
                case 200:
                    return Money.TWO_EUROS;
            }
        }
//        throw new IllegalArgumentException("HIER IST IRGENDETWAS SCHIEF GELAUFEN!");
        return null;
    }

    public boolean validateInputMoney(int input) {
        for(Money p : Money.values()) {
            if (p.value == input) {
                return true;
            }
        }
        System.out.println("WARNUNG: FALSCHE MÜNZE EINGEWORFEN!\nVERSUCHEN SIE ES ERNEUT!");
        return false;
    }

    public int calculatesRestToPay(int price, MoneyManager moneyManager) {
        int rest = price - moneyManager.getAmountOfPaidMoney();
        return rest;
    }

//    public int calculatesRestToPay(int price, int paid){
//        return price - paid;
//    }

    public ArrayList<Integer> returnChangeInCoins(int change) {
        int absoluteChange = Math.abs(change);
        ArrayList<Integer> changeInCoins = new ArrayList<>();
        while (absoluteChange != 0) {
            for (Money money : Money.values()) {
                if (money.value <= absoluteChange) {
                    changeInCoins.add(money.value);
                    absoluteChange -= money.value;
                    break;
                }

            }
        }
        return changeInCoins;
    }

    public void flush(){
        amountOfMoney.clear();
    }


}
