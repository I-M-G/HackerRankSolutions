/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingbook;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class DrawingBook {

    static int solve(int n, int p){
        // Complete this function
        
        // Track the page turns from first and last page
        int fromFront = 0;
        int fromBack = 0;
        
        for (int i = 1; i <= n; i+=2) {
            // If we need page one we do not need to turn the page
            if (p == 1) {
                break;
            }
            
            // If we've reach the page break and stop counting
            if (i >= p) {
                break;
            }
            
            fromFront++;
        }
        
        // Probably a better way to do this
        for (int i = n-1; i >= 1; i-=2) {
            // If the last page is odd check if the other page  
            // is the page we need
            if (n % 2 != 0 && p == n-1) {
                break;
            }
            // If it is even is the page we need on the other side
            else if (n % 2 == 0 && p == n-1) {
                fromBack++;
                break;
            }
            
            // If we've reach the page break and stop counting
            if (i <= p) {
                break;
            }
            
            fromBack++;
        }
        
        // Return the smallest amount of page turns
        if (fromFront < fromBack) {
            return fromFront;
        }
        else {
            return fromBack;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
    
}
