package com.codewars.kata_8_kyu.solution_038;

/* Twice as old
Your function takes two arguments:

current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.
 */
public class Solution {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int var = sonYears * 2;
        if (dadYears > var) {
            return dadYears - var;
        } else {
            return var - dadYears;
        }

    }
}
