package cn.deerowl.stack_with_min_30;

import java.util.Stack;

public class Solution {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> minS = new Stack<>();

    public void push(int node) {
        s.push(node);
        if (minS.isEmpty()) {
            minS.push(node);
        } else {
            int min = minS.peek();
            if (node < min) {
                minS.push(node);
            } else {
                minS.push(min);
            }
        }
    }

    public void pop() {
        minS.pop();
        s.pop();
    }

    public int top() {
        return s.pop();
    }

    public int min() {
        return minS.peek();
    }
}