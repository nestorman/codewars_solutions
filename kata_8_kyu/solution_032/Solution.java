package com.codewars.kata_8_kyu.solution_032;
import java.time.Duration;
/*  Beginner Series #2 Clock

DESCRIPTION:
Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.

Example:
h = 0
m = 1
s = 1

result = 61000
Input constraints:

0 <= h <= 23
0 <= m <= 59
0 <= s <= 59
 */
public class Solution {
    public static int Past(int h, int m, int s) {
        if (0 <= h && h <= 23 && 0 <= m && m <= 59 && 0 <= s && s <= 59);
            return (int)Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
        /*if (0 <= h && h <= 23 && 0 <= m && m <= 59 && 0 <= s && s <= 59) {
            h *= 60 * 60 * 1000;
            m *= 60 * 1000;
            s *= 1000;
        }
        return h + m + s;*/
    }
}
