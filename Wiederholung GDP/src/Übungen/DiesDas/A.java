package Übungen.DiesDas;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.Point;

/**
 * Created by sniendorf on 29.07.2016.
 */
public class A extends Object {
    public static void main(String[] args) {
//
//        List<Point> polygon = new ArrayList<>();
//        polygon.add(new Point(1, 1));
//        polygon.add(new Point(1, 2));
//        polygon.add(new Point(2, 1));
//        polygon.add(new Point(2, 2));
//        polygon.add(new Point(2, 1));
//
//        polygon.forEach(m -> System.out.format("(%d , %d)\n", m.x, m.y));
//
//
//        Random rnd = new Random();
//        Set<Integer> lotto = new HashSet<>();
//
//        do {
//            lotto.add(rnd.nextInt(49));
//        }while(lotto.size() < 6);
//
//        System.out.println( Arrays.toString(lotto.toArray()));
//
//
//        Map<String, String > dict = new HashMap<>();
//        dict.put("one", "eins");
//        dict.put("two", "zwei");
//        dict.put("three", "drei");
//        dict.put("four", "vier");
//        dict.put("five", "fünf");
//        dict.put("Nur der", "BVB");
//
//        System.out.println(dict.get("three"));
//        System.out.println(dict.get("Nur der"));
//
//        String [] ar = {"Hello", "was", "geht?"};
//        Arrays.asList(ar).forEach(s -> System.out.println(s));
//
//        List<Integer> data = Arrays.asList(7,2,5,4);
//        Optional<Integer> minimum = data.stream().reduce(Math::min);
//        System.out.println("\n\n\n\n"+minimum);
//        minimum = data.stream().reduce((i1,i2) -> Math.max(i1, i2));
//        System.out.println("\n\n\n\n"+minimum);
//
//
//        Integer a = new Integer(55555);
//        Object c = new String("läuft");
//        System.out.println(a.getClass());
//        System.out.println(a.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println(a.equals(c));
//        System.out.println(a.toString() + " annodazumal");
//        System.out.println(Objects.toString(a, "ist wohl null gewesen."));
//
//        a = null;
//        System.out.println(Objects.toString(a, "ist wohl null gewesen."));
//        a = 15081989;
//        System.out.println(a);
//        String tmp = a.toString();
//        System.out.format("%s", tmp);
//        tmp = a.toUnsignedString(5);
//        System.out.println("\n"+tmp+"..................\n");
//        a = 12;
//        tmp = a.toUnsignedString(7,4);
//        System.out.println(tmp);
//        tmp = Integer.toHexString(a);
//        System.out.println(tmp);


        List<String> streamTest = Arrays.asList("a2", "a2", "k3", "k1", "k2", "c2", "b2", "b2");
        streamTest
                .stream()
                .filter(s -> s.startsWith("k"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        textDateiErstellen();
        reader();

    }




    public static void textDateiErstellen() {
        Writer fw = null;

        try {
            fw = new FileWriter("textdatei.txt");
            fw.write("Zwei Jäger treffen sich...");
            fw.append(System.getProperty("line.separator"));
            fw.write("...und dann gingen sie.");
            fw.append(System.getProperty("line.separator"));
            fw.write("...und dann gingen sie.");


        } catch (IOException e) {
            System.err.println("Konnte Datei nicht erstellen");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public static void reader(){
        Reader reader = null;
        try
        {
            reader = new FileReader( "D:\\Intellijprojects\\Wiederholung GDP\\textdatei.txt" );

            for ( int c; ( c = reader.read() ) != -1; )
            System.out.print( (char) c );
        }
        catch ( IOException e ) {
            System.err.println( "Fehler beim Lesen der Datei!" );
        }
        finally {
            try { reader.close(); } catch ( Exception e ) { }
        }
    }


}