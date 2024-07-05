package com.codewars.kata_8_kyu.solution_076;

/*  Lario and Muigi Pipe Problem
The pipes connecting your level's stages together need to be fixed before you receive any more complaints.

The pipes are correct when each pipe after the first is 1 more than the previous one.

Task
Given a list of unique numbers sorted in ascending order, return a new list so that the values increment by 1 for each index from the minimum value up to the maximum value (both included).

Example
Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8
 */
public class Solution {
    public static int[] pipeFix(int[] numbers) {
        int[] resultArray = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        System.out.println(numbers[numbers.length - 1] - numbers[0] + 1);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = numbers[0] + i;
        }
        return resultArray;
    }
}
