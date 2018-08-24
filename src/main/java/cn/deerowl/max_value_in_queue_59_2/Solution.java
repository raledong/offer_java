package cn.deerowl.max_value_in_queue_59_2;

import java.util.LinkedList;

public class Solution {

    LinkedList<QueueNode> queue = new LinkedList<>();
    LinkedList<QueueNode> maxQueue= new LinkedList<>();
    int curIndex = 0;
    public int popFront(){
        if (queue.isEmpty()) throw new IndexOutOfBoundsException();

        QueueNode node = queue.poll();
        if (node.index == maxQueue.getFirst().index) {
            maxQueue.poll();
        }
        return node.val;
    }

    public void pushBack(int val){
        while (!maxQueue.isEmpty() && val > maxQueue.getLast().val){
            maxQueue.pollLast();
        }
        QueueNode queueNode = new QueueNode();
        queueNode.index = ++curIndex;
        queueNode.val = val;
        maxQueue.push(queueNode);
        queue.push(queueNode);
    }

    public int max(){
        return maxQueue.getFirst().val;
    }

    class QueueNode{
        int val;
        int index;
    }
}
