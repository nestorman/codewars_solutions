package com.codewars.kata_8_kyu.solution_057;
/*  To square(root) or not to square(root)
Write a method, that will get an integer array as parameter and will process every number from this array.

Return a new array with processing every number of the input-array like this:

If the number has an integer square root, take this, otherwise square the number.

Example
[4,3,9,7,2,1] -> [2,9,3,49,4,1]
Notes
The input array will always contain only positive numbers, and will never be empty or null.
 */

public class Solution {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] processingArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                processingArray[i] = (int) Math.sqrt(array[i]);
            } else {
                processingArray[i] = (int) Math.pow(array[i], 2);
            }
        }
        return processingArray;
    }
}
