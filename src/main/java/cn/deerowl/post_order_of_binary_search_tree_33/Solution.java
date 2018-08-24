package cn.deerowl.post_order_of_binary_search_tree_33;

public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null || sequence.length==0) return false;
        return VerifySequenceOfBST(sequence, 0, sequence.length-1);
    }

    public boolean VerifySequenceOfBST(int[] sequence, int start, int end) {
        if (start == end) return true;
        int root = sequence[end];
        int index = start;
        while(sequence[index] < root){
            index++;
        }

        int index2  = index;
        while (index2 < end) {
            if (sequence[index2] <= root ) return false;
            index2++;
        }

        if (index == start) {
            return VerifySequenceOfBST(sequence, index, end - 1);
        } else if (index == end) {
            return VerifySequenceOfBST(sequence, start, end - 1);
        }
        return VerifySequenceOfBST(sequence, start, index-1) && VerifySequenceOfBST(sequence, index, end-1);
    }
}