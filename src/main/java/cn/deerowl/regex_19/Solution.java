package cn.deerowl.regex_19;

public class Solution {

    public boolean match(char[] str, char[] pattern) {
        if (str==null || pattern==null) return false;
        return match(str, pattern, 0, 0);
    }

    public boolean match(char[] str, char[] pattern, int strIndex, int patternIndex) {
        if (patternIndex == pattern.length) return strIndex == str.length;
        if (strIndex == str.length) return (patternIndex+1==pattern.length-1 && pattern[patternIndex+1]=='*');
        char s = str[strIndex];
        char p = pattern[patternIndex];
        if (patternIndex < pattern.length-1 && pattern[patternIndex+1] == '*') {
            if (p == s || (p=='.' && strIndex < str.length)) {
                return match(str, pattern, strIndex, patternIndex+2)
                        || match(str, pattern, strIndex+1, patternIndex+2)
                        || match(str, pattern, strIndex+1, patternIndex);
            } else {
                return match(str, pattern, strIndex, patternIndex + 2);
            }
        }
        if (s == p || (p=='.' && strIndex < str.length) ){
            return match(str, pattern, strIndex+1, patternIndex+1);
        }
        return false;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.match(new char[0], new char[]{'.', '*'});
    }
}