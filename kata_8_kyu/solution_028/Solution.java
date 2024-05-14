package com.codewars.kata_8_kyu.solution_028;

/*  Remove String Spaces
Write a function that removes the spaces from the string, then return the resultant string.

Examples:

Input -> Output
"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
 */
public class Solution {
    public static String noSpace(final String x) {
        return (x.replaceAll(" ", ""));
    }
}
