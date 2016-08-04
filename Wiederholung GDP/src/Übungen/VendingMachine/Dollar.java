package Übungen.VendingMachine;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Dollar {

    private int dollarInCents;

    public Dollar(int dollarCoins){
        this.dollarInCents = dollarCoins * 100;
    }

    public int getDollarinCents(){
        return dollarInCents;
    }

//    public int setDollarinCents(int dollarCoins) {
//        dollarInCents = dollarCoins * 100;
//    }
}
