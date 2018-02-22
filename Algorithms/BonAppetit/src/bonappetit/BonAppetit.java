/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class BonAppetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        int charged = in.nextInt();
        
        int sum = 0; // Used to calculate total and Anna's share
        
        for (int i = 0; i < arr.length; i++) {
            // Add up the total for the bill
            sum += arr[i];
        }
        
        /*
        The new sum is calculated as the total bill
        minus the item Anna didn't eat divided by 2
        This gives us the amount Anna should have been charged
        */
        sum = (sum - arr[k])/2;
        
        // Was the split correct or what was the difference
        if (charged == sum) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(charged - sum);
        }
    }
    
}
