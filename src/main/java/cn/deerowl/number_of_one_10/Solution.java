/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.deerowl.number_of_one_10;

/**
 * @author dongsheng.hds
 * @version $Id: Solution.java, v 0.1 2018-07-26 14:56 dongsheng.hds Exp $$
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            if ((n & 1) == 1){
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    public int Numberof1_2(int n) {
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}