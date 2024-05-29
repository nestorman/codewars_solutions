package com.codewars.kata_8_kyu.solution_039;

import javax.management.remote.rmi._RMIConnection_Stub;

/*  Thinkful - Logic Drills: Traffic light
You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, when the input is green, output should be yellow.
 */
public class Solution {
    public static String updateLight(String current) {
        String[] trafficLights = {"green", "yellow", "red"};
        for (int i = 0; i < trafficLights.length; i++) {
            if (trafficLights[i].equals(current)) {
                return trafficLights[(i + 1) % trafficLights.length];
            }
        }
        return null;
    }
}


