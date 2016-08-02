package Übungen.WeitereAufgabe.DiesDas;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sniendorf on 02.08.2016.
 */
public class AnwendungTest {
    public static void main(String[] args) {
        Set<Rectangle> jo = new HashSet<Rectangle>();
        Rectangle rectangle = new Rectangle(2, 5);

        jo.add(rectangle);
        jo.add(rectangle);
        jo.add(rectangle);
        jo.add(new Rectangle(2, 1));
        jo.add(new Rectangle(2, 2));
        jo.add(new Rectangle(2, 3));

        for(Rectangle r : jo){
            System.out.println(r.w+ " " + r.h);
        }
    }
}
