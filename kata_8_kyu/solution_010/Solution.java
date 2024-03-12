package com.codewars.kata_8_kyu.solution_010;
/*  Grasshopper - Personalized Message
DESCRIPTION:
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

Use conditionals to return the proper message:

case	return
name equals owner	'Hello boss'
otherwise	'Hello guest'

 */
public class Solution {
    static String greet(String name, String owner) {
        return (name.equals(owner))?"Hello boss": "Hello guest";
    }
}
