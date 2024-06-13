package com.codewars.kata_8_kyu.solution_065;

import java.util.Arrays;

/*  Sum of differences in array
Your task is to sum the differences between consecutive pairs in the array in descending order.

Example
[2, 1, 10]  -->  9
In descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).
 */
public class Solution {
    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sumOfDifferences(new int[]{2, 1, 10});
    }
}
