package cn.deerowl.reverse_string_58_2;

public class Solution {

    public String LeftRotateString(String str,int n) {
        if (str==null || str.trim().length()==0 || str.length()<n) return str;
        String sub = str.substring(0, n);
        return str.substring(n) + sub;
    }
}
