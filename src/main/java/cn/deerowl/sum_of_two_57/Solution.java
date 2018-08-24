package cn.deerowl.sum_of_two_57;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array==null || array.length<=1) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = array.length-1;
        while (pointer1<pointer2){
            if (array[pointer1] + array[pointer2] < sum) {
                pointer1++;
            } else if (array[pointer1] + array[pointer2] > sum) {
                pointer2--;
            } else {
                result.add(array[pointer1]);
                result.add(array[pointer2]);
                break;
            }
        }
        return result;
    }
}
