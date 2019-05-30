/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweentwosets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 * @link https://www.hackerrank.com/challenges/between-two-sets/problem
 */

public class BetweenTwoSets {

    /**
     * @param a First set of numbers to compare
     * @param b Second set of numbers to compare
     * @return Number of integers that are considered to between a and b
     */
    static int getTotalX(int[] a, int[] b) {
        int totalX = 0;
        ArrayList<Integer> possibleValues = new ArrayList<>();

        int upperLimitValue = b[0]; // No need to check above the smallest value of 'b'
        for (int i = 0; i < a.length; i++) {
            for (int j = a[a.length-1]; j <= upperLimitValue; j++) {
                // Find the numbers that are evenly divided for each value in
                // 'a' and not in the list already.
                if(j % a[i] == 0 && !possibleValues.contains(j)) {
                    possibleValues.add(j);
                }
            }
        }
        
        // Go through and remove values that are invlaid? Ex. 6,10,14
        // Setting values to -1 if they are invalid
        for (int i = possibleValues.size()-1; i >= 0; i--) {
            for (int j = 0; j < a.length; j++) {
                if(possibleValues.get(i) % a[j] != 0) {
                    possibleValues.set(i, -1);
                }
            }
        }
        
        // See if any numbers in possibleValues divied evenly into 'b'
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < possibleValues.size(); j++) {
                // Change values to -1 if not evenly divided
                if(possibleValues.get(j) != -1) {
                    if(b[i] % possibleValues.get(j) != 0) {
                        possibleValues.set(j, -1);
                    }
                }
            }
        }
        
        // Total up the remaining values not -1
        for (int i = 0; i < possibleValues.size(); i++) {
            if(possibleValues.get(i) != -1) {
                totalX++;
            }
        }
        
        return totalX;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(total);
    }
    
}
