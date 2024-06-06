package com.codewars.kata_8_kyu.solution_049;

import java.util.Arrays;

/*  Sort and Star
You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.


 */
public class Solution {
    public static String twoSort(String[] s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        Arrays.sort(s);
        stringBuilder.append(s[0]);
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder2.append(stringBuilder.charAt(i));
            if (i < stringBuilder.length() - 1) {
                stringBuilder2.append("***");
            }
        }
        return stringBuilder2.toString();
    }
}
