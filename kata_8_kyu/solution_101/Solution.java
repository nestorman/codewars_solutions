package com.codewars.kata_8_kyu.solution_101;

import java.util.stream.IntStream;

/*
Array plus array
I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output is a number too.
 */
public class Solution {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sum();

    }
}
