package Übungen.vendingMachineWithTests.operations;

import com.sun.org.apache.xpath.internal.SourceTree;
import Übungen.vendingMachineWithTests.databases.Product;

public class CombinedOperations {
    public MoneyManager moneyManager = new MoneyManager();
    public ProductStore productStore = new ProductStore();


    public int saveInputMoney(int i) {
        return moneyManager.increaseAmountOfCoins(moneyManager.convertInputToMoneyEnum(i, moneyManager.validateInputMoney(i)));
    }

    public boolean isNotAString(String a){
        String compare = "1234567890";
        int counter = 0;
        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < compare.length(); j++){
                if(a.charAt(i) == compare.charAt(j)) {
                    counter++;
                }
            }
        }
        if(counter < a.length()){
            System.out.println("BITTE KEINE BUCHSTABEN, SONDERZEICHEN ODER NEGATIVE ZAHLEN EINGEBEN!");
            return false;
        }
        return true;
    }

    public boolean isBetween1And6(int a){
        if((a < 7) && (a > 0)){
            return true;
        }else{
            System.out.println("BITTE EINE ZAHL ZWISCHEN 1 UND 6 EINGEBEN!");
        }

        return false;
    }

    public void greeting() {

        System.out.println(
                "BITTE DIE ENTSPRECHENDE ZAHL EINGEBEN:\n\n" +
                        "1 = CANDY____________0,50 DOLLAR\n" +
                        "2 = SNACK____________0,90 DOLLAR\n" +
                        "3 = NUTS_____________1,25 DOLLAR\n" +
                        "4 = COCA COLA________1,10 DOLLAR\n" +
                        "5 = PEPSI____________1,50 DOLLAR\n" +
                        "6 = SODA_____________1,15 DOLLAR\n\n" +
                        "FOLGENDE MÜNZEN SIND ERLAUBT: \n" +
                        "100 CENTS, 200 CENTS, 50 CENTS, 20 CENTS, 10 CENTS\n");
    }

    public void goodBye(){
        System.out.println(" \nVIELEN DANK FÜR IHREN EINKAUF!\n\n\n\n");
    }

    public Product convertInputIntoProduct(int input){
        switch(input) {
            case 1:
                return Product.CANDY;
            case 2:
                return Product.SNACK;
            case 3:
                return Product.NUTS;
            case 4:
                return Product.COCACOLA;
            case 5:
                return Product.PEPSI;
            case 6:
                return Product.SODA;
        }
        return Product.NUTS;
    }

    public void chosenProduct(Product product, boolean productAvailable) {
        if(productAvailable) {
            switch (product.name) {
                case "CANDY":
                    System.out.println("SIE HABEN \"" + Product.CANDY.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.CANDY.price + " CENTS\n");
                    break;

                case "SNACK":
                    System.out.println("SIE HABEN \"" + Product.SNACK.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.SNACK.price + " CENTS\n");
                    break;

                case "NUTS":
                    System.out.println("SIE HABEN \"" + Product.NUTS.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.NUTS.price + " CENTS\n");
                    break;

                case "COCA COLA":
                    System.out.println("SIE HABEN \"" + Product.COCACOLA.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.COCACOLA.price + " CENTS\n");
                    break;

                case "PEPSI":
                    System.out.println("SIE HABEN \"" + Product.PEPSI.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.PEPSI.price + " CENTS\n");
                    break;

                case "SODA":
                    System.out.println("SIE HABEN \"" + Product.SODA.name + "\" GEWÄHLT\n" +
                            "BITTE ZAHLEN SIE " + Product.SODA.price + " CENTS\n");
                    break;
            }
        }else{
            System.out.println("\nBITTE WÄHLEN SIE EIN ANDERES GETRÄNK!");
        }
    }

    public int showRestToPay (int productNumber, MoneyManager listWithPaidMoney){
        int tmp = moneyManager.calculatesRestToPay(productStore.getPrice(productNumber), listWithPaidMoney);
        if(tmp > 0){
            System.out.println("RESTBETRAG: " + tmp + " CENTS\n");
        }
        return tmp;
    }

    public void returnChangeInCoins(int change){

        if(change == 0){
            System.out.println("BITTE ENTNEHMEN SIE DAS PRODUKT!");
        } else {
            moneyManager.returnChangeInCoins(change);
            System.out.println("IHR RÜCKGELD: ");
            for(int a : moneyManager.returnChangeInCoins(change)){
                System.out.println(a + " CENTS");
            }
        }
        moneyManager.flush();
    }


}
