package com.codewars.kata_8_kyu.solution_027;
import java.util.HashMap;

/*  Unexpected parsing
Here is a piece of code:

public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status;

        if (isBusy) {
          status = "busy";
        } else {
          status = "available";
        }

        return status;
    }
}
Expected Behaviour
Function should return a dictionary/Object/Hash with "status" as a key, whose value can : "busy" or "available" depending on the truth value of the argument is_busy.

But as you will see after clicking RUN or ATTEMPT this code has several bugs, please fix them.
 */
public class Solution {
    public static HashMap<String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }
}
