package com.codewars.kata_8_kyu.solution_062;
import java.util.HashMap;
import java.util.Map;
/*  Did she say hallo?
You received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?

Write a simple function to check if the string contains the word hallo in different languages.

These are the languages of the possible people you met the night before:

hello - english
ciao - italian
salut - french
hallo - german
hola - spanish
ahoj - czech republic
czesc - polish
Notes

you can assume the input is a string.
to keep this a beginner exercise you don't need to check if the greeting is a subset of word (Hallowen can pass the test)
function should be case insensitive to pass the tests

 */
public class Solution {
    public static boolean validateHello(String greetings){
        Map <String, String> greeting = new HashMap<>();
        greeting.put("hello","english");
        greeting.put("ciao","italian");
        greeting.put("salut","french");
        greeting.put("hallo","german");
        greeting.put("hola","spanish");
        greeting.put("ahoj","czech republic");
        greeting.put("czesc","polish");
        String greetingsToLowerCase = greetings.toLowerCase();
        for(String string :greeting.keySet()){
            if(greetingsToLowerCase.contains(string)){
                return true;
            }
        }
        return false;
    }
}
