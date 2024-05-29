package com.codewars.kata_8_kyu.solution_036;
/*  Abbreviate a Two Word Name
DESCRIPTION:
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */
public class Solution {
    public static String abbrevName(String name) {
        String [] words = name.split(" ");
        return  (words[0].charAt(0) + "." + words[1].charAt(0)).toUpperCase();
    }
}
