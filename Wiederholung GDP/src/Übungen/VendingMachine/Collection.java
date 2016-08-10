package Übungen.VendingMachine;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Collection {


    public enum collectionTest{
        CANDY,SNACK, NUTS, COKE, PEPSI, SODA
    }
    public static String getCollection (int choice){
        switch (choice){
            case 1: return getCandy();
            case 2: return getSnack();
            case 3: return getNuts();
            case 4: return getCoke();
            case 5: return getPepsi();
            case 6: return getSoda();
        }
        return "FALSCHE ZAHL EINGEGEBEN, BITTE WIEDERHOLEN SIE!";
    }

    public static String getCandy() { return  "CANDY"; }

    public static String getCoke() {
        return "COCA COLA";
    }

    public static String getNuts() {
        return  "NUTS";
    }

    public static String getPepsi() {
        return "PEPSI";
    }

    public static String getSnack() {
        return "SNACK";
    }

    public static String getSoda() {
        return "SODA";
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
