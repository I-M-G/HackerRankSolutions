/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleandorange;

import java.util.*;

/**
 *
 * @author IMG
 */
//https://www.hackerrank.com/challenges/apple-and-orange/problem

public class AppleAndOrange {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        // Complete this function
        int[] hits = new int[2]; // Holds apple and orange hits
        
        // Track the apple and orage hits
        int appleHit = 0;
        int orangeHit = 0;
        
        // Calculate the distance for A
        int minDistA = s - a;
        int maxDistA = t - a;
        // Calculate the distance for B
        int minDistB = t - b;
        int maxDistB = s - b;
        
        for (int i = 0; i < apple.length; i++) {
            // If the apple is within the min and max distance, increase apple hit
            if(apple[i] >= minDistA && apple[i] <= maxDistA) {
                appleHit++;
            }
        }
        
        for (int i = 0; i < orange.length; i++) {
            // If the orange is within the min and max distance, increase orange hit
            if (orange[i] <= minDistB && orange[i] >= maxDistB) {
                orangeHit++;
            }
        }
        
        // Store the total hits in an array to be returned
        hits[0] = appleHit;
        hits[1] = orangeHit;
        
        return hits;
    }
    
    // The main method was provided
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
    
}
