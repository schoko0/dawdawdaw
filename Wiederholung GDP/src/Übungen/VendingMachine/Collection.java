package Übungen.VendingMachine;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Collection {

    private static String candy;
    private static String snack;
    private static String nuts;
    private static String coke;
    private static String pepsi;
    private static String soda;

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

    public static String getCandy() {
        return candy = "candy";
    }

    public String getCoke() {
        return coke = "coke";
    }

    public String getNuts() {
        return nuts = "nuts";
    }

    public String getPepsi() {
        return pepsi = "pepsi";
    }

    public String getSnack() {
        return snack = "snack";
    }

    public String getSoda() {
        return soda = "soda";
    }
    public static int getCandyValue(){
        return 50;
    }
    public static int getCokeValue(){
        return 110;
    }
    public static int getNutsValue(){
        return 125;
    }
    public static int getPepsiValue(){
        return 150;
    }
    public static int getSnackValue(){
        return 90;
    }
    public static int getSodaValue(){
        return 115;
    }
}
