/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thehurdlerace;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class TheHurdleRace {

    /**
     * @param args the command line arguments
     */
    
    static int hurdleRace(int k, int[] height) {
        // Amount of doses to jump the highest hurdle
        int doses = 0;
        
        /*
        Alternative way to pick out tallest hurdle
        for (int i = 0; i < height.lenght; i++) {
            int tallest = 0;
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }
        */
        
        // Sort height to pick out tallest hurdle
        Arrays.sort(height);
        
        int maxHeight = height[height.length-1];
        
        // If we need doses set the amount else return zero
        if (maxHeight - k > 0) {
            doses = maxHeight - k;
        }
        
        // for (int i = 0; i < height.length; i++) {
        //     System.out.println(height[i]);
        // }
        // System.out.println("^^^^^");
        
        return doses;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            int heightItem = scanner.nextInt();
            height[i] = heightItem;
        }

        System.out.println(hurdleRace(k, height));

        scanner.close();
    }
    
}
