/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalist;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class JavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Create the list
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Store the list size
        int n = in.nextInt();
        
        // Store the list values
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        
        // Store the number of Insert/Delete queries
        int queries = in.nextInt();
        
        // Update the list based on the given query
        for (int i = 0; i < queries; i++) {
            String queryType = in.next();
            
            if (queryType.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                
                list.add(index, value);
            }
            
            if (queryType.equals("Delete")) {
                int index = in.nextInt();
                
                list.remove(index);
            }
        }
        
        // Output the updated list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    
}
