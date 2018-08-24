package cn.deerowl.kth_node_22;

public class Solution {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k < 1) return null;
        ListNode tmp = head;
        for (int i = 0 ; i<k ; i++) {
            if (tmp == null){
                return null;
            }
            tmp = tmp.next;
        }
        ListNode result = head;
        while (tmp != null) {
            result = result.next;
            tmp = tmp.next;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        solution.FindKthToTail(l1, 1);
    }
}