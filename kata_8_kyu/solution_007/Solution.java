package com.codewars.kata_8_kyu.solution_007;
import java.util.List;

/*  Filtering even numbers (Bug Fixes)
DESCRIPTION:
Fix the bug in Filtering method
The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.

However, there is a bug in the method that needs to be resolved.
 */
public class Solution {

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
}
