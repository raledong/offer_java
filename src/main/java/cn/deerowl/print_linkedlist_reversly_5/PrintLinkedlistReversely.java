package cn.deerowl.print_linkedlist_reversly_5;

import java.util.Stack;

public class PrintLinkedlistReversely {

    public void print(LinkedListNode<Integer> head){
        if (head==null) return;

        Stack<Integer> stack = new Stack<>();
        LinkedListNode<Integer> tmp = head;
        while (tmp != null){
            stack.push(tmp.getValue());
            tmp = tmp.getNext();
        }

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public void printRecursively(LinkedListNode<Integer> head){
        if (head == null) return;
        printRecursively(head.getNext());
        System.out.print(head.getValue() + " ");
    }
    public static void main(String[] args){
        PrintLinkedlistReversely p = new PrintLinkedlistReversely();
        LinkedListNode<Integer> l1 = new LinkedListNode<>();
        l1.setValue(1);
        LinkedListNode<Integer> l2 = new LinkedListNode<>();
        l2.setValue(2);
        l1.setNext(l2);
        p.print(l1);
        p.printRecursively(l1);
    }
}