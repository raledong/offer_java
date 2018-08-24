package cn.deerowl.ugly_number_49;

public class Solution {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 1) return index;
        int indexTwo = 0;
        int indexThree = 0;
        int indexFive = 0;
        int[] stream = new int[index];
        stream[0] = 1;
        int num = 1;
        for (int i = 1 ; i<index ; i++) {
            int maxTwo = 2 * stream[indexTwo];
            int maxThree = 3 * stream[indexThree];
            int maxFive = 5 * stream[indexFive];
            if (maxTwo <= maxThree && maxTwo <= maxFive) {
                num = maxTwo;
                indexTwo++;
                stream[i] = num;
            } else if (maxThree <= maxFive && maxThree <= maxTwo) {
                num = maxThree;
                indexThree++;
                stream[i] = num;
            } else {
                num = maxFive;
                indexFive++;
                stream[i] = num;
            }
            if (2 * stream[indexTwo] == num) {
                indexTwo++;
            }
            if (3 * stream[indexThree] == num) {
                indexThree++;
            }
            if (5 * stream[indexFive] == num) {
                indexFive++;
            }
        }
        return num;
    }
}
