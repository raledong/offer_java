package cn.deerowl.implement_queue_using_stack_7;

import java.util.LinkedList;

/**
 * @author dongsheng.hds
 * @version $Id: ImplementStackUsingQueue.java, v 0.1 2018-07-23 19:09 dongsheng.hds Exp $$
 */
public class ImplementStackUsingQueue {
    private LinkedList<Integer> queue1;
    private LinkedList<Integer> queue2;

    public ImplementStackUsingQueue(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    public void push(int e){
        if (queue1.size() == 0){
            queue2.offer(e);
        }else {
            queue1.offer(e);
        }
    }

    public int pop(){
        if (this.size() == 0) throw new IndexOutOfBoundsException();
        if (queue1.size() != 0){
            while (queue1.size() > 1 ){
                int e = queue1.poll();
                queue2.offer(e);
            }
            return queue1.poll();
        }else {
            while (queue2.size() > 1){
                int e = queue2.poll();
                queue1.offer(e);
            }
            return queue2.poll();
        }
    }

    public int size(){
        return queue1.size() + queue2.size();
    }
}