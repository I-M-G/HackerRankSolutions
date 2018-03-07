/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicshop;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Set default value if we can not buy anything
        int spent = -1;
        
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                // Stores the combined value that we can check
                int temp = keyboards[i] + drives[j];
                
                // Update spent if we have enough money
                // And the amount is the max we can spend
                if (temp <= s && temp >= spent) {
                    spent = temp;
                }
            }
        }
        
        // Returns the defauly value unless we can buy something
        return spent;
    }
    
    // Main was provided
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
    
}
