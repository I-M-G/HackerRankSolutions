/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */

// https://www.hackerrank.com/challenges/java-date-and-time/problem

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("MM DD YYYY");
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        
        String result = null;
        result = Result.findDay(month, day, year);
        System.out.println(result);
        
    }
    
}
