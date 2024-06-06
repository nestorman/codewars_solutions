package com.codewars.kata_8_kyu.solution_055;
import java.util.Random;
/*  Color Ghost
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class Solution {
    final String [] colors = {"white" , "yellow" , "purple" , "red"};
    public String getColor(){
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
