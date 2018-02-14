/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substringcomparisons;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = s.substring(0, k);
        // largest = s.substring(0, k);
        
        for (int i = 0; i < s.length()-k; i++) {
            
            if ( s.substring(i, k).compareTo(smallest) < 0 ) {
                System.out.println(s.substring(i, k));
                smallest = s.substring(i, k);
            }
            
        }
        
        
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
    
}
