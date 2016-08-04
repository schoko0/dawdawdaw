package Übungen.VendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sniendorf on 04.08.2016.
 */
public class Test {
    public static void main(String[] args) {

        try {
            System.out.println("BITTE DIE ENTSPRECHENDE ZAHL EINGEBEN:\n" +
                    "1= CANDY____________0,50 DOLLAR\n" +
                    "2= SNACK____________0,90 DOLLAR\n" +
                    "3= NUTS_____________1,25 DOLLAR\n" +
                    "4= COCA COLA________1,10 DOLLAR\n" +
                    "5= PEPSI____________1,05 DOLLAR\n" +
                    "6= SODA_____________1,15 DOLLAR\n");
            int val = System.in.read();
            char c = (char) val;
            System.out.println(c);

        }
        catch (IOException ioe) {
            System.out.println("Hat nicht geklappt!");
        }


//        try {
//            InputStreamReader isr = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(isr);
//            String zeile = br.readLine();
//            System.out.println(zeile);
//        } catch (IOException e) {
//            System.out.println("Hat nicht geklappt!");
//        }


    }
}
