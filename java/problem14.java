/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stepana.euler;

/**
 *
 * @author antonstepan
 */
public class problem14 {
 
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        // CODE STARTS HERE
        
        long max = 1;
        int result = 1;
        
        for (int i = 500000; i < 1000000; i++) {
            System.out.println("Aktuell: i = "+i + " und max= "+max);
            long rofl = getChain(i);
            if (max < rofl) { 
                max = rofl;
                result = i;       
            }
        }
        
        System.out.println(max);
        System.out.println(result);
        // CODE ENDS HERE
        long end = System.currentTimeMillis();
        long dauer = end - start;
        System.out.println("Dauer: " + dauer + "ms <=> " + dauer/1000 + "sek" );
    }
    
    
    public static int getChain(long n) {
        
        int length = 1;
        while (n != 1) {
            if (n%2 == 0) { 
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            length++;
        }
        return length;
    }
}