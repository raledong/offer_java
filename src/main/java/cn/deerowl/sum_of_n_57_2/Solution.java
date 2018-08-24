package cn.deerowl.sum_of_n_57_2;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if (sum <= 1) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int min = 1;
        int max = 2;
        int val = min + max;
        do {
            if (val == sum) {
                ArrayList<Integer> sequence = new ArrayList<>();
                for (int i = min ; i<=max ; i++) {
                    sequence.add(i);
                }
                result.add(sequence);
                max ++;
                val += max;
            } else if (val > sum) {
                val -= min;
                min++;
            } else {
                max++;
                val += max;
            }
        } while (min < max);
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.FindContinuousSequence(11);
    }
}
