package ÜbungJavaBuch.Kapitel_11.Kapitel_11.Schachbrett;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class Turm extends Schachfigur {
    public Turm(String startpos) {
        super(startpos);
    }

    // liefert eine Zeichenkette mit allen Positionen
    @Override
    public String ermittleZiele() {
        StringBuilder zuege= new StringBuilder();
        for(int i=-7; i<=7; i++) {
            if(i==0)     // die Ausgangsposition
                continue;  // Überspringen
            zuege.append(position(spalte+i, reihe));  // mögliche Positionen in der aktuellen Zeile
            zuege.append(position(spalte, reihe+i));  // mögliche Positionen in der aktuellen Spalte
        }
        return zuege.substring(0, zuege.length()-1);
    }
}
