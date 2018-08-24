package cn.deerowl.is_number_20;

public class Solution {

    public boolean isNumeric(char[] str) {
        int indexOfDot = -1;
        int indexOfE = -1;

        for (int i = 0 ; i<str.length ; i++) {
            char c= str[i];
            if (c == '.') {
                if (indexOfDot == -1 && indexOfE == -1) {
                    indexOfDot = i;
                } else {
                    return false;
                }
            } else if (c == 'E' || c == 'e') {
                if (indexOfE == -1) {
                    indexOfE = i;
                } else {
                    return false;
                }
            } else if (!(c == '+' || c == '-' || (c >= '0' && c <= '9'))) {
                return false;
            }
        }


        if (indexOfDot != -1 && indexOfE != -1) {
            return (isInteger(str, 0, indexOfDot-1) || isUnsignedInteger(str, indexOfDot+1, indexOfE-1)) && isInteger(str, indexOfE+1, str.length-1);
        } else if (indexOfDot != -1) {
            return (isInteger(str, 0, indexOfDot-1) || isUnsignedInteger(str, indexOfDot+1, str.length-1));
        } else if (indexOfE != -1) {
            return isInteger(str, 0, indexOfE-1) && isInteger(str, indexOfE+1, str.length-1);
        } else {
            return isInteger(str, 0, str.length-1);
        }
    }

    public boolean isInteger(char[] str, int startIndex, int endIndex){
        if (startIndex > endIndex) return false;
        if (str[startIndex] == '+' || str[startIndex] == '-'){
            return isUnsignedInteger(str, startIndex+1, endIndex);
        } else {
            return isUnsignedInteger(str, startIndex, endIndex);
        }
    }

    public boolean isUnsignedInteger(char[] str, int startIndex, int endIndex){
        if (startIndex > endIndex) return false;
        while (startIndex <= endIndex) {
            if (str[startIndex] < '0' || str[startIndex]>'9') return false;
            startIndex++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isNumeric("-.123".toCharArray());
    }
}