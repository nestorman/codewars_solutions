package com.codewars.kata_8_kyu.solution_025;

/*  Unfinished Loop - Bug Fixing #1
Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!
 */
public class Solution {
    public static int saleHotdogs(final int n) {
        int price = 0;
        if (n < 5) {
            return n * 100;
        } else if (n >= 5 && n < 10) {
            return n * 95;
        } else return n * 90;
    }
}
