/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautifuldayatthemovies;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class BeautifulDayAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0; // Track amount of beautiful days
        
        // Store days to test and their reverse
        ArrayList<Integer> days = new ArrayList<>();
        ArrayList<Integer> reversedDays = new ArrayList<>();

        // Fill array with missing days based on given start and end
        // Also add given start and end to array
        days.add(i);
        for(int x = (i+1); x < j; x++) {
            days.add(x);
        }
        days.add(j);

        //TESTING
        // for(int x = 0; x < days.size(); x++) {
        //     System.out.println(days.get(x));
        // }

        for(int x = 0; x < days.size(); x++) {
            // Holds string value of the num being worked on
            String reversedNum = "";
            // Get the num to be worked on as a string
            String num = days.get(x).toString();
            // Break num into char array
            char[] c = num.toCharArray();
            
            // Loop backwards to store the reversed num
            for(int z = c.length-1; z >= 0; z--) {
                reversedNum += c[z];
            }
            
            // Convert the string num back to an int. Ex: 20 is now 2
            reversedDays.add(Integer.parseInt(reversedNum));
        }

        //TESTING
        // for(int x = 0; x < reversedDays.size(); x++) {
        //     System.out.println(reversedDays.get(x));
        // }


        // is it a beautiful day?
        for(int x = 0; x < days.size(); x++) {
            int numerator = Math.abs(days.get(x) - reversedDays.get(x));
            /* 
            It is a beautiful day if original num minus revered num 
            divided by given k has no remainder
            */
            if(numerator % k == 0) {
                beautifulDays++;
            }
            
        }
        
        // Return amount of beautiful days
        return beautifulDays;
    }

    private static final Scanner scanner = new Scanner(System.in);

    // Main modified for local use
    public static void main(String[] args) {

        int i = scanner.nextInt();

        int j = scanner.nextInt();

        int k = scanner.nextInt();

        int result = beautifulDays(i, j, k);
        
        System.out.println(result);

        scanner.close();
    }
    
}
