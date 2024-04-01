package com.codewars.kata_8_kyu.solution_017;
/*  Return the day
Complete the function which returns the weekday according to the input number:

1 returns "Sunday"
2 returns "Monday"
3 returns "Tuesday"
4 returns "Wednesday"
5 returns "Thursday"
6 returns "Friday"
7 returns "Saturday"
Otherwise returns "Wrong, please enter a number between 1 and 7"
 */

public class Solution {
    public static String getDay(int n) {
       switch (n){
           case 2: return "Monday";
           case 3: return "Tuesday";
           case 4: return "Wednesday";
           case 5: return "Thursday";
           case 6: return "Friday";
           case 7: return "Saturday";
           case 1: return "Sunday";
           default: return "Wrong, please enter a number between 1 and 7";

       }
    }
}
