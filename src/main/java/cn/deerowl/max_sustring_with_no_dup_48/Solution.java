package cn.deerowl.max_sustring_with_no_dup_48;

public class Solution {

    public int maxSubstring(String s) {
        if (s==null || s.length() == 0) return 0;

        int length = s.length();
        int[] tmp = new int[length];
        tmp[0] = 1;
        for (int i = 1 ; i<length ; i++) {
            for (int j = i-1 ; j>=i-tmp[i-1] ; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    tmp[i] = i - j;
                    break;
                }
            }
        }
        return tmp[tmp.length - 1];
    }
}
