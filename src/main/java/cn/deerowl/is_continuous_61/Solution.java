package cn.deerowl.is_continuous_61;

import java.util.Arrays;

public class Solution {

    public boolean isContinuous(int [] numbers) {
        if (numbers==null || numbers.length==0) return false;
        Arrays.sort(numbers);
        int numberOfZero = 0;
        for (int i = 0 ; i<numbers.length ; i++) {
            if (numbers[i] == 0) {
                numberOfZero++;
            } else if (i!=0 && numbers[i] != 0 && numbers[i-1]!=0){
                if (numbers[i] == numbers[i-1]) {
                    return false;
                } else {
                    numberOfZero -= (numbers[i] - numbers[i-1] - 1);
                    if (numberOfZero < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
