package com.codewars.kata_8_kyu.solution_107;
/*  Short Long Short
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty ( zero length ).

Hint for R users:

The length of string is not always the same as the number of characters
For example: (Input1, Input2) --> output

("1", "22") --> "1221"
("22", "1") --> "1221"
ShortLongShort.solution("1", "22"); // returns "1221"
ShortLongShort.solution("22", "1"); // returns "1221"
 */
public class Solution {
    public static String solution(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        if(a.length() > b.length()){
            stringBuilder.append(b).append(a).append(b);
        }
        else {
            stringBuilder.append(a).append(b).append(a);
        }
        return stringBuilder.toString();
    }
}
