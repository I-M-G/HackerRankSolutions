/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingtheleaderboard;

import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbingTheLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Return each placing for each of Alice's scores
        int[] rankings = new int[alice.length];

        /*
        Need a way to track placings and ties.
        If I'm given tying scores I need to know so that I do not increase the 
        placing.
        Ex. Scores of 100,100,50,40,40,20,10 and Alice score of 5.
        Placing would be 6th. 
        
        Currently getting the places without accounting for the duplicate scores
         */
        for (int i = 0; i < alice.length; i++) {
            int place = 1;

            for (int j = 0; j < scores.length; j++) {
                if (alice[i] >= scores[j]) {
                    rankings[i] = place;
                } else if (alice[i] < scores[j]) {
                    place++;
                    rankings[i] = place;
                }
            }

            place = 1;
        }

        return rankings;
    }

    // Provide Code with changes for using locally
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int scoresCount = scanner.nextInt();

        int[] scores = new int[scoresCount];

        for (int i = 0; i < scoresCount; i++) {
            scores[i] = scanner.nextInt();
        }

        int aliceCount = scanner.nextInt();

        int[] alice = new int[aliceCount];

        for (int i = 0; i < aliceCount; i++) {
            alice[i] = scanner.nextInt();
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }

}
