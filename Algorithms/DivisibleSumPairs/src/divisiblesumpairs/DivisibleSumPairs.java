/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblesumpairs;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Track the divisible pairs
        int totalPairs = 0;
        
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                // Only work on pairs when i < j
                if (i < j) {
                    // Add the pair and check if it evenly divides
                    if ((ar[i]+ar[j]) % k == 0) {
                        totalPairs++;
                    }
                }
            }
        }
        
        return totalPairs;
    }
    
    // Main was given
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
    
}
