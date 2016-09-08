package Übungen.DiesDas.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sniendorf on 08.09.2016.
 */
public class GenUtils {
    public void addAndDisplay(ArrayList<Integer> a, Integer b){
        a.add(b);
        System.out.println(a);
    }

    public static <T> void addAndDisplay2(Collection<T> liste, T einfügen){
        liste.add(einfügen);
        for( T t : liste){
            System.out.println(t);
        }
    }
}
