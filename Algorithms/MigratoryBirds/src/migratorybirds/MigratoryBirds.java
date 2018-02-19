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

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int type = 0;
        
        ArrayList<Integer> typeOne = new ArrayList<>();
        ArrayList<Integer> typeTwo = new ArrayList<>();
        ArrayList<Integer> typeThree = new ArrayList<>();
        ArrayList<Integer> typeFour = new ArrayList<>();
        ArrayList<Integer> typeFive = new ArrayList<>();
        
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
        
        System.out.println("1 " + typeOne.size());
        System.out.println("2 " + typeTwo.size());
        System.out.println("3 " + typeThree.size());
        System.out.println("4 " + typeFour.size());
        System.out.println("5 " + typeFive.size());
        
        
        // for (int i = 0; i > 5; i++) {
            
        // }
        
        
        
        
        
        return type;
    }
    
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
