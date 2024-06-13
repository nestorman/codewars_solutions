package com.codewars.kata_8_kyu.solution_066;
/*  Simple validation of a username with regex
Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).


 */
public class Solution {
    public static boolean validateUsr(String s) {
        return (s.matches("^[a-z0-9_]{4,16}$"));
    }
}
