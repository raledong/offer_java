package cn.deerowl.max_sum_of_array_42;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array==null || array.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0 ; i < array.length ; i++) {
            cur += array[i];
            max = Math.max(cur, max);
            if (cur < 0) {
                cur = 0;
            }
        }
        return max;
    }
}
