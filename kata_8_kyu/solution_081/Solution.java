package com.codewars.kata_8_kyu.solution_081;

import java.util.Arrays;
import java.util.stream.IntStream;

/*  Merging sorted integer arrays (without duplicates)
Write a function that merges two sorted arrays into a single one. The arrays only contain integers.
Also, the final outcome must be sorted and not have any duplicate.
 */
public class Solution {
    public static int[] mergeArrays(int[] first, int[] second) {
//        IntStream.
//                concat(IntStream.of(first), IntStream.of(second)).
//                distinct().
//                sorted().
//                toArray();


        if (first.length == 0 && second.length == 0) return new int[0];
        int[] mergeArray = new int[first.length + second.length];

        System.arraycopy(first, 0, mergeArray, 0, first.length);
        System.arraycopy(second, 0, mergeArray, first.length, second.length);

//        for (int i = 0; i < first.length; i++) {
//            mergeArray[i] = first[i];
//        }
//        for (int i = 0; i < second.length; i++) {
//            mergeArray[first.length + i] = second[i];
//        }

        Arrays.sort(mergeArray);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(mergeArray[0]);
        for (int i = 1; i < mergeArray.length; i++) {
            if (mergeArray[i] != mergeArray[i - 1]) {
                stringBuilder.append(",").append(mergeArray[i]);
            }
        }

        String[] stringArray = stringBuilder.toString().split(",");
        System.out.println("res" + Arrays.toString(stringArray));

        int[] result = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        mergeArrays(new int[]{2, -4, 8}, new int[]{2, 4, 0, 6});
    }
}
