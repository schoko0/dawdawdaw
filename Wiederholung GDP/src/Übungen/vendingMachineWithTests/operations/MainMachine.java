package Übungen.vendingMachineWithTests.operations;


import Übungen.vendingMachineWithTests.databases.Product;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMachine {

    public static void main(String[] args) {
        CombinedOperations combinedOperations = new CombinedOperations();

        /**
         * Sets the Stock of the vending machine to full amount
         */
        combinedOperations.allProductsToFullStock();


        while (true) {

            /**
             * Shows the Product range and allowed money
             */
            combinedOperations.greeting();

            /**
             * Reads the input of the chosen product from the keyboard and returns the price
             */
            Scanner scannerInput = new Scanner(System.in);
            boolean productAvailability = false;
            String inputProduct = "";
            while (!productAvailability) {
                inputProduct = scannerInput.next();
                if(combinedOperations.isNotAString(inputProduct)) {
                    int inputProductIsNotAString = Integer.parseInt(inputProduct);
                    if(combinedOperations.isBetween1And6(inputProductIsNotAString)) {
                        productAvailability = combinedOperations.productStore.isProductAvailable(combinedOperations.productStore, combinedOperations.convertInputIntoProduct(Integer.parseInt(inputProduct)));
                    }
                }
            }
            combinedOperations.chosenProduct(combinedOperations.convertInputIntoProduct(Integer.parseInt(inputProduct)), productAvailability);

            /**
             * Reads the money input from the keyboard and shows the rest
             */
            int rest = 1;
            String inputMoney;
            while (rest > 0) {
                inputMoney = scannerInput.next();
                if(combinedOperations.isNotAString(inputMoney)) {
                    combinedOperations.returnEuroOrCents(inputMoney);
                    int inputMoneyInInt = combinedOperations.checkIfEuro(inputMoney);
                    combinedOperations.saveInputMoney(inputMoneyInInt);
                    rest = combinedOperations.showRestToPay(Integer.parseInt(inputProduct), combinedOperations.moneyManager);
                }
            }

            /**
             * Returns the change
             */
            combinedOperations.returnChangeInCoins(rest);
            combinedOperations.decrease(combinedOperations.convertInputIntoProduct(Integer.parseInt(inputProduct)));
            combinedOperations.goodBye();

            /**
             * Waiting a short time, before it starts again
             */
            try{
                Thread.sleep(4000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}
