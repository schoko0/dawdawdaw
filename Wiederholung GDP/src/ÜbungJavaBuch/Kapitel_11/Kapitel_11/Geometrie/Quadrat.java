package ÜbungJavaBuch.Kapitel_11.Kapitel_11.Geometrie;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class Quadrat implements Geometrie{

    private double laenge;


    public Quadrat(double laenge){
        setLaenge(laenge);
    }

    public void setLaenge(double laenge){
        if (laenge <= 0)
            throw new IllegalArgumentException("Wert muss größer 0 sein!");
        this.laenge = laenge;
    }

    public double getLaenge(){
        return laenge;
    }

    @Override
    public double berechneUmfang() {
        return 4 * laenge;
    }

    @Override
    public double berechneFlaeche() {
        return Math.pow(laenge, 2);
    }
}
