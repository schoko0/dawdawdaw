package Übungen.vendingMachineWithTests.operations;

import Übungen.vendingMachineWithTests.databases.Product;

public class CombinedOperations {
    public MoneyManager moneyManager = new MoneyManager();
    public ProductStore productStore = new ProductStore();


    public int saveInputMoney(int i) {
        return moneyManager.increaseAmountOfCoins(moneyManager.convertInputToMoneyEnum(i, moneyManager.validateInputMoney(i)));
    }

    public static void chosenProduct(int numberOfChosenProduct){
        switch (numberOfChosenProduct){
            case 1:
                System.out.println("SIE HABEN \"" + Product.CANDY.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.CANDY.price + " CENTS\n");
                break;

            case 2:
                System.out.println("SIE HABEN \"" + Product.SNACK.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.SNACK.price + " CENTS\n");
                break;

            case 3:
                System.out.println("SIE HABEN \"" + Product.NUTS.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.NUTS.price + " CENTS\n");
                break;

            case 4:
                System.out.println("SIE HABEN \"" + Product.COCACOLA.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.COCACOLA.price + " CENTS\n");
                break;

            case 5:
                System.out.println("SIE HABEN \"" + Product.PEPSI.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.PEPSI.price + " CENTS\n");
                break;

            case 6:
                System.out.println("SIE HABEN \"" + Product.SODA.name + "\" GEWÄHLT\n" +
                        "BITTE ZAHLEN SIE " + Product.SODA.price + " CENTS\n");
                break;
        }
    }

    public static void main(String[] args) {
        chosenProduct(1);
        chosenProduct(2);
        chosenProduct(3);
        chosenProduct(4);
        chosenProduct(5);
        chosenProduct(6);
    }

}
