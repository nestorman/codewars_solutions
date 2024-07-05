package com.codewars.kata_8_kyu.a_tests;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

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
public class Tests {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) return 0;
        int count = 0;
        for (Boolean b : arrayOfSheeps) {
            if (b != null && b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, null,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        countSheeps(array1);
    }

}