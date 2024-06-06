package com.codewars.kata_8_kyu.solution_048;

public class Solution {
    public static int billboard(String name, int price) {
        for(int i = 0; i <= name.length(); i++){
            price += price;
        }
        return price;
    }
}
