package Übungen.VendingMachine;

import java.util.Scanner;       //allows user input

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int centsPerEuro = 100;
        final int centsPerTwoEuros = 200;
        System.out.println("BITTE DIE ENTSPRECHENDE ZAHL EINGEBEN:\n\n" +
                    "FOLGENDE MÜNZEN SIND ERLAUBT: \n" +
                    "1 EURO, 2 EURO, 50 CENTS, 20 CENTS, 10 CENTS , 5 CENTS\n\n" +
                    "1= CANDY____________0,50 DOLLAR\n" +
                    "2= SNACK____________0,90 DOLLAR\n" +
                    "3= NUTS_____________1,25 DOLLAR\n" +
                    "4= COCA COLA________1,10 DOLLAR\n" +
                    "5= PEPSI____________1,50 DOLLAR\n" +
                    "6= SODA_____________1,15 DOLLAR\n");

        int inputOrder = in.nextInt();
        System.out.printf("SIE HABEN DIE %d GEWÄHLT\n", inputOrder);
        int moneyWhichNeedsToBePaid = 0;

        switch(inputOrder){
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

        int inputMoney;
        int amountOfInputMoney = 0;

        while (amountOfInputMoney < moneyWhichNeedsToBePaid) {

            inputMoney = in.nextInt();

            if(CheckInputMoney.checkInputMoney(inputMoney)) {
                amountOfInputMoney += inputMoney;
            }
            System.out.println(amountOfInputMoney);

        }

    }
}
