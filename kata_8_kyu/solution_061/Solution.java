package com.codewars.kata_8_kyu.solution_061;

/*  Quadrants
Given a point in a Euclidean plane (x and y), return the quadrant the point exists in: 1, 2, 3 or 4 (integer). x and y are non-zero integers, therefore the given point never lies on the axes.

Examples
(1, 2)     => 1
(3, 5)     => 1
(-10, 100) => 2
(-1, -9)   => 3
(19, -56)  => 4
 */
public class Solution {
    public static int quadrant(int x, int y) {
        if (x > 0) {
            return (y > 0) ? 1 : 4;
        } else {
            return (y > 0) ? 2 : 3;
        }
    }
}
