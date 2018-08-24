package cn.deerowl.max_value_of_gift_47;

public class Solution {

    public int max(int[][] gifts) {
        if (gifts == null || gifts.length == 0 || gifts[0].length == 0) return 0;
        int[] tmp = new int[gifts[0].length];
        for (int i = 0 ; i< gifts.length ; i++) {
            for (int j = 0 ; j<gifts[0].length ; j++) {
                if (i==0 && j==0) {
                    tmp[j] = gifts[i][j];
                } else if (i==0) {
                    tmp[j] = tmp[j-1] + gifts[i][j];
                } else if (j==0) {
                    tmp[j] += gifts[i][j];
                } else {
                    tmp[j] = gifts[i][j] + Math.max(tmp[j-1], tmp[j]);
                }
            }
        }
        return tmp[tmp.length - 1];
    }
}
