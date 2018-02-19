/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrams;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ret = false;
        
        // Pass each char to an array
        // Challenge is case-insensitive
        char[] aSort = a.toLowerCase().toCharArray();
        char[] bSort = b.toLowerCase().toCharArray();
        
        // Sort the char 
        Arrays.sort(aSort);
        Arrays.sort(bSort);
        
        String newA = "";
        String newB = "";
        
        // Pass the sorted char back to a new string
        for (int i = 0; i < aSort.length; i++) {
            newA += aSort[i];
        }
        
        for (int i = 0; i < bSort.length; i++) {
            newB += bSort[i];
        }
        
        /*
        In order for the string to be considered an anagram
        They must have the same letters
        Now that the words are sorted we can check that they are the same
        */
        if (newA.equals(newB)) {
            ret = true;
        }
        
        return ret;
    }
    
    // Main was provided
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String a = in.next();
	String b = in.next();
	in.close();
		
	boolean ret = isAnagram(a, b);
	System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
    
}
