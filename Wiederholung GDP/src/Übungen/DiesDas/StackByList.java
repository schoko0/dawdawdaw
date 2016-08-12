package Übungen.DiesDas;




public class StackByList {

    private SingleLinkedList list = null;



    public void push(Object newElement){
        list = new SingleLinkedList(newElement, list);
    }

    public boolean isEmpty ( ){
        return (list == null);
    }

    public Object pop() {
        Object removedObject = list.first;
        list = list.next;
        return removedObject;
    }

    public Object peek(){
        return list.first;
    }

}
