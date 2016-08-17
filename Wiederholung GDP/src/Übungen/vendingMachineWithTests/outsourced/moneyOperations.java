package Übungen.vendingMachineWithTests.outsourced;

/**
 * Created by sniendorf on 17.08.2016.
 */
public class moneyOperations {
    public boolean validateAcceptedMoney(int money){
        int [] acceptedMoney = {1, 2, 5, 10, 20, 50};

        for(int i = 0; i < acceptedMoney.length; i++){
            if(acceptedMoney[i] == money){
                return true;
            }
        }
        return false;
    }


    public int change(int costs, int paid){
        if(costs > 200 || paid > 400){throw new IllegalArgumentException("WARNUNG: PREIS ODER BEZAHLTES ZU HOCH!");}       //returns if both values are too high

        if(costs < 0 || paid < 0){throw new IllegalArgumentException("WARNUNG: PREIS ODER BEZAHLTES NEGATIV!");}           //returns if negative values

        if(costs == paid){return 0;}                    //returns if exactly paid

        if(costs > paid){System.out.println("NOCH ZU ZAHLEN: " + (costs - paid));}                                 //returns if not enough paid

        return paid - costs;                            //returns the change
    }

/*    public int returnMessage(int value){
        switch (value){
            case 0:
                return 0;
            case -1:
                throw new IllegalArgumentException("WARNUNG: PREIS ODER BEZAHLTES NEGATIV!");
            case -2:
                System.out.println("NOCH ZU ZAHLEN: " + (rest));
            case -3:
                throw new IllegalArgumentException("WARNUNG: PREIS ODER BEZAHLTES ZU HOCH!");
            default:
                return value;
        }
    }*/

}
