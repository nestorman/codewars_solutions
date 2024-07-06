package com.codewars.kata_8_kyu.solution_102;

import java.util.Arrays;

/*  Powers of 2
Complete the function that takes a non-negative integer n as input, and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).

Examples
n = 0  ==> [1]        # [2^0]
n = 1  ==> [1, 2]     # [2^0, 2^1]
n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
 */
public class Solution {
    public static long[] powersOfTwo(int n) {
        long[] resultArray = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            resultArray[i] = (long) Math.pow(2, i);
        }
        return resultArray;
    }
}