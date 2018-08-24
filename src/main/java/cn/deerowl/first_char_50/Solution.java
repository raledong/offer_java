package cn.deerowl.first_char_50;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str==null || str.length()==0) return -1;
        char[] array = str.toCharArray();
        int[] count = new int[128];
        for (char c : array) {
            count[c]++;
        }
        for (int i = 0 ; i < array.length ; i++) {
            char c = array[i];
            if (count[c] == 1) return i;
        }
        return 0;
    }
}
