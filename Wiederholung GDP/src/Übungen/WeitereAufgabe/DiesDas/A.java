package Übungen.WeitereAufgabe.DiesDas;
import java.util.*;
import java.awt.Point;
/**
 * Created by sniendorf on 29.07.2016.
 */
public class A {
    public static void main(String[] args) {

        List<Point> polygon = new ArrayList<>();
        polygon.add(new Point(1, 1));
        polygon.add(new Point(1, 2));
        polygon.add(new Point(2, 1));
        polygon.add(new Point(2, 2));
        polygon.add(new Point(2, 1));

        polygon.forEach(m -> System.out.format("(%d , %d)\n", m.x, m.y));


        Random rnd = new Random();
        Set<Integer> lotto = new HashSet<>();

        do {
            lotto.add(rnd.nextInt(49));
        }while(lotto.size() < 6);

        System.out.println( Arrays.toString(lotto.toArray()));


        Map<String, String > dict = new HashMap<>();
        dict.put("one", "eins");
        dict.put("two", "zwei");
        dict.put("three", "drei");
        dict.put("four", "vier");
        dict.put("five", "fünf");
        dict.put("Nur der", "BVB");

        System.out.println(dict.get("three"));
        System.out.println(dict.get("Nur der"));
    }



}


