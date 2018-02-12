/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradingstudents;

import java.util.*;

/**
 *
 * @author IMG
 */
public class GradingStudents {
//    https://www.hackerrank.com/challenges/grading/problem

    /**
     * @param args the command line arguments
     */
    
    static int[] solve(int[] grades){
        // Complete this function
        
        // New array to store the updated grades
        int[] newGrades = new int[grades.length];
        
        for (int i = 0; i < grades.length; i++) {
            // If the grade is less than 38 we do not round up
            // We do not round up is the grade is less than half way to
            // the next interval of 5.
            if(grades[i] < 38 || grades[i] % 5 <= 2) {
                newGrades[i] = grades[i];
            }
            // If the grade is more than half way we round up
            else if (grades[i] % 5 == 3) {
                // If the remainder is 3 we increase the grade by 2
                newGrades[i] = grades[i]+2;
            }
            else if (grades[i] % 5 == 4) {
                // If the remainder is 4 we increase the grade by 1
                newGrades[i] = grades[i]+1;
            }
        }
        
        // Return our new grades
        return newGrades;
        
    }
    
    public static void main(String[] args) {
        // Provided Code
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
