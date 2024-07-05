package com.codewars.kata_8_kyu.solution_079;

/*  Welcome to the City
Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array
 consisting of one or more values that should be joined together with one space between each, and the length of
 the name array in test cases will vary.

Example:

['John', 'Smith'], 'Phoenix', 'Arizona'
This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!


 */
public class Solution {
    public String sayHello(String[] name, String city, String state) {
        String fullName = String.join(" ", name);
        return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
//        StringBuilder greeting = new StringBuilder("Hello, ");
//        for (int i = 0; i < name.length; i++) {
//            greeting.append(name[i]);
//            if (i < name.length - 1) {
//                greeting.append(" ");
//            }
//        }
//        greeting.append("! Welcome to ").append(city).append(", ").append(state).append("!");
//        return greeting.toString();
    }
}
