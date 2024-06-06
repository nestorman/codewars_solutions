package com.codewars.kata_8_kyu.solution_043;

import java.util.ArrayList;
import java.util.Arrays;

/*
Multiple of index
Return a new array consisting of elements which are multiple of their own index in input array (length > 1).

Some cases:
[22, -6, 32, 82, 9, 25] =>  [-6, 32, 25]

[68, -1, 1, -7, 10, 10] => [-1, 10]
 */
public class Solution {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array[0] == 0) list.add(array[0]); // I'm misunderstanding the concept of multiplicity
        // where you can't divide by zero or the autor didn't consider his example correctly ?
        for (int i = 1; i < array.length; i++) {

            if (array[i] % i == 0) {
                list.add(array[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
