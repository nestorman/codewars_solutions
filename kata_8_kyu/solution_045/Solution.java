package com.codewars.kata_8_kyu.solution_045;

/*  Convert a string to an array
Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class Solution {
    public static String[] stringToArray(String s) {
//        String[]result = new String[s.split(" ").length];
//        result = s.split(" ");
//        return result;
        return s.split(" ");



    }

    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
    }
}
