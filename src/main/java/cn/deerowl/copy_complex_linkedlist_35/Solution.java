package cn.deerowl.copy_complex_linkedlist_35;

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode p=pHead;
        RandomListNode t=pHead;
        while(p!=null){
            RandomListNode q=new RandomListNode(p.label);
            q.next=p.next;
            p.next=q;
            p=q.next;
        }
        while(t!=null){
            RandomListNode q=t.next;
            if(t.random!=null)
                q.random=t.random.next;
            t=q.next;

        }
        RandomListNode s=new RandomListNode(0);
        RandomListNode s1=s;
        while(pHead!=null){
            RandomListNode  q=pHead.next;
            pHead.next=q.next;
            q.next=s.next;
            s.next=q;
            s=s.next;
            pHead=pHead.next;


        }
        return s1.next;

    }
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static void main(String[] args) {
        RandomListNode r1 = new RandomListNode(1);
        RandomListNode r2 = new RandomListNode(2);
        RandomListNode r3 = new RandomListNode(3);
        RandomListNode r4 = new RandomListNode(4);
        RandomListNode r5 = new RandomListNode(5);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r1.random = r3;
        r2.random = r5;
        r4.random = r2;
        Solution s = new Solution();
        s.Clone(r1);
    }
}