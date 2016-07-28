package Praktikum_9;

import java.awt.*;

/**
 * Created by sniendorf on 26.07.2016.
 */
public class Merengue extends Kreis {

    private static final int min = 1;
    private static final int max = 1;

    public Merengue(double xAxis, double yAxis, double radius, Color color){

        super(xAxis, yAxis, radius, color);
    }

    @Override
    public void bewegen(){

        double richtung = 5.0;

        if(Math.random() >= 0.5){
            richtung = -richtung;
        }

        if(Math.random() >= 0.5){
            a.setX(a.getX() + richtung);
        } else {
            a.setY(a.getY() + richtung);
        }

//        getPosition().setX(
//                (getPosition().getX()+min+Math.random()*(max-min))
//                        * ((Math.random()>0.5)?1.0:-1.0)
//        );
//
//        getPosition().setY(
//                (getPosition().getY()+min+Math.random()*(max-min))
//                        * ((Math.random()>0.5)?1.0:-1.0)
//        );
    }



}
