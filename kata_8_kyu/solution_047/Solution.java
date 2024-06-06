package com.codewars.kata_8_kyu.solution_047;

/*  Printing Array elements with Comma delimiter
Input: Array of elements

["h","o","l","a"]

Output: String with comma delimited elements of the array in th same order.

"h,o,l,a"

Note: if this seems too simple for you try the next level

Note2: the input data can be: boolean array, array of objects, array of string arrays, array of number arrays... 😕


 */
public class Solution {
    public static String printArray(Object[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object var : array) {
            stringBuilder.append(var).append(",");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}

