package KomplexeZahlen.WeitereAufgabe;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class KomplexeZahlAnwendung implements KomplexeZahl2 {

    public double imag;
    public double real;

    public KomplexeZahlAnwendung(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public double getRealteil(){
        return real;
    }

    @Override
    public double getImaginaerteil(){
        return imag;
    }

    @Override
    public KomplexeZahl2 addieren(KomplexeZahl2 zahl){
        return new KomplexeZahlAnwendung(zahl.getRealteil() + real, zahl.getImaginaerteil() + imag);

    }

    @Override
    public KomplexeZahl2 multiplizieren (KomplexeZahl2 zahl){
        return new KomplexeZahlAnwendung((zahl.getRealteil() * real - zahl.getImaginaerteil() * imag),
                (zahl.getRealteil() * imag + zahl.getImaginaerteil() * real));

    }
}
