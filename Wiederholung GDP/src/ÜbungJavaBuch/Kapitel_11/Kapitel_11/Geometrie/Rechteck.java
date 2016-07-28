package ÜbungJavaBuch.Kapitel_11.Kapitel_11.Geometrie;

// Rechteck-Klasse
public class Rechteck implements Geometrie {
  // Klassenvariablen
  private double laenge, breite;
  
  // Konstruktor
  public Rechteck(double laenge, double breite) {
    setLaenge(laenge);
    setBreite(breite);

  }
  
  // Default-Konstruktor, erzeugt ein Rechteck mit 10x5
  public Rechteck() {
    this(10, 5);
  }

  // getter und setter für Lönge
  public double getLaenge() {
    return laenge;
  }
  public void setLaenge(double laenge) {
    if(laenge<=0)
      throw new IllegalArgumentException(
          "Die Länge muss größer 0 sein!");
    this.laenge = laenge;
  }

  // getter und setter für Breite
  public double getBreite() {
    return breite;
  }

  public void setBreite(double breite) {
    if(breite<=0)
      throw new IllegalArgumentException(
          "Die Breite muss größer 0 sein!");
    this.breite = breite;
  }

  // Methoden der Schnittstelle Geometrie
  @Override
  public double berechneUmfang() {
    return (laenge+breite)*2;
  }
  @Override
  public double berechneFlaeche() {
    return laenge*breite;
  }
}
