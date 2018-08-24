package cn.deerowl.reverse_string_58;

public class Solution {

    public String ReverseSentence(String str) {
        if (str==null || str.trim().length() == 0) return str;
        String[] letters = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = letters.length-1 ; i>=0 ; i--) {
            result.append(letters[i]);
            if (i!=0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
