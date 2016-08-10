package Übungen.VendingMachineWithTests;



public class Operations {

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
        if(costs > 200 || paid > 400){return -3;}       //returns if both values are too high
        if(costs < 0 || paid < 0){return -1;}           //returns if negative values
        if(costs == paid){return 0;}                    //returns if exactly paid
        if(costs > paid){return -2;}                    //returns if not enough paid
        return paid - costs;                            //returns the change
    }
}
