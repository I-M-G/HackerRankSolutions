/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;

import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

// https://www.hackerrank.com/challenges/angry-professor/problem

public class AngryProfessor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        boolean cancelClass; // Update based on threshold and arrivals
        int onTime = 0; // How many student are on time

        // If arrival time is negative or zero increase onTime
        for(int i = 0; i < a.length; i++) {
            if(a[i] <= 0) {
                onTime++;
            }
        }

        // Check if we should have class and set class status
        if(onTime >= k) {
            cancelClass = false;
        } else {
            cancelClass = true;
        }

        // Return the class status
        return cancelClass ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    // Modified main to work locally
    public static void main(String[] args) {
        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
//            String[] nk = scanner.nextLine().split(" ");

//            int n = Integer.parseInt(nk[0]);
            int n = scanner.nextInt();

//            int k = Integer.parseInt(nk[1]);
            int k = scanner.nextInt();

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
//                int aItem = Integer.parseInt(aItems[i]);
//                a[i] = aItem;
                a[i] = scanner.nextInt();
            }

            String result = angryProfessor(k, a);
            System.out.println(result);
        }

        scanner.close();
    }
    
}
