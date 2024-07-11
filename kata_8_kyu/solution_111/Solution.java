package com.codewars.kata_8_kyu.solution_111;
/*  Regexp Basics - is it a digit?
Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object is a digit (0-9), false otherwise.
 */
public class Solution {
    public static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }
}
