package ÜbungJavaBuch.Kapitel_11.Kapitel_8;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class Schaltjahr {

    public static void main(String[] args) {
        int jahr = 2016;  // ist dieses Jahr ein Schaltjahr?
        boolean schaltjahr;

        if(jahr%400 == 0) {
            schaltjahr=true;
        }
        else if(jahr%100 == 0) {
            schaltjahr=false;
        }
        else if(jahr%4 == 0) {
            schaltjahr=true;
        }
        else {
            schaltjahr=false;
        }

        if(schaltjahr==true)
            System.out.println(jahr + " ist ein Schaltjahr.");
        else
            System.out.println(jahr + " ist kein Schaltjahr.");

    }


}
