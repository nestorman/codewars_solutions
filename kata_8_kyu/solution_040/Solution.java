package com.codewars.kata_8_kyu.solution_040;

import java.util.Arrays;

/*  Reversed sequence
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */
public class Solution {
    public static int[] reverse(int n) {
        int[] result = new int[n];
        int count = n;
        for (int i = 0; i < n; i++) {
            result[i] = count--;
        }
        return result;
    }
}

