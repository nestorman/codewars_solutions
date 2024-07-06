package com.codewars.kata_8_kyu.solution_097;

/*  Well of Ideas - Easy Version
For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
 If there are no good ideas, as is often the case, return 'Fail!'.
 */
public class Solution {
    public static String well(String[] x) {
        int goodIdeas = 0;
        for (String s : x) {
            if (s.equals("good")) {
                goodIdeas++;
            }
        }
        return (goodIdeas > 2) ? "I smell a series!" : (goodIdeas == 0) ? "Fail!" : "Publish!";
    }
}
