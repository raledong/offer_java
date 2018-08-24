package cn.deerowl.number_to_string_46;

public class Solution {


    //¶¯Ì¬¹æ»®
    public int IntToStr2(String str) {
        if (str==null) return 0;
        int[] nums = new int[str.length()+1];
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            if (i == str.length() - 1) {
                nums[i] = 1;
            } else {
                nums[i] = nums[i+1];
                int cur = str.charAt(i) - '0';
                int next = str.charAt(i+1) - '0';
                int converted = cur * 10 + next;
                if (next > 9 && next < 26) {
                    nums[i] += nums[i+2];
                }
            }

        }
        return nums[0];
    }
}
