package Praktikum_9;

import edu.unibw.etti.graphics.Position;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.Color;
import java.awt.Graphics;



/**
 * Created by sniendorf on 26.07.2016.
 */
public abstract class Kreis {


    public double radius;
    public Color color;
    public Position a;

    private Color cFill;

    private static final float[] schritte = {0.0f, 1.0f};
    private static final Color[] farben = {Color.white, null};

    public Kreis (double x, double y, double r, Color c){

        if(x - r <= 0){
            x = x + r;
        } else if(x + r >= Position.X_MAX){
            x = x - r;
        }

        if(y - r <= 0){
            y = y + r;
        } else if(y + r >= Position.Y_MAX){
            y = y - r;
        }
        this.a = new Position(x, y);
        this.radius = r;
        this.color = c;
        this.cFill = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public  Position getPosition(){
        return a;
    }

    protected void setColor(Color color){
        this.color = color;
    }

    public void anzeigen(Graphics graphics){
//        graphics.setColor(color);
//        graphics.fillOval((int)(a.getX() - radius), (int)(a.getY() - radius), (int)(2 * radius), (int)(2 * radius));

        if (graphics instanceof Graphics2D) {
            farben[1] = cFill;
            RadialGradientPaint rgp = new RadialGradientPaint(
                    (float) (a.getX() - radius / 2),
                    (float) (a.getY() - radius / 2),
                    (float) Math.max(1.0, radius * 1.5),
                    schritte,
                    farben,
                    MultipleGradientPaint.CycleMethod.NO_CYCLE);

            ((Graphics2D) graphics).setPaint(rgp);

        } else {
            graphics.setColor(cFill);
        }

        graphics.fillOval(
                (int) (a.getX() - radius),
                (int) (a.getY() - radius),
                (int) radius * 2,
                (int) radius * 2);

    }

    public void bewegen(){};

    public static boolean kollidieren(Kreis k1, Kreis k2){
        double distanz = Math.hypot((k1.a.getX() - k2.a.getX()), (k1.a.getY() - k2.a.getY()));
        double radien = k1.radius + k2.radius;
        return (distanz <= radien);
    }



    public static void mischeFarben(Kreis k1, Kreis k2){
//        if(Praktikum_9.Kreis.kollidieren(k1, k2)) {
//            float[] f1 = k1.color.getComponents(null);
//            float[] f2 = k2.color.getComponents(null);
//
//            float[] fm = new float[f1.length];
//
//            for (int c = 0; c < fm.length; c++) {
//                fm[c] = (f1[c] * 0.5f) + (f2[c] * 0.5f);
//            }
//
//            Color mixedColor = new Color(fm[0], fm[1], fm[2], fm[3]);
//            k1.setColor(mixedColor);
//            k2.setColor(mixedColor);
//        }

        float[] f1 = k1.cFill.getComponents(null);
        float[] f2 = k2.cFill.getComponents(null);

        float[] fm = new float[f1.length];

        for (int c = 0; c < fm.length; c++) {
            fm[c] = (f1[c] * 0.5f) + (f2[c] * 0.5f);
        }

        k1.setColor(new Color(fm[0], fm[1], fm[2], fm[3]));
        k2.setColor(new Color(fm[0], fm[1], fm[2], fm[3]));
    }

}
