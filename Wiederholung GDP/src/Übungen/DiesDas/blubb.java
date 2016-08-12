package Übungen.DiesDas;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class blubb {


    public static void sucheNachGrößterZahl(int [] a) {

        int größteZahl = 0;
        for (int i = 0; i < a.length; i++) {
            if (größteZahl <= a[i]) {
                größteZahl = a[i];
            }

        }
//        W.w(größteZahl);
    }
}

