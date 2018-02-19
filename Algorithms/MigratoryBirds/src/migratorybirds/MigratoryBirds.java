/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package migratorybirds;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class MigratoryBirds {
    /*
    Not real happy with this solution
    It works, but I am sure there is a better answer
    I would like to come back to this one
    */
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int type = 5;
        // Using this array to store the totals of each list
        int[] totals = new int[5];
        
        // Using lists to store the total of each type
        ArrayList<Integer> typeOne = new ArrayList<>();
        ArrayList<Integer> typeTwo = new ArrayList<>();
        ArrayList<Integer> typeThree = new ArrayList<>();
        ArrayList<Integer> typeFour = new ArrayList<>();
        ArrayList<Integer> typeFive = new ArrayList<>();
        
        // Go through the given array and store each type in the proper list
        for (int i = 0; i < ar.length; i++) {
            
            switch (ar[i]) {
                case 1:
                    typeOne.add(ar[i]);
                    break;
                case 2:
                    typeTwo.add(ar[i]);
                    break;
                case 3:
                    typeThree.add(ar[i]);
                    break;
                case 4:
                    typeFour.add(ar[i]);
                    break;
                case 5:
                    typeFive.add(ar[i]);
                    break;
                default:
                    break;
            }
            
        }
        
//        System.out.println("1 " + typeOne.size());
//        System.out.println("2 " + typeTwo.size());
//        System.out.println("3 " + typeThree.size());
//        System.out.println("4 " + typeFour.size());
//        System.out.println("5 " + typeFive.size());
        
        // Add the size of each list to the array that will check for the most types
        totals[0] = typeOne.size();
        totals[1] = typeTwo.size();
        totals[2] = typeThree.size();
        totals[3] = typeFour.size();
        totals[4] = typeFive.size();
        
        // Store the last value to check the other values
        int temp = totals[totals.length-1];
        
        for (int i = totals.length-1; i >= 0; i--) {
            // If we find a bigger value than the temp
            // Store that value in temp and update the type
            if (totals[i] >= temp) {
                temp = totals[i];
                type = i+1;
            }
        }
        
        return type;
    }
    
    // Main was provided
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
    
}
