/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingtheleaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 * 
 */

public class ClimbingTheLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Return each placing for each of Alice's scores
        int[] rankings = new int[alice.length];
        
        ArrayList<Integer> newScores = new ArrayList<>();
        
         // Need to remove duplicate in scores
        for (int i = 0; i < scores.length; i++) {
            
            if(!newScores.contains(scores[i])) {
                newScores.add(scores[i]);
            }
        }
        
        
        // Removing duplicates in scores should allow me place Alice's scores
        // correctly.
        for (int i = 0; i < alice.length; i++) {
            int place = 1;

            for (int j = 0; j < newScores.size(); j++) {
                if (alice[i] >= newScores.get(j)) {
                    rankings[i] = place;
                } else if (alice[i] < newScores.get(j)) {
                    place++;
                    rankings[i] = place;
                }
            }

            place = 1;
        }

        return rankings;
    }

    // Provide Code with changes for using locally
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int scoresCount = SCANNER.nextInt();

        int[] scores = new int[scoresCount];

        for (int i = 0; i < scoresCount; i++) {
            scores[i] = SCANNER.nextInt();
        }

        int aliceCount = SCANNER.nextInt();

        int[] alice = new int[aliceCount];

        for (int i = 0; i < aliceCount; i++) {
            alice[i] = SCANNER.nextInt();
        }
        
        
        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        SCANNER.close();
    }

}
