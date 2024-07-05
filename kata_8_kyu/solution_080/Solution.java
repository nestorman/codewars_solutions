package com.codewars.kata_8_kyu.solution_080;

/*
    Remove the time
    You're running out of screen real estate, and on some pages you want to display a shorter format, Weekday Month Day that omits the time.

Write a function that takes the website date/time in its original string format and returns the shortened format.

Input
Input will always be a string, e.g., "Friday May 2, 7pm".

Output
Output will be the shortened string, e.g., "Friday May 2".


 */
public class Solution {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(","));

    }
}
