package praktikum_7;

/**
 * Created by sniendorf on 16.08.2016.
 */
public class DLLOperations {

    public static String getString (SeqByDLL seq, boolean inverted){
        String ausgabe = "(";
        SeqByDLL tmp = new SeqByDLL(seq.head, seq.tail);
        if(seq == null){return null;}
        if(inverted){
            do{
                ausgabe += tmp.head.element;
                if(tmp.head.next != null){
                    ausgabe += ":";
                }
                tmp.head = tmp.head.next;
            }while(tmp.head != null);
        } else {
            do{
                ausgabe += tmp.tail.element;
                if(tmp.tail.prev != null){
                    ausgabe += ":";
                }
                tmp.tail = tmp.tail.prev;
            }while(tmp.tail != null);
        }
        ausgabe += ")";
        return ausgabe;


/**
 * :::::::::::::::::::::ALTERNATIVE::::::::::::::::::::::::::::::::
 */
//        String s = "";
//
//        //Anfang
//        DLLInt current = (inverted) ? seq.tail : seq.head;
//
//        while (current != null) {
//
//            s += current.element + ((((inverted) ? current.prev : current.next) == null) ? "" : ":");
//            current = (inverted) ? current.prev : current.next;
//        }
//
//        return s;
    }

    public static SeqByDLL insert (int value, SeqByDLL seq){
        if(seq == null){
            return null;
        } else if(seq.head.element >= value){
            DLLInt neu = new DLLInt(null,value, seq.head);
            seq.head.prev = neu;
            seq.head = neu;
            return seq;
        } else {
            DLLInt tmp = seq.head;

            while(tmp.next != null){
                if(value <= tmp.next.element){
                    tmp.next = new DLLInt(tmp, value, tmp.next);
                    tmp.next.next.prev = tmp.next;
                    return seq;
                }
                tmp = tmp.next;
            }
            tmp.next = new DLLInt(tmp, value, null);
            seq.tail = tmp.next;
            return seq;
        }
    }

//    public static SeqByDLL revert (SeqByDLL seq){
//        if(seq == null){return null;}
//        while(seq.head != null){
//            if(seq.head.prev == null){
//                seq.head.prev = seq.head.next;
//                seq.head.next = null;
//                seq.head.prev.next = seq.head.next;
//            }else{
//
//            }
//
//        }
//    }


}
