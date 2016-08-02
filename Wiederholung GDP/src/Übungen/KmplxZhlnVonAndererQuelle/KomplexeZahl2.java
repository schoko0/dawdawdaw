package Übungen.KmplxZhlnVonAndererQuelle;

/*
 * Abstrakter Datentyp, der eine komplexe Zahl und
 * die Operatoren + und * als Methoden definiert.
 * <p>
 * Eine komplexe Zahl ist durch einen Realteil a und
 * ImaginÃ¤rteil b gegeben. Komplexe Zahlen werden
 * meist in der Form <code>a + i*b</code> angegeben.
 * <code>i</code> ist eine imaginÃ¤re Zahl mit
 * <code>i<sup>2</sup> := -1</code>.
 * Das Symbol + verhÃ¤lt sich wie eine normale Addition
 * (es ist aber nur ein Trennsymbol, kein Operator).
 * </p>
 * <p>
 * Zwei komplexe Zahlen <code>a<sub>1</sub> + ib<sub>1</sub></code>
 * und <code>a<sub>2</sub> + ib<sub>2</sub></code> werden wie folgt
 * addiert und multipliziert:
 * <ul>
 *   <li><code> (a<sub>1</sub> + ib<sub>1</sub>) + (a<sub>2</sub> + ib<sub>2</sub>)
 *     := a<sub>1</sub> + a<sub>2</sub> + i(b<sub>1</sub> + b<sub>2</sub>)</code></li>
 *   <li><code> (a<sub>1</sub> + ib<sub>1</sub>) * (a<sub>2</sub> + ib<sub>2</sub>)
 *     := a<sub>1</sub>a<sub>2</sub> - b<sub>1</sub>b<sub>2</sub>
 *     + i (a<sub>1</sub>b<sub>2</sub> + b<sub>1</sub>a<sub>2</sub>)</code></li>
 * </ul>
 * </p>
 */
public interface KomplexeZahl2 {

    /**
     * Gibt den Realteil dieses Komplexen Zahl zurÃ¼ck.
     */
    public double getRealteil();

    /**
     * Gibt den ImaginÃ¤rteil dieser Komplexen Zahl zurÃ¼ck.
     */
    public double getImaginaerteil();

    /**
     * Addierte zwei komplexe Zahlen, indem Real- und
     * ImaginÃ¤rteil addiert werden.
     * Wirft eine NullPointerException, falls <code>zahl</code>
     * null ist.
     */
    public KomplexeZahl2 addieren(KomplexeZahl2 zahl);

    /**
     * Multipliziert zwei komplexe Zahlen <code>a1+i*b1</code>
     * und <code>a2+i*b2</code> und gibt das
     * Produkt <code>(a1*a2 - b1*b2) + i(a1*b2 + a2*b1)</code> zurÃ¼ck.
     * Wirft eine NullPointerException, falls <code>zahl</code>
     * null ist.
     */
    public KomplexeZahl2 multiplizieren(KomplexeZahl2 zahl);
}