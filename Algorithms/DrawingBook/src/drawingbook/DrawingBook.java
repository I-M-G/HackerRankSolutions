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
        int fromFront = 0;
        int fromBack = 0;
        
        for (int i = 1; i <= n; i+=2) {
            if (p == 1) {
                break;
            }
            if (i >= p) {
                break;
            }
            
            fromFront++;
        }
        
        for (int i = n; i >= 1; i-=2) {
            if (n % 2 != 0 && p == n-1) {
                break;
            }
            
            if (i <= p) {
                break;
            }
            
            fromBack++;
        }
        
        
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
