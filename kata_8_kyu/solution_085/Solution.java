package com.codewars.kata_8_kyu.solution_085;

import java.util.ArrayList;
import java.util.List;

/*  Removing Elements
Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
 */
public class Solution {
    public static Object[] removeEveryOther(Object[] arr) {

        List <Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i+=2) {
            list.add(arr[i]);
        }
        return list.toArray();
//        Object[] newArray = new Object[(arr.length + 1) / 2];
//        int count = 0;
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = arr[count];
//            count += 2;

    }
}
