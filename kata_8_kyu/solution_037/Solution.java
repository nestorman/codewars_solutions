package com.codewars.kata_8_kyu.solution_037;

/*  Expressions Matter
Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained (Read the notes for more detail about it)
Example
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1  ≤  a, b, c  ≤  10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.

 */
public class Solution {
    public static int expressionsMatter(int a, int b, int c) {
        int result_1 = a * b * c;
        int result_2 = a + b + c;
        int result_3 = a * b + c;
        int result_4 = a + b * c;
        int result_5 = (a + b) * c;
        int result_6 = a * (b + c);
        int result_7 = (a + c * b);
        return Math.max(result_1, Math.max(result_2, Math.max(result_3, (Math.max(result_4, Math.max(result_5, (Math.max(result_7, result_6))))))));


    }
}
