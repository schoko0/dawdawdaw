import edu.unibw.etti.graphics.GraphicsPanel;
import edu.unibw.etti.graphics.Position;

import java.awt.*;

/**
 * Created by sniendorf on 26.07.2016.
 */
public class Anwendung {
    public static void main(String[] args) {

        GraphicsPanel panel = new GraphicsPanel("Kreise", Position.X_MAX, Position.Y_MAX);
        Graphics graphics = panel.createGraphics();

        // Kreis malen_______________________________________________________________________________
    /*
        Kreis k = new Kreis(175.5, 210.5, 75.5, Color.red);
        k.anzeigen(graphics);
        panel.showGraphics();
    */
        // Snooker
    /*
        Snooker k = new Snooker(175.5, 210.5, 25.0, Color.magenta, 0.5, -0.3);
        while (true) {
            graphics.setColor(Color.white);
            graphics.fillRect(0, 0, Position.X_MAX, Position.Y_MAX);
            k.anzeigen(graphics);
            panel.showGraphics();
            k.bewegen();
        }
    */
        // Ballon_____________________________________________________________________________________
    /*
        Ballon k = new Ballon(150.0, 210.5, Color.cyan, 0.5);
        while (true) {
            graphics.setColor(Color.white);
            graphics.fillRect(0, 0, Position.X_MAX, Position.Y_MAX);
            k.anzeigen(graphics);
            panel.showGraphics();
            k.bewegen();
        }
    */
        // Mehrere Kreise_____________________________________________________________________________

        int varianten = 2;
        int anzahl = 5 * varianten;

        if(graphics instanceof Graphics2D){
            ((Graphics2D) graphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        Kreis[] kreise = new Kreis[anzahl];

        for (int i = 0; i < kreise.length; i++) {

            double x = Math.random() * Position.X_MAX;
            double y = Math.random() * Position.Y_MAX;

            switch (i % varianten) {
//                case 0:
//                    kreise[i] = new Snooker(x, y, 25.0, Color.red, 1.0, 1.0);
//                    break;
//                case 1:
//                    kreise[i] = new Ballon(x, y, Color.blue, 1.0);
//                    break;
//                case 2:
//                    kreise[i] = new Dominant(x, y, 20, SimpleGraphicPanel.getRandomColor());
//                    break;
                case 0:
                    kreise[i] = new Planet(x, y, 10, Color.red,(Math.random() * 100 + 25), 1);
                    break;
                case 1:
                    kreise[i] = new Merengue(x, y, 10, Color.black);
                    break;

            }
        }
//        while (true) {
//            graphics.setColor(Color.white);
//            graphics.fillRect(0, 0, Position.X_MAX + 100, Position.Y_MAX + 100);
//
//            for (Kreis k : kreise) {
//                k.anzeigen(graphics);
//                GraphicsPanel.sleep(1);
//            }
//            panel.showGraphics();
//            for(int i = 0; i < kreise.length; i++){
//                for(int j = 1; j < kreise.length -1; j++){
//                    Kreis.mischeFarben(kreise[i], kreise[j]);
//                }
//            }
//            for (Kreis k : kreise) {
//                k.bewegen();
//            }
//        }
        while (true) {
            graphics.setColor(Color.white);
            graphics.fillRect(0, 0, Position.X_MAX + 100, Position.Y_MAX + 100
            );

            for (int i = 0; i < kreise.length; i++) {
                for (int j = i + 1; j < kreise.length; j++) {
                    //System.out.println(kreise[i] + " " + kreise[j]);

                    if (Kreis.kollidieren(kreise[i], kreise[j])) {

                        Kreis.mischeFarben(kreise[i], kreise[j]);

                    }

                }
            }

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
