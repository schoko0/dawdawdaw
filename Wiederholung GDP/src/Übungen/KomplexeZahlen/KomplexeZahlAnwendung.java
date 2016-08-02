package Übungen.KomplexeZahlen;

public class KomplexeZahlAnwendung {

    public void schreibeklxzhl(KomplexeZahl a){
        System.out.println();
    }
    public static void main(String[] args) {
        KomplexeZahlOpterationen.print(new KomplexeZahl(-1.1, -2.5));
        KomplexeZahlOpterationen.print(new KomplexeZahl(1.1, 2.5));

        KomplexeZahlOpterationen.print(KomplexeZahlOpterationen.add(new KomplexeZahl(1.1,2.1), new KomplexeZahl(3.1,2.9)));

    }

}

