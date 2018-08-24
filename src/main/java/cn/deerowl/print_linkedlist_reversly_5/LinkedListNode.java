package cn.deerowl.print_linkedlist_reversly_5;

public class LinkedListNode<T> {

    private T value;
    private LinkedListNode<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }
}