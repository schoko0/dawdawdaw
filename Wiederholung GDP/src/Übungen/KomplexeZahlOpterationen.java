package Übungen;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by sniendorf on 25.07.2016.
 */
public class KomplexeZahlOpterationen {

    public static void print (KomplexeZahl a){

//        if(a.im < 0){
//            System.out.println(a.re + " - " + "j" + Math.abs(a.im));
//        } else {
//            System.out.println(a.re + " + " + "j" + Math.abs(a.im));
//        }
        System.out.println(a.im < 0 ? a.re + " - " + "j" + Math.abs(a.im) : a.re + " + " + "j" + Math.abs(a.im));
    }

    public static KomplexeZahl add(KomplexeZahl a, KomplexeZahl b){
        return new KomplexeZahl((a.re + b.re), (a.im + b.im));
    }

    public static KomplexeZahl sub(KomplexeZahl a, KomplexeZahl b){
        return new KomplexeZahl((a.re - b.re), (a.im - b.im));
    }



}
