package Übungen.vendingMachineWithTests.operations;


import Übungen.vendingMachineWithTests.databases.Product;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMachine {

    public static void main(String[] args) {
        ProductStore productStore = new ProductStore();
        CombinedOperations combinedOperations = new CombinedOperations();

        /**
         * Sets the Stock of the vending machine to full amount
         */
        productStore.allProductsToFullStock();


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
            String inputProduct = "k";

            while (productAvailability == false) {
                try {
                    inputProduct = scannerInput.next();
                } catch (NoSuchElementException ex) {
                    System.out.println("Pffff. Tststs.");
                    inputProduct = "";
                }
                if(combinedOperations.isNotAString(inputProduct)) {
                    int inputProductIsNotAString = Integer.parseInt(inputProduct);
                    if(combinedOperations.isBetween1And6(inputProductIsNotAString)) {
                        productAvailability = productStore.isProductAvailable(productStore, combinedOperations.convertInputIntoProduct(Integer.parseInt(inputProduct)));
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
                int inputMoneyInInt = 0;
                if(combinedOperations.isNotAString(inputMoney)) {
                    if(Integer.parseInt(inputMoney) == 2){
                        inputMoneyInInt = 200;
                    }else if(Integer.parseInt(inputMoney) == 1){
                        inputMoneyInInt = 100;
                    }
                    combinedOperations.saveInputMoney(inputMoneyInInt);
                    rest = combinedOperations.showRestToPay(Integer.parseInt(inputProduct), combinedOperations.moneyManager);
                }
            }

            /**
             * Returns the change
             */
            combinedOperations.returnChangeInCoins(rest);
            productStore.decrease(combinedOperations.convertInputIntoProduct(Integer.parseInt(inputProduct)));
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
