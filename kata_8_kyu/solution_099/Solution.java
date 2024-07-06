package com.codewars.kata_8_kyu.solution_099;

import java.util.Arrays;

/*  Reversed Strings
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'

 */
public class Solution {
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();

    }
}
