package com.codewars.kata_8_kyu.solution_063;
/*  Triple Trouble
Triple Trouble
Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length.
 */
public class Solution {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder tripleWord = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            tripleWord.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }
        return tripleWord.toString();
    }
}
