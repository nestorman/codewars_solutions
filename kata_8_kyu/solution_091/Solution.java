package com.codewars.kata_8_kyu.solution_091;

import java.util.ArrayList;
import java.util.Arrays;

/*  Find Multiples of a Number
In this simple exercise, you will build a program that takes a value, integer , and returns a list of its multiples up to another value, limit . If limit is a multiple of integer, it should be included as well. There will only ever be positive integers passed into the function, not consisting of 0. The limit will always be higher than the base.

For example, if the parameters passed are (2, 6), the function should return [2, 4, 6] as 2, 4, and 6 are the multiples of 2 up to 6.
 */
public class Solution {
    public static int[] find(int base, int limit) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = base; i < limit; i++) {
            if (i % base == 0) {
                list.add(i);
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i <= array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
