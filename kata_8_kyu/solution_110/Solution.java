package com.codewars.kata_8_kyu.solution_110;

/*  String Templates - Bug Fixing #5
Oh no! Timmy hasn't followed instructions very carefully and forgot how to use the new String Template feature, Help Timmy with his string template so it works as he expects!
      assertEquals(Kata.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
      assertEquals(Kata.buildString("Cheese","Milk"),"I like Cheese, Milk!");
      assertEquals(Kata.buildString("Chocolate"),"I like Chocolate!");

 */
public class Solution {
    public static String buildString(String... args) {
        return "I like" + String.join(", ", args) + "!";
    }
}
