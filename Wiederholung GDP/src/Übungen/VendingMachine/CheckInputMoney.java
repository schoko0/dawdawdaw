package Übungen.VendingMachine;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class CheckInputMoney {

    static final private int[] allowedCoins = { 100, 200, 5, 10, 20, 50};


    public static boolean checkInputMoney(int checkAmount) {
        int checkIfWrongCoin = 0;

        for (int i = 0; i < allowedCoins.length; i++) {

            if (checkAmount == allowedCoins[i]) {
                checkIfWrongCoin++;
                return true;

            }
        }
        if(checkIfWrongCoin == 0)
        throw new IllegalArgumentException("FALSCHE MÜNZE EINGEWORFEN");

        return false;
    }

}
