package com.codewars.kata_8_kyu.solution_052;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Is your period late?
In this kata, we will make a function to test whether a period is late.

Our function will take three parameters:

last - The Date object with the date of the last period

today - The Date object with the date of the check

cycleLength - Integer representing the length of the cycle in days

Return true if the number of days passed from last to today is greater than cycleLength. Otherwise, return false.


 */
public class Solution {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return (ChronoUnit.DAYS.between(last, today) > cycleLength);

    }
}
