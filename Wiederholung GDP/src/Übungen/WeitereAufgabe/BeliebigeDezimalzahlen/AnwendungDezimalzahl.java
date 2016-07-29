package Übungen.WeitereAufgabe.BeliebigeDezimalzahlen;

import Praktikum_9.Anwendung;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class AnwendungDezimalzahl implements Dezimalzahl{

    private byte [] ziffern = new byte[1000];
    private int letzteZiffer = 0;

    public AnwendungDezimalzahl(long zahl){
        if(zahl > 0){
            while (zahl > 0){
                ziffern[letzteZiffer++] = (byte)(zahl % 10);
                zahl /= 10;
            }
        }
        letzteZiffer--;
    }
    //public  AnwendungDezimalzahl(){};

    @Override
    public int getAnzahlZiffern(){
        return this.letzteZiffer;
    }

    @Override
    public byte getZiffer(int i){
        return this.ziffern[i];
    }

    @Override
    public Dezimalzahl addieren(Dezimalzahl zahl){
        AnwendungDezimalzahl summe = new AnwendungDezimalzahl(0);
        summe.letzteZiffer = Math.max(this.letzteZiffer, zahl.getAnzahlZiffern());
        int uebertrag = 0; // int statt byte, um casts zu sparen
            for (int i = 0; i <= letzteZiffer; i++) {
                int summenZiffer = (ziffern[i] + zahl.getZiffer(i) + uebertrag);
                uebertrag = (summenZiffer / 10);
                summe.ziffern[i] = (byte) (summenZiffer % 10);
            }

        if (uebertrag == 1) {
            letzteZiffer++;
            summe.ziffern[summe.letzteZiffer] = 1;
        }
        return summe;
    }

    @Override
    public double getDouble(){
        double zahl = 0.0;

        for (int i = letzteZiffer; i >= 0; i--){
            zahl = 10 * zahl + ziffern[i];
        }
        return zahl;
    }

    @Override
    public Dezimalzahl multiplizieren(Dezimalzahl zahl){

        AnwendungDezimalzahl produkt = new AnwendungDezimalzahl(0);

        for (int i = letzteZiffer; i >= 0; i--) {
            for (int j = zahl.getAnzahlZiffern() - 1; j >= 0; j--) {
                byte produktZiffern = (byte) (ziffern[i] * zahl.getZiffer(j));
                produkt.ziffern[i + j] += produktZiffern % 10;
                if (i + j > 0) {
                    produkt.ziffern[i + j - 1] += (produktZiffern / 10 ) % 10;
                }
            }
        }

        produkt.letzteZiffer = letzteZiffer + zahl.getAnzahlZiffern() - 1;
        while (produkt.ziffern[produkt.letzteZiffer] == 0) {
            produkt.letzteZiffer--;
        }

        return produkt;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i <= letzteZiffer; i++) {
            stringBuffer.append(ziffern[i]);
        }

        return stringBuffer.reverse().toString();
    }
}
