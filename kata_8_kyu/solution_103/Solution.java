package com.codewars.kata_8_kyu.solution_103;

/*  CSV representation of array
Create a function that returns the CSV representation of a two-dimensional numeric array.

Example:

input:
   [[ 0, 1, 2, 3, 4 ],
    [ 10,11,12,13,14 ],
    [ 20,21,22,23,24 ],
    [ 30,31,32,33,34 ]]

output:
     '0,1,2,3,4\n'
    +'10,11,12,13,14\n'
    +'20,21,22,23,24\n'
    +'30,31,32,33,34'
    Array's length > 2.

More details here: https://en.wikipedia.org/wiki/Comma-separated_values

Note: you shouldn't escape the \n, it should work as a new line.
 */
public class Solution {
    public static String toCsvText(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    result.append(array[i][j]).append(", ");
                } else {
                    result.append(array[i][j]);
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
