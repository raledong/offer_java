package cn.deerowl.reverse_linked_list_24;

public class Solution {

    public ListNode ReverseList(ListNode head) {
        if (head==null || head.next == null) return head;
        ListNode dummuy = new ListNode(-1);
        dummuy.next = head;
        ListNode tmp = head;
        while (tmp.next != null) {
            ListNode curHead = dummuy.next;
            dummuy.next = tmp.next;
            tmp.next = tmp.next.next;
            dummuy.next.next = curHead;
        }
        return dummuy.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}