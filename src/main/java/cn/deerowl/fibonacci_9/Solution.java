package cn.deerowl.fibonacci_9;

public class Solution {
    public int Fibonacci(int n) {
        if (n<=1) return n;
        int prev = 1;
        int prevBeforePrev = 0;
        int result = 0;
        for(int i = 2 ; i<= n ; i++){
            result = prev + prevBeforePrev;
            prevBeforePrev = prev;
            prev = result;
        }
        return result;
    }
}