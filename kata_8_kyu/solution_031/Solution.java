package com.codewars.kata_8_kyu.solution_031;
/*
Get Nth Even Number

Return the Nth Even Number

Example(Input --> Output)

1 --> 0 (the first even number is 0)
3 --> 4 (the 3rd even number is 4 (0, 2, 4))
100 --> 198
1298734 --> 2597466
The input will not be 0.
 */
public class Solution {
    public static int nthEven(int n) {
        return (n - 1) * 2;
    }
}
