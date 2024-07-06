package com.codewars.kata_8_kyu.solution_096;
/*  Remove exclamation marks
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.


 */
public class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }
}
