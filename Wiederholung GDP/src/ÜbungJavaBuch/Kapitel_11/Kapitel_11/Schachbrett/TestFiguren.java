package ÜbungJavaBuch.Kapitel_11.Kapitel_11.Schachbrett;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class TestFiguren {

    public static void main(String[] args) {


//        Springer sp = new Springer("b3");
//        System.out.println("Mögliche Ziele: " + sp.ermittleZiele());

        Schachfigur[] fig = new Schachfigur[4];
        fig[0] = new Turm("a1");
        fig[1] = new Springer("b1");
        fig[2] = new Laeufer("c1");
        fig[3] = new Dame("d1");

        for(Schachfigur sf : fig) {
            System.out.println("Klasse: " + sf.getClass().getName());
            System.out.println("Position: " +
                    Schachfigur.position(sf.spalte, sf.reihe).substring(0, 2));
            System.out.println("Mögliche Ziele: " + sf.ermittleZiele());
        }
    }

}
