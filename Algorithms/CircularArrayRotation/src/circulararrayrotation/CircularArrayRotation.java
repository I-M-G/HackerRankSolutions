/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayrotation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

// https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class CircularArrayRotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] results = new int[queries.length];
        ArrayList<Integer> newA = new ArrayList<>();

        /*
        Convert given array to a list
        Find that it is easier to add and remove with a list
        */
        for(int i = 0; i < a.length; i++) {
            newA.add(a[i]);
        }

        
        // Rotate array k amount of times
        for(int i = k; k > 0; k--) {
            
            // Save the last num in the list
            int temp = newA.get(newA.size()-1);
            // Add the last num to the front
            newA.add(0, temp);
            // Remove the last number now that it has been moved
            newA.remove(newA.size()-1);
            
        }
        
        // Return the value of the query postion for each query
        for(int i = 0; i < queries.length; i++) {
            results[i] = newA.get(queries[i]);
        }
        
        return results;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            queries[i] = scanner.nextInt();
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            if (i != result.length - 1) {
                System.out.println("");
            }
        }

        scanner.close();
    }
    
}
