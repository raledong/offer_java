package cn.deerowl.implement_queue_using_stack_7;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStackUsingQueueTest {
    @Test
    public void test(){
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.pop());
        stack.push(4);
        Assert.assertEquals(4, stack.pop());
        Assert.assertEquals(1, stack.pop());
    }
}