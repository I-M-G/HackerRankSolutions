/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfviewer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian <https://github.com/I-M-G>
 */
public class PDFviewer {

    /**
     * @param args the command line arguments
     */
    
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        // abcdefghijklmnopqrstuvwxyz
        int area = 0; // Final area to be returned
        int height = 0; // Store talled letter to calculate area
        
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[] indexes = alpha.toCharArray();
        ArrayList<Integer> letterHeights = new ArrayList<>();
        
        
        // for(char i : indexes) {
        //     System.out.println(i);
        // }
        
        // area = tallest char height * word.length
        
        // Add the heights for the given word to the list
        for (int i = 0; i < word.length(); i++) {
            
            for (int j = 0; j < indexes.length; j++){
                if (word.charAt(i) == indexes[j]) {
                    letterHeights.add(j);
                    
                }
            }
            
        }
        
        // Get the max height
        for (int i = 0; i < h.length; i++) {
            int temp = 0;
            for (int j = 0; j < letterHeights.size(); j++) {
                if (height < h[letterHeights.get(j)]) {
                    height = h[letterHeights.get(j)];
                }
            }
        }
        
        // for (int i : letterHeights) {
        //     System.out.println(i);
        // }
        
        // System.out.println("Max Height: " + height);
        
        area = height * word.length();
        
        return area;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        scanner.close();
        
        System.out.println(result);
    }
    
}
