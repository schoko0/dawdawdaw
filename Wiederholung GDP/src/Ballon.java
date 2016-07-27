import edu.unibw.etti.graphics.Position;

import java.awt.*;

/**
 * Created by sniendorf on 26.07.2016.
 */
public class Ballon extends Kreis {

    public double dehnung;

    public Ballon(double x, double y, Color c, double d){
        super(x, y, 1.0, c);

        this.dehnung = d;
    }

    @Override
    public void bewegen(){

        if(a.getX() + radius >= Position.X_MAX || a.getX() - radius <= 0) {
            dehnung = -dehnung;
        }

        if(a.getY() + radius >= Position.Y_MAX || a.getY() - radius <= 0){
            dehnung = -dehnung;
        }

        if(radius < 1.0){
            dehnung = -dehnung;
        }
        radius += dehnung;
    }
}
