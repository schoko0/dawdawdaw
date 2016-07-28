package Praktikum_9;

import edu.unibw.etti.graphics.Position;

import java.awt.*;

/**
 * Created by sniendorf on 26.07.2016.
 */
public class Snooker extends Kreis {
    public double horizontal;
    public double vertikal;

    public Snooker(double x, double y, double r, Color c, double h, double v){
        super(x, y, r, c);
        this.horizontal = h;
        this.vertikal = v;
    }

    @Override
    public void bewegen(){

        if(a.getX() + radius >= Position.X_MAX || a.getX() - radius <= 0 ) {
            horizontal = -horizontal;
        }
        a.setX(a.getX() + horizontal);

        if(a.getY() + radius >= Position.Y_MAX || a.getY() - radius <= 0){
            vertikal = -vertikal;
        }
        a.setY(a.getY() + vertikal);

    }

}
