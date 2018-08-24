package cn.deerowl.cut_rope_14;

public class Solution {

    public int max(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;

        int[] maxArray = new int[length+1];
        maxArray[0] = 0;
        maxArray[1] = 0;
        maxArray[2] = 1;
        maxArray[3] = 2;

        int max = 0;
        for (int i = 4 ; i<=length ; i++){
            max = 0;
            for (int j =  1 ; j<=1/2 ; j++){
                int product = maxArray[j] * maxArray[length - j];
                if (product > max) {
                    max = product;
                }
            }
            maxArray[i] = max;
        }
        max = maxArray[length];
        return max;
    }

    /**
     * 优先分割成长度为3的绳子
     * 如果剩余的长度为4，则分割为2*2
     * @param length
     * @return
     */
    public int max_greedy(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;

        int timesOf3 = length / 3;
        if (length - timesOf3 * 3 == 1) timesOf3 -=1;
        int timesOf2 = (length - timesOf3 * 3)/ 2;
        return (int) Math.pow(3, timesOf3) * (int)(Math.pow(2, timesOf2));
    }
}