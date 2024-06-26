package com.codewars.kata_8_kyu.solution_059;

/*  Is it a number?
Given a string s, write a method (function) that will return true if its a valid single integer or floating number or false if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")

 */
public class Solution {
    public boolean isDigit(String s){
        s = s.trim();
        String regex = "^-?\\d+(\\.\\d+)?$";
        return s.matches(regex);
    }
    }

