package com.codewars.kata_8_kyu.solution_029;

public class Solution {
    public static String countingSheep(int num) {
        StringBuilder murmur = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            murmur.append(i).append(" sheep...");
        }
        return murmur.toString();
    }
}
