/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.of.the.programmer;

import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class DayOfTheProgrammer {

    /**
     * @param args the command line arguments
     */
    
    static String solve(int year){
        // Complete this function
        
        // These dates remain the same for each leap/non-leap years
        // Return these if it is not 1918
        String leapYr = "12.09.";
        String nonLeapYr = "13.09.";
        
        if (year <= 1917) {
            
            if (year % 4 == 0) {
                return leapYr + year;
            }
            else {
                return nonLeapYr + year;
            }
            
        }
        else if (year == 1918) {
            // 1918 lost 13 days
            return "26.09." + year;
        }
        else {
            // Gregorian calendar leap year:
            // Divisible by 400 or Divisible by 4 and not by 100
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return leapYr + year;
            }
            else {
                return nonLeapYr + year;
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
    
}
