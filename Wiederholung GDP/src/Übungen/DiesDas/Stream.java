package Übungen.DiesDas;

import java.util.*;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class Stream {

    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
        List<String> lst = Arrays.asList(lorem.split(" "));
//        System.out.println(lst);

        lst.stream()
                .filter( s -> s.length() > 6)
                .forEach(s -> System.out.println(s));

        long n = lst.stream()
                .filter( s -> s.length() > 6)
                .distinct()
                .count();
        System.out.println(n);
    
        // durchschnittliche Wortlänge

        OptionalDouble avg = lst.stream()
                .mapToInt(s -> s.length())
                .average();
        System.out.println(avg.getAsDouble());          // Ausgabe 4.92

        OptionalDouble avg2 = lst.stream()
                .mapToInt(s -> s.length())
                .average();
        W.w(avg2);                                      // Ausgabe OpstionalDouble[4.92]

        // Liste der Zahlen von 1 bis 10
        List<Integer> zahlen = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++){
            zahlen.add(i);
        }

        // Quadrate bilden und ausgeben
        zahlen.stream().map(i -> i*i).forEach(System.out::println);
    }

}
