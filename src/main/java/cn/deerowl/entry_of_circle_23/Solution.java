package cn.deerowl.entry_of_circle_23;

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead==null) return pHead;
        ListNode fast = pHead;
        ListNode slow = pHead;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        if (fast == null || fast.next == null) return null;

        int numberOfNodeInLoop = 0;
        do {
            slow = slow.next;
            numberOfNodeInLoop++;
        }while (slow != fast);

        fast = pHead;
        slow = pHead;
        for (int i = 0; i < numberOfNodeInLoop ; i++){
            fast = fast.next;
        }

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}