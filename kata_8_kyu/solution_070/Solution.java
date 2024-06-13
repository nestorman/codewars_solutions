package com.codewars.kata_8_kyu.solution_070;

import java.util.Arrays;

/*  What is between?
Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.

For example:

a = 1
b = 4
--> [1, 2, 3, 4]
 */
public class Solution {
    public static int[] between(int a, int b) {
        int [] array = new int[b - a + 1];
        array [0] = a;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        between(3,9);
    }
}
