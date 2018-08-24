package cn.deerowl.sum_65;

public class Solution {
    public int Add(int num1,int num2) {
        int sum = 0, carry = 0;
        do {
            sum = num1 ^ num2;
            carry = num1 & num2;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        return num1;
    }
}
