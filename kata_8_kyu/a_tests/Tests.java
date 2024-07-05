package com.codewars.kata_8_kyu.a_tests;

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
    public static int[] pipeFix(int[] numbers) {
        int[] resultArray = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        System.out.println(numbers[numbers.length - 1] - numbers[0] + 1);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = numbers[0] + i;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        pipeFix(new int[]{6, 9});
    }
}