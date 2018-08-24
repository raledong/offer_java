package cn.deerowl.over_half_39;

public class Solution {

    public int MoreThanHalfNum_Solution(int[] array) {
        if (array==null || array.length == 0) return 0;
        int num = array[0];
        int count = 1;
        for (int i = 1 ; i < array.length ; i++) {
            int tmp = array[i];
            if (tmp == num) {
                count ++;
            } else {
                count --;
                if (count == 0) {
                     num = array[i];
                     count = 1;
                }
            }
        }
        return checkResult(array,num) ? num : 0;
    }

    public boolean checkResult(int[] array, int result) {
        int length = array.length;
        int count = 0;
        for (int i = 0 ; i<length ; i++) {
            if (array[i] == result) {
                count ++;
            }
        }
        return count > length / 2;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2});
    }
}