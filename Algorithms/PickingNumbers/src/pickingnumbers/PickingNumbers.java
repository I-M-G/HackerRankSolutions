/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickingnumbers;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class PickingNumbers {
    
    static int pickingNumbers(int[] a) {
        int max = 0;
        
        for (int i = 0; i < a.length; i++) {
            int tempMax = 0;
            
            for (int j = 0; j < a.length; j++) {
                
                if (a[i] - a[j] <= 1 && a[i] - a[j] >= 0) {
                    tempMax++;
                }
                
                if (tempMax >= max) {
                    max = tempMax;
                }
            }
            tempMax = 0;
        }
        
        return max;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
    
}
