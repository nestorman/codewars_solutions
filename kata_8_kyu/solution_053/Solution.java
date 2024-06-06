package com.codewars.kata_8_kyu.solution_053;
/*  Bin to Decimal
    Complete the function which converts a binary number (given as a string) to a decimal number.
 */
public class Solution {
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp,2);
//        int sum = 0;
//        for (int i = 0; i < inp.length(); i++ ) {
//            if(inp.charAt(i) != '0'){
//                double temp = Math.pow(2,inp.length()-1-i);
//                sum +=temp;
//            }
//            else {
//                sum+=0;
//            }
//
//        }
//        return sum;
    }
}
