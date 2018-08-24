package cn.deerowl.implement_queue_using_stack_7;

import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public ImplementQueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enqueue(int e){
        s1.push(e);
    }

    public int dequeue(){
        if (this.size() == 0) throw new IndexOutOfBoundsException();
        if (s2.empty()){
            while (!s1.empty()){
                Integer e = s1.pop();
                s2.push(e);
            }
        }
        return s2.pop();
    }

    public int size(){
        return s1.size() + s2.size();
    }
}