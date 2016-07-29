package Übungen.WeitereAufgabe.BeliebigeDezimalzahlen;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class Anwendung  {

    public static void main(String[] args) {
        long test = 9876;
        AnwendungDezimalzahl test2 = new AnwendungDezimalzahl(test);
        AnwendungDezimalzahl test3 = new AnwendungDezimalzahl(9876);

        //System.out.println(test2.addieren(test3));
        //System.out.println(new AnwendungDezimalzahl(5).addieren(new AnwendungDezimalzahl(5)));
        System.out.println(new AnwendungDezimalzahl(5).multiplizieren(new AnwendungDezimalzahl(5)));
    }
}
