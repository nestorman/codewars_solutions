package com.codewars.kata_8_kyu.solution_046;
/*  No zeros for heros
Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105
Zero alone is fine, don't worry about it. Poor guy anyway


 */
public class Solution {
    public static int noBoringZeros(int n) {
        if(n==0) return 0;
        String result = Integer.toString(n).replaceAll("0*$","");
        return Integer.parseInt(result);
    }
}
