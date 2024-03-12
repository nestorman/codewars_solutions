package com.codewars.kata_8_kyu.solution_005;

/*  How do I compare numbers?
DESCRIPTION:
What could be easier than comparing integer numbers? However, the given piece of code doesn't recognize
some of the special numbers for a reason to be found. Your task is to find the bug and eliminate it.
 */
public class Solution {

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
                return (String) p[1];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
