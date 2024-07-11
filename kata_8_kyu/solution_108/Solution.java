package com.codewars.kata_8_kyu.solution_108;
import java.util.List;

/*  Sum Mixed Array
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
 */
public class Solution {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for(Object object: mixed){
            if(object instanceof Integer){
                sum += (Integer) object;
            }
            else if (object instanceof String){
                sum += Integer.parseInt(object.toString());
            }
        }
        return sum;
    }
}
