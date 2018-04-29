/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcscakewalk;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class MarcsCakewalk {

    static long marcsCakewalk(int[] calorie) {
        long miles = 0;
        long total = 0;
        int count = 0;
        
        Arrays.sort(calorie);
        
        for (int i = calorie.length-1; i >= 0; i--) {
            miles = total + (calorie[i] * (long) Math.pow(2, count));
            total = miles;
            count++;
        }
        
        return miles;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }
    
}
