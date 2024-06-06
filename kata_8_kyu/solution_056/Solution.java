package com.codewars.kata_8_kyu.solution_056;

/*  Collatz Conjecture (3n+1)

 */
public class Solution {
    public static int hotpo(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }
}
