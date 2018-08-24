package cn.deerowl.odd_before_even_21;

public class Solution {

    public void reOrderArray(int [] array) {
        if (array==null || array.length == 0) return;
        for (int i = 0 ; i<array.length-1 ; i++) {
            for (int j = 0 ; j<array.length-1 ; j++) {
                if (array[j] % 2 == 0 && array[j+1] % 2 == 1){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

}