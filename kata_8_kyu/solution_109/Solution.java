package com.codewars.kata_8_kyu.solution_109;

/*
Area of a Square
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.

Graph

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
 */
public class Solution {
    public static double squareArea(double A) {
        double area = 2 * A / Math.PI;
        area *= area;
        return Math.round((area) * 100.0) / 100.0;
    }
}
