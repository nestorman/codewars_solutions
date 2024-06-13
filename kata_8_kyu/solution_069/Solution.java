package com.codewars.kata_8_kyu.solution_069;

import java.util.Arrays;

/*  Cat years, Dog years
Kata Task
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

 */
public class Solution {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = calculateCatYears(humanYears);
        int dogYears = calculateDogYears(humanYears);
        return new int[]{humanYears, catYears, dogYears};
    }

    public static int calculateCatYears(int humanYears) {
        return (humanYears <= 1) ? 15 : (humanYears <= 2) ? 15 + 9 : 15 + 9 + (4 * (humanYears - 2));
    }

    public static int calculateDogYears(int humanYears) {
        return (humanYears <= 1) ? 15 : (humanYears <= 2) ? 15 + 9 : 15 + 9 + (5 * (humanYears - 2));
    }
}
