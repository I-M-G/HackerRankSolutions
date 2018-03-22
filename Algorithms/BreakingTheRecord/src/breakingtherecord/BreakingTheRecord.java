/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakingtherecord;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class BreakingTheRecord {

    /**
     * @param args the command line arguments
     */
    
    static int[] breakingRecords(int[] score) 
    {
        // Store the number of times Maria breaks the most and least points
        int[] mostLeast = new int[2];
        // Initialize most and least with the first game
        int most = score[0];
        int least = score[0];
        // Total up each set of record breaks
        int totalMost = 0;
        int totalLeast = 0;
        
        // Loop through the scores to find the total amount of record breaks
        for (int i = 0; i < score.length; i++) {
            if (score[i] > most) {
                most = score[i];
                totalMost++;
            }
            else if (score[i] < least) {
                least = score[i];
                totalLeast++;
            }
        }
        
        // Pass off my answers
        mostLeast[0] = totalMost;
        mostLeast[1] = totalLeast;
        
        return mostLeast;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        in.close();
    }
    
    
}
