/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class JavaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        
        // Get the number of entries and advance to the next line
        int n = in.nextInt();
        in.nextLine();
        
        // Store the entries in our Map
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phoneNumber = in.nextInt();
            in.nextLine();
            
            map.put(name, phoneNumber);
        }
        
        // Check if the query is vaild. Then print the correct output
        while(in.hasNext()) {
            String query = in.nextLine();
            if (map.containsKey(query)) {
                System.out.println(query + "=" + map.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        in.close();
    }

}
