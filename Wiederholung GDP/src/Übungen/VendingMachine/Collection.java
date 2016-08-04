package Übungen.VendingMachine;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Collection {

    private String candy;
    private String snack;
    private String nuts;
    private String coke;
    private String pepsi;
    private String soda;

    public Collection(String collection) {
        switch (collection) {
            case "candy":
                this.candy = collection;
            case "snack":
                this.snack = collection;
            case "nuts":
                this.nuts = collection;
            case "coke":
                this.coke = collection;
            case "pepsi":
                this.pepsi = collection;
            case "soda":
                this.soda = collection;
        }
    }

}
