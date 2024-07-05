package com.codewars.kata_8_kyu.solution_075;

/*  Double Char
Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
 */
public class Solution {
    public static String doubleChar(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            for (int i = 0; i < 2; i++) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
