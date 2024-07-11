package com.codewars.kata_8_kyu.solution_104;

import java.util.stream.IntStream;

/*  Calculate average
Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.
 */
public class Solution {
    public static double find_average(int[] array){
        return (array == null) ? 0.0 : IntStream.of(array).average().orElse(0);

    }
}
