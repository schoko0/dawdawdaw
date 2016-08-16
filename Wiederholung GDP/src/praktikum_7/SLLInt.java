package praktikum_7;

/**
 * Created by sniendorf on 12.08.2016.
 */
public class SLLInt {
    public int element; // aktuelles Element
    public SLLInt next; // Referenz auf den Rest der Liste
    public SLLInt(int e, SLLInt n) {
        element = e;
        next = n;
    }
    public SLLInt(int e) {
        element = e;
        next = null;
    }
}
