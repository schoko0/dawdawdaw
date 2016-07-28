package ÜbungJavaBuch.Kapitel_11.Kapitel_9;

/**
 * Created by sniendorf on 28.07.2016.
 */
public class Summe {
    public static void main(String[] args) {

        System.out.println(summe(1,0));
    }

    public static int summe(int n1, int n2){
        if(n1 <= 0 || n2 <= 0){

            throw  new IllegalArgumentException("Eine der beiden Werte ist kleiner oder gleich 0!");
        }
        return n1 + n2;
    }
}
