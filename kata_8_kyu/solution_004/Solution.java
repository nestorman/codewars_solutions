package com.codewars.kata_8_kyu.solution_004;
/*  Ghost code?!
DESCRIPTION:
Trollencio changed my code! can you fix it? My name is not "dumb!" o( TT_TT )o

Instructions: Fix the code

Input
Javatlacati
Output
Hello my name is Javatlacati
Input
""
Output
Hello world!

public class GhostCode{
  public static String helloName(final String name){
  // \u000d name="dumb";
    if(name == null || name.equals(""))
      return "Hello world!";
    else
      return "Hello my name is " + name;
  }
}
 */
public class Solution {

        public static String helloName(final String name){
            // \u000d // name="dumb";
            if(name == null || name.equals(""))
                return "Hello world!";
            else
                return "Hello my name is " + name;
        }

}
