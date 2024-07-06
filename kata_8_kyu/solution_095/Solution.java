package com.codewars.kata_8_kyu.solution_095;
/*  Total amount of points
Our football team has finished the championship.

Our team's match results are recorded in a collection of strings. Each match is represented by a string in the format "x:y",
 where x is our team's score and y is our opponents score.

For example: ["3:1", "2:2", "0:1", ...]

Points are awarded for each match as follows:

if x > y: 3 points (win)
if x < y: 0 points (loss)
if x = y: 1 point (tie)
We need to write a function that takes this collection and returns the number of points our team (x) got in the championship by the rules given above.

Notes:

our team always plays 10 matches in the championship
0 <= x <= 4
0 <= y <= 4

 */
public class Solution {
    public static int points(String[] games) {
        int pointsSum = 0;
        for(String s: games){
            String [] score = s.split(":");
            int ourScore = Integer.parseInt(score[0]);
            int opponentsScore = Integer.parseInt(score[1]);
            pointsSum += (ourScore > opponentsScore) ? 3 : (ourScore < opponentsScore) ? 0 : 1 ;
        }
//        int pointsSum = 0;
//        for (int i = 0; i < games.length; i++) {
//            int ourScore = Integer.parseInt(String.valueOf(games[i].charAt(0)));
//            int opponentsScore = Integer.parseInt(String.valueOf(games[i].charAt(2)));
//            pointsSum += (ourScore > opponentsScore) ? 3 : (ourScore < opponentsScore) ? 0 : 1 ;
//        }
//        System.out.println(pointsSum);
        return pointsSum;
    }

    public static void main(String[] args) {
        points(new String[]
                {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});
    }
}
