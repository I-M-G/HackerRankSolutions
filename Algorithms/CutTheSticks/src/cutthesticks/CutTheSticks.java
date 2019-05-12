/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutthesticks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class CutTheSticks {
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        ArrayList<Integer> stickHistory = new ArrayList<Integer>();
        
        // Convert to List. Easier to remove elements
        for (int x : arr) {
            sticks.add(x);
        }
        
        for (int x = 0; x < sticks.size(); x++) {
            // Update stickHistory
            int count = 0;
            for (int i = 0; i < sticks.size(); i++) {
                if(sticks.get(i) != -1) {
                    count++;
                }
            }
            stickHistory.add(count);
            
            int smallest = 1001;
            // Get the smallest stick that hasn't been changed
            for (int i = 0; i < sticks.size(); i++) {
                if(sticks.get(i) < smallest && sticks.get(i) != -1) {
                    smallest = sticks.get(i);
                }
            }
            
            // Update stick lengths based on smallest
            for (int i = 0; i < sticks.size(); i++) {
                if (sticks.get(i) != -1) {
                    if (sticks.get(i) == smallest) {
                        sticks.set(i, -1);
                    } else {
                        int updatedStickLength = sticks.get(i) - smallest;
                        sticks.set(i, updatedStickLength);
                    }
                }
            }
            
            // Break loop if all array items -1
            int total = 0;
            for (int i = 0; i < sticks.size(); i++) {
                if (sticks.get(i) == -1) {
                    total++;
                }
            }
            if (total == sticks.size()) {
                break;
            }
        }
        
        // Convert List back to Array
        int[] arrayToReturn = new int[stickHistory.size()];
        for (int i = 0; i < stickHistory.size(); i++) {
            arrayToReturn[i] = stickHistory.get(i);
        }        
        return arrayToReturn;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }
}
