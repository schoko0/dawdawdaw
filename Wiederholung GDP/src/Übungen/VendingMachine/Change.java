package Übungen.VendingMachine;

import org.mockito.internal.matchers.Null;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Change {

//    final private int acceptedCoins [] = {200, 100, 50, 20, 10, 5};

    public static int [] change (int balance){
        final int acceptedCoins [] = {200, 100, 50, 20, 10, 5};
        int rest = balance;
        int output[] = new int[5];
        int j = 0;

        for(int i = 0; i < acceptedCoins.length; i++){

            while(rest >= acceptedCoins[i]){

                    output [j] = acceptedCoins[i];
                    rest -= acceptedCoins[i];
                    j++;
                }

            }




        return output;
    }


}
