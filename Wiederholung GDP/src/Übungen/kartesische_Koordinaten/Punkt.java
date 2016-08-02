package Übungen.kartesische_Koordinaten;


/**
 * Spezifiziert einen Punkt (x,y) im zwei-dimensionalen Raum.
 * @author pape
 *
 */
public interface Punkt {

    double getX () ;

    double getY () ;

    /**
     * Gibt den euklidischen Abstand zum
     * gegebenen punkt zurÃ¼ck .
     */
    double getAbstand (Punkt punkt ) ;

}

