package Praktikum_9;

import java.awt.*;

/**
 * Created by sniendorf on 26.07.2016.
 */
public class Planet extends Kreis{

    public double abstand;
    public double xAxis;
    public double yAxis;

    public double winkel = 0;
    public double winkelSchitte;



    public Planet(double x, double y, double r, Color c, double a, double s){
        super(x + r, y, r, c);

        this.abstand = a;
        this.xAxis = x;
        this.yAxis = y;

        this.winkelSchitte = s / a;
    }

    @Override
    public void bewegen(){

        winkel += winkelSchitte;

        getPosition().setX(xAxis + (abstand * Math.cos(winkel)));
        getPosition().setY(yAxis + (abstand * Math.sin(winkel)));

    }
}
