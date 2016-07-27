import edu.unibw.etti.graphics.GraphicsPanel;
import edu.unibw.etti.graphics.Position;

import java.awt.*;

/**
 * Created by sniendorf on 27.07.2016.
 */
public class Anwendung2 {

    public static void main(String[] args) {

        int varianten = 1;
        int anzahl = 3 * varianten;

        GraphicsPanel panel = new GraphicsPanel("Kreise", Position.X_MAX, Position.Y_MAX);
        Graphics graphics = panel.createGraphics();

        if (graphics instanceof Graphics2D) {
            ((Graphics2D) graphics).setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
        }

        Kreis[] kreise = new Kreis[anzahl];

        for (int i = 0; i < kreise.length; i++) {


            switch (i % varianten) {
                case 0:
                    kreise[i] = new Merengue(150, 150, 10, Color.blue);
                    break;

            }

        }

        while (true) {
            graphics.setColor(Color.white);
            graphics.fillRect(0, 0, Position.X_MAX, Position.Y_MAX);


            for (Kreis k : kreise) {
                k.anzeigen(graphics);
            }

            panel.showGraphics();

            for (Kreis k : kreise) {
                k.bewegen();
            }

            panel.sleep(1);
        }

    }
}
