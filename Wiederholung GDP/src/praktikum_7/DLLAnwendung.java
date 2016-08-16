package praktikum_7;

/**
 * Created by sniendorf on 16.08.2016.
 */
public class DLLAnwendung {
    public static void main(String[] args) {
        DLLInt a1 = new DLLInt(null,1,null);
        DLLInt a2 = new DLLInt(null,2,null);
        DLLInt a3 = new DLLInt(null,3,null);

        a1.next = a2;
        a2.prev = a1;

        a2.next = a3;
        a3.prev = a2;

        SeqByDLL seq1 = new SeqByDLL(a1,a3);


/**
 * ............Aufgabe A)
  */
//        System.out.println(getString(seq1, true));
//        System.out.println(getString(seq1, false));
/**
 * ...........Aufgabe B)
  */
//        System.out.println("insert: " + getString(insert(4,seq1), true));
//        System.out.println("insert: " + getString(insert(4,seq1), false));
//        System.out.println("insert: " + getString(insert(2,seq1), true));
/**
 * ............Aufgabe C)
  */








    }
}
