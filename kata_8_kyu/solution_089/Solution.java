package com.codewars.kata_8_kyu.solution_089;

import java.util.Arrays;

/*  Count of positives / sum of negatives
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
public class Solution {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int[] array = new int[2];
        int positives = 0;
        int negatives = 0;
        for (int a : input) {
            if (a > 0) {
                positives++;
            } else {
                negatives += a;
            }
        }
        array[0] = positives;
        array[1] = negatives;
        return array;
    }

}
