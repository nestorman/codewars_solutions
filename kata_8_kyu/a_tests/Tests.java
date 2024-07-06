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
    public static String fakeBin(String numberString) {
        char [] array = numberString.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '1') {
                array[i] = '0';
            }
        }
        System.out.println(Arrays.toString(array));
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
            fakeBin("45385593107843568");
    }

}