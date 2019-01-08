/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.util.Calendar;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class Result {
    
    public static String findDay(int month, int day, int year) {
        // Putting days in an array makes it easier to find the actual day
        String[] days = new String[] {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        // Create and instance and set it to the given date
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        
        // Get the day of the week as an int
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        // Return the String value of the day
        return days[dayOfWeek - 1];
    }
}
