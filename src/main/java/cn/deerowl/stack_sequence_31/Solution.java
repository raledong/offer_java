package cn.deerowl.stack_sequence_31;

import java.util.Stack;

public class Solution {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA==null || popA==null || pushA.length != popA.length) return false;
        Stack<Integer> s = new Stack<>();
        int indexOfA = 0;
        int indexOfB = 0;
        while (indexOfA < pushA.length) {
            while (!s.empty()  && s.peek() == popA[indexOfB]){
                s.pop();
                indexOfB++;
            }
            s.push(pushA[indexOfA++]);
        }
        while (!s.empty()  && s.peek() == popA[indexOfB]){
            s.pop();
            indexOfB++;
        }
        return indexOfB == popA.length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.IsPopOrder(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1});
    }
}