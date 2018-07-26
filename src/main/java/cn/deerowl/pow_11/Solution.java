package cn.deerowl.pow_11;

public class Solution {
    public double Power(double base, int exponent) {

        double res = Helper(base, Math.abs(exponent));
        if (exponent < 0) {
            res = 1.0 / res;
        }
        return res;

    }

    private double Helper(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double res = Power(base, exponent >> 1);
        res *= res;
        if ((exponent & 0x1) == 1) {
            res *= base;
        }
        return res;
    }

}