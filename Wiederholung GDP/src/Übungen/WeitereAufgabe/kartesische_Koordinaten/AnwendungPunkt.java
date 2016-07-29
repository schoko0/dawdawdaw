package Übungen.WeitereAufgabe.kartesische_Koordinaten;

import Praktikum_9.Anwendung;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class AnwendungPunkt implements Punkt {

    private double x;
    private double y;

    public AnwendungPunkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX(){
        return x;
    }

    @Override
    public double getY(){
        return y;
    }

    @Override
    public double getAbstand(Punkt punkt){
        return Math.hypot((x - punkt.getX()), (y - punkt.getY()));
    }
}
