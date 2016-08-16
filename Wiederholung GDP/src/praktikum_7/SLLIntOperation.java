package praktikum_7;

/**
 * Created by sniendorf on 12.08.2016.
 */
public class SLLIntOperation {




    public static String getString(SLLInt seq){
        if(seq == null){
            return  "";
        }
        return seq.element + ((seq.next == null)? "" : ":") + getString(seq.next);
    }

    public static int getLength (SLLInt seq){
        int counter = 1;
        if(seq == null){return 0;}
        while(seq.next != null){
            counter++;
            seq = seq.next;
        }
        return counter;
    }

    public static boolean isSorted (SLLInt seq){
        SLLInt here = seq;

        if(here == null){
            throw new IllegalArgumentException("EMPTY LINKED LIST");
        }
        if(here.next == null){return true;}

        int compareElement = here.element;
        here = here.next;

        while(compareElement < here.element && here.next != null){
            compareElement = here.element;
            here = here.next;
            if(compareElement > here.element){
                return false;
            }
        }
        return true;
    }

    public static SLLInt insert (int value, SLLInt seq) {
        SLLInt list = seq;
//        SLLInt listNext = seq.next;
        if (seq == null) {
            seq = new SLLInt(value);
        }else if(value < seq.element){
            seq = new SLLInt(value , seq);
            return seq;
        }else{
            while (list.next != null) {
                if (list.next.element >= value) {
                    list.next = new SLLInt(value, list.next);
                    return seq;
                }
                list = list.next;
            }
            list.next = new SLLInt(value);
        }
        return seq;
    }

    public static SLLInt copyAndInsert (int value, SLLInt seq){

        SLLInt tmp = seq;
        if(tmp == null){
            tmp = new SLLInt(value);
        }else if(value <= tmp.element){
              tmp = new SLLInt(value, tmp);
        }else{
            tmp = new SLLInt(tmp.element, copyAndInsert(value, tmp.next));
        }
        return tmp;
    }

    public static SLLInt copyAndRemove (int value, SLLInt seq) {
//        SLLInt tmp = seq;
//        SLLInt tmp2 = seq;
//        if (tmp.element == value) {
//            tmp = tmp.next;
//        } else {
//            while (tmp2.next != null) {
//                if (tmp2.next.element == value) {
//                    tmp2.next = tmp2.next.next;
//                } else {
//                    tmp2 = tmp2.next;
//                }
//            }
//        }
//        System.out.println(getString(seq));
//        return tmp;
        if (seq == null) {
            return null;
        }
        SLLInt head = null;
        SLLInt tail = null;

        while (seq != null) {
            if (seq.element != value) {
                if (head == null) {
                    head = new SLLInt(seq.element, seq.next);
                    tail = head;
                } else {
                    tail.next = new SLLInt(seq.element);
                    tail = tail.next;
                }
            }
            seq = seq.next;
        }
        return head;
    }

    public static SLLInt remove (int value, SLLInt seq){
        if(seq == null){return null;}
        if(seq.element == value){
            seq = remove(value, seq.next);
        } else {
            seq.next = remove(value,seq.next);
        }
        return seq;
    }


}







