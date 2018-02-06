/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastringreverse;

import java.util.*;

/**
 *
 * @author IMG
 */
public class JavaStringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. */
        Scanner in = new Scanner(System.in);
        String A = in.next();
        
        String B = "";
        ArrayList<Character> list = new ArrayList<>();
        
        for (int i = A.length(); i > 0; i--) {
            list.add(A.charAt(i-1));
        }
        
        for (int i = 0; i < list.size(); i++) {
            B += list.get(i);
        }
        
        if ( B.equals(A) ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
}
