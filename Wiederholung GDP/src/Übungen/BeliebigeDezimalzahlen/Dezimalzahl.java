package Übungen.BeliebigeDezimalzahlen;


/**
 * Eine positive ganze Dezimalzahl mit (fast)
 * beliebig vielen Dezimalstellen.
 *
 * <p>
 *   <a href="http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/interfaces.html#dezimalzahl">ZurÃ¼ck zum Aufgabentext</a>
 * </p>
 *
 * @author pape
 *
 */
public interface Dezimalzahl {

    /**
     * Gibt den Wert dieser Dezimalzahl als double-Wert zurÃ¼ck.
     * Bei groÃŸen Dezimalzahlen kann dabei Genauigkeit verloren gehen.
     * Die GrÃ¶ÃŸenordnung bleibt erhalten.
     */
    double getDouble();

    /**
     * Addiert diese Dezimalzahl zur <code>zahl</code> und
     * gibt die Summe als neue Dezimalzahl zurÃ¼ck.
     */
    Dezimalzahl addieren(Dezimalzahl zahl);

    /**
     * Multipliziert diese Dezimalzahl zur <code>zahl</code> und
     * gibt das Produkt als neue Dezimalzahl zurÃ¼ck.
     */
    Dezimalzahl multiplizieren(Dezimalzahl zahl);

    /**
     * Gibt die Anzahl Ziffern zurÃ¼ck.
     */
    int getAnzahlZiffern();

    /**
     * Gibt die Ziffer an Stelle i zurÃ¼ck, wobei
     * i = 0, 1, ... getAnzahlZiffern() - 1 ist.
     */
    byte getZiffer(int i);
}