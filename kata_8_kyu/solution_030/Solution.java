package com.codewars.kata_8_kyu.solution_030;

import java.util.Arrays;

/*              Kata Example Twist

DESCRIPTION:
This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).

Add the value "codewars" to the array websites 1,000 times.
 */
public class Solution {
    public static String[] kataExampleTwist() {
        String[] websites = new String [1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }
}
