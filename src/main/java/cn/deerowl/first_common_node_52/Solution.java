package cn.deerowl.first_common_node_52;

public class Solution {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode tmp1 = pHead1;
        ListNode tmp2 = pHead2;
        while (tmp1!=null && tmp2!=null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }

        int count = 0;
        if (tmp1 != null) {
            while (tmp1 != null) {
                count ++;
                tmp1 = tmp1.next;
            }
            tmp1 = pHead1;
            tmp2 = pHead2;
            while (count-- > 0) {
                tmp1 = tmp1.next;
            }
        } else {
            while (tmp2 != null) {
                count++;
                tmp2 = tmp2.next;
            }
            tmp1 = pHead1;
            tmp2 = pHead2;
            while (count-- > 0) {
                tmp2 = tmp2.next;
            }
        }
        if (tmp1 == null || tmp2 == null) return null;
        while (tmp1 != tmp2) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        return tmp1;
    }
}
