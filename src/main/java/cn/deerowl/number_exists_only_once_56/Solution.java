package cn.deerowl.number_exists_only_once_56;

public class Solution {

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null || array.length == 0) return;
        int number = 0;
        for (int i : array) {
            number ^= i;
        }

        int mark = findOne(number);
        for (int i : array) {
            if ((mark & i ) == 0 ) {
                num1[0] ^= i;
            } else {
                num2[0] ^= i;
            }
        }

    }

    public int findOne(int number) {
        int index = 1;
        while((number & 1) ==0) {
            index <<= 1;
            number >>>= 1;
        }
        return index;
    }
}
