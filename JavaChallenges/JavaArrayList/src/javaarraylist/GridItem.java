/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.*;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class GridItem {
    // The values of the row
    public ArrayList<Integer> xs = new ArrayList<>();
    
    // Construct a row when class item is created
    GridItem(ArrayList<Integer> xs) {
        this.xs = xs;
    }
    
    // Return x value for the queried row
    public int getRowItemValue(int val) {
        return this.xs.get(val);
    }
    
    // Print a value for testing
    public void displayRowValues() {
        for (int i = 0; i < xs.size(); i++) {
            System.out.println(xs.get(i));
        }
    }
}
