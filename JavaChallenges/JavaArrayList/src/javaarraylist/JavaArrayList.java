/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 * @url https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class JavaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<GridItem> rows = new ArrayList<>();
        int n = scan.nextInt(); // Number of rows
        
        // Get the following n rows
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            // Get the first num in the row
            int nextLineTotal = scan.nextInt();

            // Store the row elements in temp
            for (int j = 0; j < nextLineTotal; j++) {
                int val = scan.nextInt();
                temp.add(val);
            }
            
            // Add temp to the global rows list
            rows.add(new GridItem(temp));
        }
        
        // Check the queries against the rows
        int q = scan.nextInt();
        
        for (int i = 0; i < q; i++) {
            int y = scan.nextInt();
            int x = scan.nextInt();
            
            // Print the value if query is  valid
            try {
                // Adjust given query for proper index
                System.out.println(rows.get(y - 1).getRowItemValue(x - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        
    }
    
}