package com.codewars.kata_8_kyu.solution_090;

/*  Counting sheep...
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

For example,

[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined

 */
public class Solution {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) return 0;
        int count = 0;
        for(Boolean b: arrayOfSheeps){
            if(b != null && b){
                count++;
            }
        }
        return count;
    }
}
