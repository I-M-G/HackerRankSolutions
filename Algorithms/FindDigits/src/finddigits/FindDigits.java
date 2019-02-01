/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddigits;

import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

// https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        // How many single digits in n evenly divide n
        int divisorCount = 0;
        
        // Convert n to a string so we can split out the needed nums
        String strNum = Integer.toString(n);
        char[] numSplit = strNum.toCharArray();

        // Check each num in n
        for(int i = 0; i < numSplit.length; i++) {
            int divisor = Character.getNumericValue(numSplit[i]);
            
            // Can't divide by zero, so don't check it if we have one
            if(divisor != 0) {
                // If the digit evenly divides n increase the count
                if(n % divisor == 0) {
                    divisorCount++;
                }
            }
        }

        // Return our found count
        return divisorCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    // Main modified for local use
    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int result = findDigits(n);
            System.out.println(result);

        }

        scanner.close();
    }
    
}
