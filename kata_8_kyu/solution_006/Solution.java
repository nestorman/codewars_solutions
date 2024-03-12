package com.codewars.kata_8_kyu.solution_006;

import java.util.Arrays;

/*  Smallest unused ID
DESCRIPTION:
Hey awesome programmer!

You've got much data to manage and of course you use zero-based and non-negative ID's to make each data item unique!

Therefore you need a method, which returns the smallest unused ID for your next new data item...

Note: The given array of used IDs may be unsorted. For test reasons there may be duplicate IDs, but you don't have to find or remove them!

Go on and code some pure awesomeness!
 */
public class Solution {
    public static int nextId(int[] ids) {
        int id = 0;
        Arrays.sort(ids);
        for (int num : ids) {
            if (num == id) {
                id++;
            }

        }
        return id;
    }
}
