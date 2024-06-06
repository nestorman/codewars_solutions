package com.codewars.kata_8_kyu.solution_058;

import java.lang.IllegalArgumentException;

/*  Sum of Multiples
Your Job
Find the sum of all multiples of n below m

Keep in Mind
n and m are natural numbers (positive integers)
m is excluded from the multiples
Examples
Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
Kata.sumMul(4, -7)  // throws IllegalArgumentException
 */
public class Solution {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) throw new IllegalArgumentException("IllegalArgumentException");
        int sum = 0;
        for (int i = n; i < m; i++) {
            if (i % n == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sumMul(6,7);
    }
}
