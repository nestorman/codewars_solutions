package com.codewars.kata_8_kyu.a_tests;

/*  Is it a number?
Given a string s, write a method (function) that will return true if its a valid single integer or floating number or false if its not.

Valid examples, should return true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
should return false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")

 */
public class Tests {
    public static String toAlternativeString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.toUpperCase());
        for(int i = 0; i < string.length(); i++){
            if(stringBuilder.charAt(i) != string.charAt(i)){
                stringBuilder.setCharAt(i,Character.toLowerCase(stringBuilder.charAt(i)));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        replaceDots("one.two.three");
    }
}
