package cn.deerowl.max_slide_window_59;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if (num == null || num.length < size || size <= 0) {
            return result;
        }
        if(size == 1){
            for(int val : num){
                result.add(val);
            }
            return result;
        }
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        for (int i = 1; i < num.length; i++) {

            int value = num[i];
            if (value > num[queue.peekLast()]) {
                while (!queue.isEmpty() && value > num[queue.peekLast()]) {
                    queue.pollLast();
                }

            }
            queue.addLast(i);

            if (i - queue.peek() >= size) {
                queue.poll();
            }

            if (i + 1 >= size) {
                result.add(num[queue.peek()]);
            }

        }
        return result;
    }
}
