package com.codewars.kata_8_kyu.solution_078;

import java.util.Arrays;

/*  Convert number to reversed array of digits
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
 */
public class Solution {
    public static int[] digitize(long n) {
        String str = "" + n;
        int[] array = new int[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1 - i)));

        }
        return array;
    }
}
