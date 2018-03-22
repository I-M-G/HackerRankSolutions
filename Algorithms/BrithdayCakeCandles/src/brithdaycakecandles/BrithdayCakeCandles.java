/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brithdaycakecandles;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

public class BrithdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) 
    {
        // Track the candles that can be blown out
        int totalCandles = 0;
        // Track the tallest candle
        int tallestCandle;
        
        // Sort the array to get the tallest candle
        Arrays.sort(ar);
        tallestCandle = ar[n-1];
        
        // Find the total amount of tallest candles
        for (int i = ar.length-1; i >= 0; i--) {
            if (tallestCandle == ar[i]) {
                totalCandles++;
            }
            else {
                break;
            }
        }
        
        return totalCandles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
    
}
