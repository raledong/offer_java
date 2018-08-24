package cn.deerowl.number_of_one_15;

public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            if ((n & 1) == 1){
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    public int Numberof1_2(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}