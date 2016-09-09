package Übungen.VendingMachineOLDVERSION;

import java.util.Scanner;       //allows user input


public class VendingMachine {
    public static void main(String[] args) {

        /**
         *
         * Outprint of collection and also taking order
         *
         */
        Scanner in = new Scanner(System.in);
//        final int centsPerEuro = 100;
//        final int centsPerTwoEuros = 200;

        while(true) {
            System.out.println(
                    "BITTE DIE ENTSPRECHENDE ZAHL EINGEBEN:\n\n" +
                            "1 = CANDY____________0,50 DOLLAR\n" +
                            "2 = SNACK____________0,90 DOLLAR\n" +
                            "3 = NUTS_____________1,25 DOLLAR\n" +
                            "4 = COCA COLA________1,10 DOLLAR\n" +
                            "5 = PEPSI____________1,50 DOLLAR\n" +
                            "6 = SODA_____________1,15 DOLLAR\n\n" +
                            "FOLGENDE MÜNZEN SIND ERLAUBT: \n" +
                            "1 EURO, 2 EURO, 50 CENTS, 20 CENTS, 10 CENTS , 5 CENTS\n");

            System.out.println("Eingabe: ");
            int inputOrder = in.nextInt();
            System.out.printf("SIE HABEN \"%s\" GEWÄHLT\n", Collection.getCollection(inputOrder));
            int moneyWhichNeedsToBePaid = 0;

            switch (inputOrder) {
                case 1:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getCandyValue() / 100, Collection.getCandyValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getCandyValue();
                    break;

                case 2:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getSnackValue() / 100, Collection.getSnackValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getSnackValue();
                    break;

                case 3:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getNutsValue() / 100, Collection.getNutsValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getNutsValue();
                    break;

                case 4:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getCokeValue() / 100, Collection.getCokeValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getCokeValue();
                    break;

                case 5:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getPepsiValue() / 100, Collection.getPepsiValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getPepsiValue();
                    break;

                case 6:
                    System.out.printf("BITTE ZAHLEN SIE %d,%d EURO\n", Collection.getSodaValue() / 100, Collection.getSodaValue() % 100);
                    moneyWhichNeedsToBePaid = Collection.getSodaValue();
                    break;

            }

            /**
             *
             *Checks the coins for payment, shows the rest and returns the change
             *
             */

            int inputMoney;
            int amountOfInputMoney = 0;

            while (amountOfInputMoney < moneyWhichNeedsToBePaid) {

                inputMoney = in.nextInt();



                if (CheckInputMoney.checkInputMoney(inputMoney)) {
                    if(inputMoney == 1 || inputMoney == 2){
                        inputMoney *= 100;
                    }
                    amountOfInputMoney += inputMoney;
                }
                Change.rest(moneyWhichNeedsToBePaid,amountOfInputMoney);

            }
            Change.change(Math.abs(moneyWhichNeedsToBePaid - amountOfInputMoney));
        System.out.println("\nVIELEN DANK DASS SIE SICH FÜR DIESE MASCHINE ENTSCHIEDEN HABEN\n");
        try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
//            System.out.println("\nRÜCKGELD" + Arrays.toString(Change.change(Math.abs(moneyWhichNeedsToBePaid - amountOfInputMoney))) + "\n\n______________________________________\n\n");
        }
    }
}
