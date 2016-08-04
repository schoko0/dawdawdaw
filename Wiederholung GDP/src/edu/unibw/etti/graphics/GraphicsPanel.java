package edu.unibw.etti.graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

/**
 * Die Klasse <tt>GraphicsPanel</tt> bietet eine einfache M&ouml;glichkeit mit
 * Hilfe der Klasse <tt>Graphics</tt> einfache Grapfikobjekte zu malen und
 * anzuzeigen. Zum Beispiel kann die Klasse wir folgt in einem Programm
 * verwendet werden:<br><br>
 * <tt>
 * // Erzeugen des GraphicsPanel <br>
 * GraphicsPanel panel = new GraphicsPanel("Mein Fenster", 600, 400);<br><br>
 * // Erzeugen des Graphics und &Ouml;ffnen des Fensters <br>
 * Graphics g = panel.createGraphics(); <br><br>
 * // Setzen der Farbe, mit der gemalt werden soll. <br>
 * g.setColor(Color.red); <br><br>
 * // Malen eines nicht gef&uuml;llten Kreises <br>
 * g.drawOval(250, 150, 100, 100); <br><br>
 * // Malen ein gef&uuml;lltes Rechtecks <br>
 * g.fillRect(50, 50, 100, 20); <br><br>
 * // Neuzeichnen erzwingen <br>
 * panel.showGraphics(); <br>
 * </tt>
 *
 * @author Andrea Baumann
 */
public class GraphicsPanel {

    // Titel des Fensters
    private final String frameTitle;
    // Breite des Fensters
    private final int frameWidth;
    // Hoehe des Fensters
    private final int frameHeight;
    // Bufferstrategie 
    private BufferStrategy bufferStrategy = null;
    // Graphics 
    private Graphics graphics = null;
    // Variable, die speichert, ob das Fenster schon geoeffnet wurde
    private boolean init = false;

    /**
     * Konstruktor zur Erzeugung eines <tt>GraphicsPanel</tt>. Achtung: Beim
     * TwitterTest des Konstruktors wird noch kein Fenster ge&ouml;ffnet. Dazu muss
     * erst noch die Methode <tt>showGraphics</tt> oder <tt>createGraphics</tt>
     * aufgerufen werde!
     *
     * @param title Der Titel des Fensters.
     * @param width Die Breite des Fensters.
     * @param height Die H&ouml;he des Fensters.
     */
    public GraphicsPanel(String title, int width, int height) {
        super();
        frameTitle = title;
        frameWidth = width;
        frameHeight = height;
    }

    /**
     * Der TwitterTest dieser Methode erzwingt das Anzeigen der Objekte, die auf
     * <tt>Graphics</tt> gezeichnet wurden. Die gezeichneten Objekte werden
     * nicht gel&ouml;scht!
     */
    public void showGraphics() {
        initFrame();
        if (bufferStrategy.contentsLost()) {
            bufferStrategy.contentsRestored();
        }
        if (!bufferStrategy.contentsLost()) {
            bufferStrategy.show();
        }
    }

    /**
     * Erzeugt ein neues, leeres <tt>Graphics</tt> und &ouml;ffnet, falls
     * notwendig, das Fenster in dem das <tt>Graphics</tt> angezeigt wird.
     *
     * @return Gibt ein <tt>Graphics</tt> zur&uuml;ck, auf das die Grafikobjekte
     * gezeichnet werden k&ouml;nnen.
     */
    public Graphics createGraphics() {
        initFrame();
        if (graphics != null) {
            graphics.dispose();
        }
        graphics = bufferStrategy.getDrawGraphics();
        return graphics;
    }

    /**
     * Mit dieser Methode kann die aktuelle Verarbeitung unterbrochen werden.
     *
     * @param time Zeit in Millisekunden, die die aktuelle Verarbeitung stoppen
     * soll.
     */
    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
        }
    }

    /**
     * Mit dieser Klassenmethode kann eine zuf&auml;llige Farbe erzeugt werden.
     *
     * @return Gibt eine zuf&auml;llige Farbe zur&uuml;ck.
     */
    public static Color getRandomColor() {
        return new Color((float) Math.random(),
                (float) Math.random(),
                (float) Math.random());
    }

    // Zur Initialisierung des Frames, in dem die Grafik angezeigt wird.
    // Die Methode wird aufgerufen, wenn die Metode <tt>updateGraphics</tt>
    // oder <tt>createGraphics</tt> aufgerufen wird. Die Initialisierung 
    // wird nur einmal durchgefuehrt.
    private synchronized void initFrame() {
        if (!init) {
            Canvas canvas = new InnerCanvas();
            canvas.setPreferredSize(new Dimension(frameWidth, frameHeight));

            Frame frame = new Frame();
            if (frameTitle == null) {
                frame.setTitle("Graphic Frame");
            } else {
                frame.setTitle(frameTitle);
            }
            frame.addWindowListener(new InternWindowAdapter());

            frame.add(canvas);
            frame.pack();
            frame.setResizable(false);
            frame.setVisible(true);

            canvas.createBufferStrategy(2);
            bufferStrategy = canvas.getBufferStrategy();

            init = true;
        }
    }

    private static class InternWindowAdapter extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private class InnerCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            showGraphics();
        }
    }
}
