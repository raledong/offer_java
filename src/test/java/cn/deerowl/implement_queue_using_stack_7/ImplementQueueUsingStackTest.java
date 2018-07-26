package cn.deerowl.implement_queue_using_stack_7;

import org.junit.Assert;
import org.junit.Test;

public class ImplementQueueUsingStackTest {

    @Test
    public void test(){
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        Assert.assertEquals(0, queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        Assert.assertEquals(1, queue.dequeue());
        queue.enqueue(3);
        Assert.assertEquals(2, queue.dequeue());
    }
}