/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingtheleaderboard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
