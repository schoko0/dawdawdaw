package Übungen.VendingMachineOLDVERSION;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Change {

//    final private int acceptedCoins [] = {200, 100, 50, 20, 10, 5};
    final private static int acceptedCoins [] = {200, 100, 50, 20, 10, 5};


//    public static int [] change (int balance){
//        int rest = balance;
//        int output[] = new int[5];
//        int j = 0;
//
//        for(int i = 0; i < acceptedCoins.length; i++){
//            while(rest >= acceptedCoins[i]){
//                    output [j] = acceptedCoins[i];
//                    rest -= acceptedCoins[i];
//                    j++;
//                }
//            }
//        return output;
//    }

    public static void change (int balance){
        int rest = balance;
        System.out.printf("\nWECHSELGELD: %d,%d EURO\n", balance/100,balance%100);

        for (int i = 0; i < acceptedCoins.length; i++){
            while(rest >= acceptedCoins[i]){
                System.out.println(acceptedCoins[i]);
                rest -= acceptedCoins[i];
            }
        }

        System.out.println("\n\n______________________________________\n\n");
    }

    public static void rest (int chosenItemCost, int paidMoney){
        if(chosenItemCost-paidMoney > 0){
            System.out.println("RESTBETRAG: " + (chosenItemCost - paidMoney) + " CENTS");
        }
    }


}
