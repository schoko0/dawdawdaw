package Übungen.DiesDas.generics;

import java.util.*;

/**
 * Created by sniendorf on 08.09.2016.
 */
public class TestGenUtils {
    public static void main(String[] args) {
        GenUtils genUtils = new GenUtils();

        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);

        genUtils.addAndDisplay((ArrayList<Integer>) liste, 999);
        liste.remove(liste.indexOf(999));

        List<String> liste2 = new Stack<>();
        liste2.add("Sag");
        liste2.add("bye");
        liste2.add("bye");

        GenUtils.addAndDisplay2(liste, 587);
//        GenUtils.addAndDisplay2(liste2, "Motherfucker");
//        GenUtils.addAndDisplay2(liste2, "!");
    }
}
