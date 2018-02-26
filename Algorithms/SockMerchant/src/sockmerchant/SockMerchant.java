/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockmerchant;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        
        // Track our matching socks
        int pairs = 0;
        // Sort the pairs. Sorted so that we can better check for pairs
        Arrays.sort(ar);

        for (int i = 0; i < ar.length - 1; i += 2) {
            
            // If we match increase pairs
            // Else decrease i so that we do not jump a pair
            if (ar[i] == ar[i + 1]) {
                pairs++;
            } else {
                i--;
            }

        }
        
        // Return our answer
        return pairs; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
