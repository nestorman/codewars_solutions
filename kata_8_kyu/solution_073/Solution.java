package com.codewars.kata_8_kyu.solution_073;

/*  xclamation marks series #6: Remove n exclamation marks in the sentence from left to right
Description:
Remove n exclamation marks in the sentence from left to right. n is positive integer.

Examples
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
 */
public class Solution {
    public static String remove(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int count = n;
        for (int i = 0; i < stringBuilder.length() && count > 0; i++) {
            if (stringBuilder.charAt(i) == '!') {
                stringBuilder.deleteCharAt(i);
                i--;
                count--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        remove("!!!Hi !!hi!!! !hi", 5);
    }
}
