package ÜbungJavaBuch.Kapitel_11;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class Laeufer extends Schachfigur {

    // Konstruktur der Ã¼bergeordneten Klasse aufrufen
    public Laeufer(String startpos) {
        super(startpos);
    }

    // liefert eine Zeichenkette mit allen Positionen
    @Override
    public String ermittleZiele() {
        StringBuilder zuege= new StringBuilder();
        for(int i=-7; i<=7; i++) {
            if(i==0)   // Überspringen, das ist die Ausgangsposition
                continue;
            zuege.append(position(spalte+i, reihe+i));  // die Felder auf den
            zuege.append(position(spalte+i, reihe-i));  // Diagonalen ermitteln
        }
        return zuege.substring(0, zuege.length()-1);
    }
}
