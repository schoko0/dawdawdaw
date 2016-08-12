package Übungen.gdpPraktikum07;

import Übungen.gdpPraktikum07.SLLInt;

import static Übungen.gdpPraktikum07.SLLIntOperation.*;


public class Anwendungsklasse {
    public static void main(String[] args) {
        SLLInt test = new SLLInt(1,new SLLInt(2, new SLLInt(4)));
        SLLInt test2 = new SLLInt(4);
        SLLInt test3 = new SLLInt(5);
        test3 = null;
        SLLInt test4 = new SLLInt(1,new SLLInt(4, new SLLInt(3)));

/**
 * .....................A)
 */
//        System.out.println("getString: "+getString(test));
//        System.out.println("getString: "+getString(test2));
//        System.out.println("getString: \n"+getString(test3));
/**
 * ....................B)
 */
//        System.out.println("getLength: " + getLength(test));
//        System.out.println("getLength: \n" + getLength(test3));
/**
 *....................C)
 */
//        System.out.println("isSorted: " + isSorted(test));
//        System.out.println("isSorted: " + isSorted(test2));
//        System.out.println("isSorted: " + isSorted(test4));
//        System.out.println("isSorted: " + isSorted(test3) + "\n");
/**
 *....................D)
 */
//        System.out.println("insert: " + getString(insert(4,test)));
//        System.out.println("insert: " + insert(3,test));
//        System.out.println("insert: " + insert(4,test3) + "\n");
/**
 * ...................E)
 */
//        System.out.println("copyAndInsert: " + getString(copyAndInsert(4,test)));
        System.out.println("copyAndInsert: " + getString(copyAndInsert(3,test)));
        System.out.println("copyAndInsert: " + getString(copyAndInsert(4,test3)) + "\n");




    }
}
