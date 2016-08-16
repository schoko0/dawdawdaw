package praktikum_7;


public class SLLAnwendung {
    public static void main(String[] args) {
        SLLInt test = new SLLInt(1,new SLLInt(2, new SLLInt(4)));
        SLLInt test2 = new SLLInt(4);
        SLLInt test3 = new SLLInt(5);
        test3 = null;
        SLLInt test4 = new SLLInt(1,new SLLInt(4, new SLLInt(3)));

/**
 * .....................A)
 */
        System.out.println("getString: "+ SLLIntOperation.getString(test));
        System.out.println("getString: "+ SLLIntOperation.getString(test2));
//        System.out.println("getString: \n"+getString(test3));
/**
 * ....................B)
 */
        System.out.println("getLength: " + SLLIntOperation.getLength(test));
//        System.out.println("getLength: \n" + getLength(test3));
/**
 *....................C)
 */
        System.out.println("isSorted: " + SLLIntOperation.isSorted(test));
        System.out.println("isSorted: " + SLLIntOperation.isSorted(test2));
        System.out.println("isSorted: " + SLLIntOperation.isSorted(test4));
//        System.out.println("isSorted: " + isSorted(test3) + "\n");
/**
 *....................D)
 */
        System.out.println("insert: " + SLLIntOperation.getString(SLLIntOperation.insert(4,test)));
        System.out.println("insert: " + SLLIntOperation.getString(SLLIntOperation.insert(3,test)));
        System.out.println("insert: " + SLLIntOperation.getString(SLLIntOperation.insert(4,test3)) + "\n");
/**
 * ...................E)
 */
        System.out.println("copyAndInsert: " + SLLIntOperation.getString(SLLIntOperation.copyAndInsert(4,test)));
        System.out.println("copyAndInsert: " + SLLIntOperation.getString(SLLIntOperation.copyAndInsert(3,test)));
        System.out.println("copyAndInsert: " + SLLIntOperation.getString(SLLIntOperation.copyAndInsert(4,test3)) + "\n");
/**
 * ...................G)
 */
        System.out.println("copyAndRemove: " + SLLIntOperation.getString(SLLIntOperation.copyAndRemove(1,test)));
        System.out.println("copyAndRemove: " + SLLIntOperation.getString(SLLIntOperation.copyAndRemove(2,test)));
        System.out.println("copyAndRemove: " + SLLIntOperation.getString(SLLIntOperation.copyAndRemove(4,test)));
        System.out.println("copyAndRemove: " + SLLIntOperation.getString(SLLIntOperation.copyAndRemove(4,test2)));
/**
 * ...................H)
  */
        SLLInt fuerH = new SLLInt(3,new SLLInt(1, new SLLInt(5, new SLLInt(2, new SLLInt(5)))));

        System.out.println("remove: " + SLLIntOperation.getString(SLLIntOperation.remove(5, fuerH)));





    }
}
