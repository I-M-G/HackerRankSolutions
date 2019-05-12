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
        boolean isRunning = true;
        int sticksRemaining = 0; // Can be Remove?
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        ArrayList<Integer> stickHistory = new ArrayList<Integer>();
        
        // Convert to List. Easier to remove elements
        for(int x : arr) {
            sticks.add(x);
        }
        
        
        
        
        // Convert List back to Array
        int[] arrayToReturn = new int[stickHistory.size()];
        for(int i = 0; i < stickHistory.size(); i++) {
            arrayToReturn[i] = stickHistory.get(i);
        }        
        return arrayToReturn;
    }
    
    // For Testing
    private void printSticks(ArrayList<Integer> list, String spacer) {
        for(int stick : list) {
            System.out.print(stick + spacer);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        scanner.close();
    }
}
