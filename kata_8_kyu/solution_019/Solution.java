package com.codewars.kata_8_kyu.solution_019;

/*  Are You Playing Banjo?
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo"
name + " does not play banjo"
Names given are always valid strings.
 */
public class Solution {
    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
