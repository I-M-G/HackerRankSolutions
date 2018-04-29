/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingvalleys;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
        int valleys = 0;
        int elevation = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int previousElevation = elevation;
            
            if (s.charAt(i) == 'U') {
                elevation++;
            }
            
            if (s.charAt(i) == 'D') {
                elevation--;
            }
            
            if (previousElevation < 0 && elevation >=0) {
                valleys++;
            }
        }
        
        
        return valleys;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
    
}
