package com.codewars.kata_8_kyu.solution_042;

/*  Vowel remover
Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

Examples
"hello"     -->  "hll"
"codewars"  -->  "cdwrs"
"goodbye"   -->  "gdby"
"HELLO"     -->  "HELLO"
don't worry about uppercase vowels
y is not considered a vowel for this kata

 */
public class Solution {
    public static String shortcut(String input) {
        return input.replaceAll("[a,e,i,o,u]","");
//            StringBuilder result = new StringBuilder();
//            for (int i = 0; i < input.length(); i++) {
//                if (wovel(input.charAt(i))) {
//                    result.append(input.charAt(i));
//                }
//            }
//            return result.toString();
        }

//        public static boolean wovel(char c) {
//            char[] wovel = {'a', 'e', 'i', 'o', 'u'};
//
//            for (char ch : wovel) {
//                if (ch == c) return false;
//            }
//            return true;
//        }

}
