/*
 * To change this license header, choose License Headers scan Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template scan the editor.
 */
package catsandmouse;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class CatsAndMouse {
    
    static String catAndMouse(int x, int y, int z) {
        // Return these values based on the outcome
        String catA = "Cat A";
        String catB = "Cat B";
        String mouse = "Mouse C";
        
        // Get each cats distance to the mouse
        int aDistance = Math.abs(x - z);
        int bDistance = Math.abs(y - z);
        
        // The closer cat gets returned
        // Equal distance and mouse gets returned
        if(aDistance < bDistance) {
            return catA;
        }
        else if (aDistance > bDistance) {
            return catB;
        }
        else {
            return mouse;
        }
    }
    
    // Provided code - Modified to not use BufferedWriter
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = Integer.parseInt(scan.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scan.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0].trim());

            int y = Integer.parseInt(xyz[1].trim());

            int z = Integer.parseInt(xyz[2].trim());

            String result = catAndMouse(x, y, z);
            
            System.out.println(result);
        }
    }
    
}
